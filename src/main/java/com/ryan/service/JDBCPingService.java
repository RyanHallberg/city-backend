package com.ryan.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.json.JSONObject;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class JDBCPingService
{
	@Inject
	private Connection con;

	public String ping() throws SQLException
	{
		JSONObject master = new JSONObject();
		try
		{
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Furniture");

			master = ResultSetConverter.convert(rs);
		}
		catch (Exception e)
		{
			e.fillInStackTrace();
		}

		return master.toString();
	}
}
