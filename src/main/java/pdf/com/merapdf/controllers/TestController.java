package pdf.com.merapdf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/healthCheck")
    public String healthCheck()
    {
        System.out.println("Health is Super Duper Hitted...");
        return "<h1><center>I'm up and running</center></h1>";
    }
}
