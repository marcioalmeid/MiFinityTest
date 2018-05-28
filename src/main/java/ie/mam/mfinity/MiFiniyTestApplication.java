package ie.mam.mfinity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Value;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MiFiniyTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiFiniyTestApplication.class, args);
	}

   
}

@RestController
class IndexController{

 @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

}