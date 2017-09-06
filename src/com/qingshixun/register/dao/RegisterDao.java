package com.qingshixun.register.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.qingshixun.register.model.User;
import com.qingshixun.register.utils.JDBCUtils;

public class RegisterDao {

	/**
	 * 注册时查询数据库
	 * 
	 * @param user
	 *            传参数
	 * @return 返回User对象
	 */
	public static User query(User user) {
		User oldUser = null;
		Connection connection = null;

		// 定义sql语句的执行对象
		PreparedStatement query = null;

		// 定义查询返回的结果集合
		ResultSet resultSet = null;
		connection = JDBCUtils.getConnection();
		try {
			// 准备SQL语句
			String sql = "SELECT " + "username " + "FROM " + "u_register WHERE username = ?";
			query = connection.prepareStatement(sql);
			query.setString(1, user.getUsername());
			ResultSet result = query.executeQuery();

			while (result.next()) {
				oldUser = new User();
				oldUser.setUsername(result.getString("username"));
			}

			// 关闭连接
			JDBCUtils.close(resultSet, query, connection);
		} catch (SQLException e) {
			System.out.println("获取连接失败");
			e.printStackTrace();
		}
		return oldUser;
	}

	/**
	 * 登录时查询数据库
	 * 
	 * @param user
	 *            传参数
	 * @return 返回User对象
	 */
	public static User loginQuery(User user) {
		User oldUser = null;
		Connection connection = null;

		// 定义sql语句的执行对象
		PreparedStatement query = null;

		// 定义查询返回的结果集合
		ResultSet resultSet = null;
		connection = JDBCUtils.getConnection();
		try {
			// 准备SQL语句
			String sql = "SELECT " + "username,password " + "FROM " + "u_register WHERE username = ? AND password = ?";
			query = connection.prepareStatement(sql);
			query.setString(1, user.getUsername());
			query.setString(2, user.getPassword());
			ResultSet result = query.executeQuery();

			while (result.next()) {
				oldUser = new User();
				oldUser.setUsername(result.getString("username"));
				oldUser.setPassword(result.getString("password"));
			}
		} catch (SQLException e) {
			System.out.println("获取连接失败");
			e.printStackTrace();
		} finally {
			// 关闭连接
			JDBCUtils.close(resultSet, query, connection);
		}

		return oldUser;
	}

	/**
	 * 新增数据
	 * 
	 * @param user
	 *            传参数
	 * @return 返回一个int型的值，如果值为0，则影响行数为0，说明新增失败，如果不为0，则新增成功
	 * @throws SQLException
	 *             抛出异常
	 */
	public static int insert(User user) throws SQLException {
		int result = 0;
		// 定义数据库的链接
		Connection connection = null;

		// 定义sql语句的执行对象
		PreparedStatement insertStatement = null;

		// 定义查询返回的结果集合
		ResultSet resultSet = null;
		connection = JDBCUtils.getConnection();

		// 准备SQL语句
		StringBuffer insertSQL = new StringBuffer();
		insertSQL.append("INSERT INTO u_register (username,password,affirmPassword,email,sex,profession,hobby)");
		insertSQL.append("VALUES (?,?,?,?,?,?,?)");
		insertStatement = connection.prepareStatement(insertSQL.toString());
		insertStatement.setString(1, user.getUsername());
		insertStatement.setString(2, user.getPassword());
		insertStatement.setString(3, user.getAffirmPassword());
		insertStatement.setString(4, user.getEmail());
		insertStatement.setString(5, user.getSex());
		insertStatement.setString(6, user.getProfession());
		insertStatement.setString(7, user.getHobby());

		// 执行SQL语句
		result = insertStatement.executeUpdate();

		// 关闭连接
		JDBCUtils.close(resultSet, insertStatement, connection);
		return result;
	}
}
