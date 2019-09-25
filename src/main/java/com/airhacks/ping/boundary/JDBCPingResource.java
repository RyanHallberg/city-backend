package com.airhacks.ping.boundary;

import java.sql.SQLException;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.ryan.service.JDBCPingService;

@Path("jdbc")
public class JDBCPingResource
{
	@Inject
	JDBCPingService pingService;
	
	@GET
	public String ping() throws SQLException
	{
		return pingService.ping();
	}
}
