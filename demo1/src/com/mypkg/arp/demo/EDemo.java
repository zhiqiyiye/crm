package com.mypkg.arp.demo;

import java.sql.Connection;
import java.sql.SQLException;

public class EDemo {

	public static void main(String[] args) {
		System.out.println("第一次使用2016");
        Connection conn=DBUtil.getConnection();
        try {
			System.out.println(conn.isClosed());
			System.out.println("连接成功");
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
