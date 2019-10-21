package com.airhacks.ping.boundary;


import java.sql.SQLException;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.ryan.service.JDBCPingService;
import org.json.JSONArray;

@Path("jdbc")
public class JDBCPingResource
{
	@Inject
	JDBCPingService pingService;
	
	@GET
	public JSONArray ping() throws SQLException
	{
		return pingService.ping();
	}
}
