package com.airhacks.ping.boundary;

import java.sql.SQLException;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.ryan.service.JDBCPingService;


@Path("jdbc")
//@Consumes("application/json")
@Produces("application/json")
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