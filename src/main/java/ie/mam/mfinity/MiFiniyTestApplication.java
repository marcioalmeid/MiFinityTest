package ie.mam.mfinity.MiFiniyTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiFiniyTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiFiniyTestApplication.class, args);
	}
}

@RestController
@RequestMapping("/home")
public class IndexController {
    @RequestMapping("/")
    String get() {
        //mapped to hostname:port/home/
        return "Hello from get";
    }
    @RequestMapping("/index")
    String index() {
        //mapped to hostname:port/home/index/
        return "Hello from index";
    }
}
