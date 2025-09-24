package ie.atu.week2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping

public class RequestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }


    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Hello " + name;
    }

    @GetMapping("/details")
    public String details(@RequestParam String name, @RequestParam int age) {
        return "Hello " + name + "Age:" + age;
    }

    @GetMapping("/person")
    public person getPerson(){
        return new person("Eoin", 35);
    }

}
