package project1.topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping(value = "/topics" , method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Topic> topic() {
		return Arrays.asList(
				new Topic("spring","spring framework","spring framework Descrption"),
				new Topic("java","java framework","java framework Descrption"),
				new Topic(".net",".net framework",".net framework Descrption")
				);
	}
}
