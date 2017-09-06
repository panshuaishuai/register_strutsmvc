package com.qingshixun.register.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCUtils {

	// jdbc 驱动
	private static String driver = "com.mysql.jdbc.Driver";

	// 连接数据库的 url
	// private String url = "jdbc:mysql://localhost:3306/jdbc";
	private static String url = "jdbc:mysql://127.0.0.1:3306/user-register";

	// 数据库用户名
	private static String user = "root";

	// 数据库密码
	private static String password = "root18798379755";

	/**
	 * 获得数据库连接
	 * 
	 * @return 数据库连接
	 */
	public static Connection getConnection() {
		Connection connection = null;

		// 注册驱动
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// 创建数据库连接异常的处理
			System.out.println("未找到驱动包");
			e.printStackTrace();
		}
		// 获取连接
		catch (SQLException e) {
			// 创建数据库连接异常的处理
			System.out.println("获取连接失败");
			e.printStackTrace();
		}
		return connection;
	}

	/**
	 * 关闭数据库连接，释放资源
	 * 
	 * @param resultSet
	 *            ResultSet
	 * @param statement
	 *            Statement
	 * @param connection
	 *            Connection
	 * @throws SQLException
	 */
	public static void close(ResultSet resultSet, PreparedStatement statement, Connection connection) {
		// 如果 resultSet 不为 null，关闭 resultSet
		try {
			if (resultSet != null) {
				resultSet.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 如果 statement 不为 null，关闭 statement

		try {
			if (statement != null) {
				statement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		// 如果 connection 不为 null，关闭 connection

		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
