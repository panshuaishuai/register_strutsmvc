package com.qingshixun.register.action;

import java.sql.SQLException;

import com.qingshixun.register.model.User;
import com.qingshixun.register.service.RegisterService;

public class RegisterAction {

	private RegisterService service = new RegisterService();

	private User user;
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * 用户注册
	 * 
	 * @return 返回一个字符串，如果返回success，则注册成功，如果返回fail，则注册失败
	 * @throws SQLException
	 *             异常的抛出
	 */
	public String registerResult() throws SQLException {
		if (service.register(user) == -1) {
			return "success";
		} else if (service.register(user) == 0) {
			message = "此用户已存在 ！";
			return "fail";
		} else if (service.register(user) == 2) {
			message = "密码不同，注册失败 ！";
			return "fail";
		} else {
			message = "注册操作有误 ！";
			return "fail";
		}
	}

	/**
	 * 用户登录
	 * 
	 * @return 返回一个字符串，如果返回success，则注册成功，如果返回fail，则注册失败
	 * @throws SQLException
	 *             异常抛出
	 */
	public String loginResult() throws SQLException {
		if (service.login(user) == true) {
			message = "你真是太厉害了！";
			return "success";
		} else {
			message = "此用户不存在或密码输入有误,请确认是否已注册或密码是否正确！";
			return "fail";
		}
	}
}
