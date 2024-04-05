package kinoprogram.kinooblig;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String helloWorld (String navn){
        return "Hello World" + navn;
    }
}
