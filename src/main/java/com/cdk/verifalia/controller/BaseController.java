package com.cdk.verifalia.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cdk.verifalia.mock.DummyDataGenerator;
import com.cdk.verifalia.model.Request;
import com.cdk.verifalia.model.RequestEntry;
import com.cdk.verifalia.model.Response;

@Controller
public class BaseController {

	
	private Logger LOGGER = Logger.getLogger(BaseController.class);
		
	
	@RequestMapping(value = "/v1.1/hello", method = RequestMethod.GET)
	public @ResponseBody String helloRequest() {
		return "Verifalia dummy server is up and running...";
	}
	
	@RequestMapping(value = "/v1.1/email-validations", method = RequestMethod.POST)
	public @ResponseBody Response handlePostRequest(@RequestBody Request req) {
		LOGGER.debug("Received Post request: "+req.toString() );
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			LOGGER.debug(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(req));
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Response response = DummyDataGenerator.generateResponse(req);
		
		try {
			LOGGER.debug(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response));
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return response;

	}
	
	@RequestMapping(value = "/v1.1/email-validations/{id}", method = RequestMethod.GET)
	public @ResponseBody Response handleGetRequest(@PathVariable("id") String id) {
		
		LOGGER.debug("/v1.1/email-validations GET with id: "+ id);
	
		ObjectMapper mapper = new ObjectMapper();
		Request req = new Request();
		List<RequestEntry> reqEntries = new ArrayList<RequestEntry>();
		reqEntries.add(new RequestEntry("v.c.huovinen@test.com"));
		reqEntries.add(new RequestEntry("v.c.testinen@test.com"));
		
		
		req.setEntries(reqEntries);
		
		Response response = DummyDataGenerator.generateResponse(req);
		
		try {
			LOGGER.debug(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response));
		} catch (JsonGenerationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return response;
		
	}
	
		
}
