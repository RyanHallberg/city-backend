package com.ryan.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class JDBCPingService
{
	@Inject
	private Connection con;
	
	public String ping() throws SQLException
	{
		String content = "";
		try
		{
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Product");
			ResultSetMetaData rsmd = rs.getMetaData();
			
			while (rs.next())
			{
				content += (rsmd.getColumnName(1) +"\t\t"
							+ rsmd.getColumnName(2) + "\t\t\n");
				content += (rs.getString(1)) + " ";
				content += (rs.getString(2) + " ");
				content += (rs.getString(3) + " ");
				content += (rs.getString(4) + " ");
				content += (rs.getString(5) + " ");
				content += (rs.getString(6) + "\n\n");
			}
		}
		catch (Exception e)
		{
			content = ("Error Occurred: " + e);
		}
		
		return content;
	}
}
