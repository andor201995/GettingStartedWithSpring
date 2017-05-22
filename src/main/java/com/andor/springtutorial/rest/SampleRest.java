package com.andor.springtutorial.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.andor.springtutorial.annotation.Sample;
@Path("/sample")
@Produces(MediaType.APPLICATION_JSON)
public class SampleRest {
	@Autowired
	Sample sampleImplCopy;
	@GET
	public String getOutput() {
		return "hello buddy";
	}
	
	@Path("/spring")
	@GET
	public String  springOutput(){
		return sampleImplCopy.disp();
		
	}

}
