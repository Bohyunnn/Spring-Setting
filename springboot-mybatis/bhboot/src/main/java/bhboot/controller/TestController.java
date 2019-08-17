package bhboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import bhboot.service.TestService;

@Controller
public class TestController {

	@Autowired
	private TestService testService; 
	
	@GetMapping("/")
	public @ResponseBody String test() {
		return "success!!";
	}
	
	@GetMapping("/insTestModel")
	public @ResponseBody String insTestModel(@RequestParam(value = "testId") String testId,
			@RequestParam(value = "value") String value) {
			testService.insTestModel(Integer.parseInt(testId), value);
		return "finished!";
	}
	
	@GetMapping("/getTestModel/{testId}")
	public @ResponseBody String getTestModel(@PathVariable(value = "testId") String testId) {
		return testService.getTestModel(Integer.parseInt(testId)).toString();
	}
}
