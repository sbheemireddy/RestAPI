package project1.jbehav;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RestAPIProgram1 {

	public RestAPIProgram1() {
		System.out.println("----------------------RestAPIProgram1-----------------------------------");
		final String uri = "http://localhost:8080/topics";
	     
	    //RestTemplate restTemplate = new RestTemplate();
	   // String result = restTemplate.getForObject(uri, String.class);
	     
	   // System.out.println(result);
	}
	
	
}
