package com.ryan.service;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.json.Json;

@ApplicationScoped
public class JDBCPingService
{
	@Inject
	private Connection con;

	public JSONArray ping() throws SQLException
	{
		String content = "";
		JSONArray json = new JSONArray();

		try
		{
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM Furniture");


			ResultSetConverter.convert(rs);


		}
		catch (Exception e)
		{
			e.fillInStackTrace();
		}

		return json;
	}
}
