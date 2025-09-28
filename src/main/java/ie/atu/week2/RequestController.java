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

    @GetMapping("/Calculator")
    public Calculator getCalculator(@RequestParam double number1,
                                    @RequestParam double number2,
                                    @RequestParam String Operator){
        switch (Operator){
            case "add":
                return new Calculator("add",  number1 + number2);
            case "subtract":
                return new Calculator("subtract",  number1 - number2);
            case "multiply":
                return new Calculator("multiply",  number1 * number2);
            case "divide":
                if(number2 == 0){
                    return new Calculator("Cannot divide by zero", 0);
                }
                else{
                    return new Calculator("divide",  number2 / number1);
                }
            default:
                return new Calculator("Cannot do calculation", 0);
        }

    }

}
