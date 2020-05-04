package test;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;



public class RestAPIProgram1 {

	public RestAPIProgram1() {
		System.out.println("------------------------------------------RestAPIProgram1");
		
		final String uri = "http://localhost:8080/topics";
	     
	    RestTemplate restTemplate = new RestTemplate();
	    //String result = restTemplate.getForObject(uri, String.class);
	    
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	     
	    System.out.println("Status code --------------------------- ::::::"+result.getStatusCodeValue());
	    System.out.println(result.getBody());
	     
	}
}
