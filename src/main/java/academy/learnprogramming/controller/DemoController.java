package academy.learnprogramming.controller;

import academy.learnprogramming.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

// no need for component annotation as controller
// annotation is a special type of component (called a stereotype)
@Controller
@Slf4j
public class DemoController {

    // == fields ==
    private final DemoService demoService;


    // == constructors ==
    @Autowired
    public DemoController(DemoService demoService){
        this.demoService = demoService;
    }


    // ==  request methods ==

    // http://localhost:8080/todo-list/hello
    @ResponseBody // this annotation allows you to render your text without a view
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    // http://localhost:8080/todo-list/welcome
    // This annotation is what will be in the url
    @GetMapping("welcome")
    // Model will be provided by the DispatcherServlet as a key/value pair
    public String welcome(Model model){

        // adding a key value pair since every
        // attribute has a key ("helloMessage") and value ("Irfan")
        model.addAttribute("helloMessage", demoService.getHelloMessage("Irfan"));
        log.info("model= {}", model);


        // this is a reference to the welcome view (welcome.jsp)
        // prefix + name + suffix using ViewResolver Bean
        // /WEB-INF/view/welcome.jsp
        return "welcome";
    }


    // == model attributes ==
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage(){
        log.info("welcomeMessage() called");
        return demoService.getWelcomeMessage();
    }

}
