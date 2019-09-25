//package com.ryan.resources;
//
//import java.util.List;
//
//import javax.inject.Inject;
//import javax.ws.rs.Consumes;
//import javax.ws.rs.GET;
//import javax.ws.rs.Path;
//import javax.ws.rs.Produces;
//import javax.ws.rs.core.MediaType;
//import javax.ws.rs.core.Response;
//
///**
// * @author Ryan
// *
// */
//@Path("products") // resources/products
//@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
//public class ProductResource {
//
//	@Inject
//	DBTest dbtest;
//
//	@GET
//	public Response getProducts()
//	{
//		String products = dbtest.getResultSet().toString();
//		
//		return Response.ok(products).build();
//	}
//}