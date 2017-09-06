package com.qingshixun.register.service;

import java.sql.SQLException;

import com.qingshixun.register.dao.RegisterDao;
import com.qingshixun.register.model.User;

public class RegisterService {

	private RegisterDao dao = new RegisterDao();

	/**
	 * 注册的方法判断
	 * 
	 * @param user
	 *            传入参数
	 * @return 返回true或false，如果返回true，则注册成功，如果返回false，则用户已存在或注册操作有误失败
	 * @throws SQLException
	 *             抛出异常
	 */
	public int register(User user) throws SQLException {
		// 根据用户名查询用户信息
		User queryUser = dao.query(user);

		// 判断用户是否已注册
		if (queryUser != null) {
			// 用户已存在
			return 0;
		} else if (user.contrastPassword()) {
			// 用户未注册，可以新增该用户
			int insertUser = dao.insert(user);
			if (insertUser != 0) {
				// 注册成功
				return -1;
			} else {
				// 注册操作有误
				return 1;
			}
		} else {
			// 密码不同，注册失败
			return 2;
		}
	}

	/**
	 * 用户登录的判断方法
	 * 
	 * @param user
	 *            传参数
	 * @return 返回true或false，如果返回true，则用户已存在，如果返回false，则用户未注册，需要注册该用户
	 * @throws SQLException
	 *             抛出异常
	 */
	public boolean login(User user) throws SQLException {
		// 根据用户名查询用户信息
		User queryUser = dao.loginQuery(user);

		// 判断用户是否存在
		if (queryUser != null) {
			// 用户已存在
			return true;
		} else {
			// 用户未注册，需要注册该用户
			return false;
		}
	}
}
