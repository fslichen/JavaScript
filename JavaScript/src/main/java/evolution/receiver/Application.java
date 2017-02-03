package evolution.receiver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import evolution.receiver.dto.AnyDto;

@SpringBootApplication
@RestController
public class Application {
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String get() {
		String string = "Hello World";
		System.out.println(string);
		return string;
	}
	
	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public AnyDto post(@RequestBody AnyDto anyDto) {
		System.out.print(anyDto);
		return anyDto;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
