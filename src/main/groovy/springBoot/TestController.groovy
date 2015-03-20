package springBoot

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class TestController {
	
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
