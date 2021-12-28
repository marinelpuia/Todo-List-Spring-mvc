package com.marinel.controller;

import com.marinel.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/*
    This class is used to render the app logic from the service directory
 */

@Slf4j
@Controller
public class DemoController {

    // == fields ==
    private final DemoService demoService;

    // == constructors ==
    @Autowired
    public DemoController(DemoService demoService) {
    this.demoService = demoService;
    }

    // == request methods ==
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        // == http://locolhost:8080/todo-list/hello
        return "Hello Marinel!";
    }

    // == render the view with the name welcome.jsp
    // == http://locolhost:8080/todo-list/welcome
    // == http://locolhost:8080/todo-list/welcome?user=Marinel  because using @RequestPart in the welcome method
    @GetMapping("welcome")
    public String welcome(@RequestParam String user, @RequestParam int age, Model model) {
        model.addAttribute("helloMessage", demoService.getHelloMessage(user));
        model.addAttribute("age", age);
        log.info("model = {} ", model);

        // == prefix + name + suffix
        // == /WEB-INF/view/welcome.jsp
        return "welcome";
    }

    // == model attributes ==
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage() {
        log.info("welcomeMessage called");
        return demoService.getWelcomeMessage();
    }

}
