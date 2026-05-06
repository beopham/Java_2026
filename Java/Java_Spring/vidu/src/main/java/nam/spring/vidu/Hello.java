package nam.spring.vidu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/lala")
    public String index()
    {
           return "ok";
    }
}
