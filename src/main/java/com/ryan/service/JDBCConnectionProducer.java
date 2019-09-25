package com.ryan.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

public class JDBCConnectionProducer
{
	@Produces 
	private Connection createConnection()
	{
		Connection con = null;
		try
		{
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver").newInstance();
			
			String path = "C:\\Users\\Ryan\\Documents\\productdb.accdb";
			String url = "jdbc:ucanaccess://" + path;
			
			con = DriverManager.getConnection(url);
		}
		catch (Exception e)
		{
			System.out.println("Error: " + e);
		}
		return con;
	}
	
	@SuppressWarnings("unused")
	private void closeConnection(@Disposes Connection con) throws SQLException
	{
		con.close();
	}

}
