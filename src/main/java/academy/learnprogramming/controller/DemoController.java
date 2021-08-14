package academy.learnprogramming.controller;

import academy.learnprogramming.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
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
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }


    // ==  request methods ==

    // http://localhost:8080/todo-list/hello
    @ResponseBody // this annotation allows you to render your text without a view
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    // http://localhost:8080/todo-list/welcome
    // http://localhost:8080/todo-list/welcome?user=Irfan
    // http://localhost:8080/todo-list/welcome?user=Irfan&age=20
    // This annotation is what will be in the url
    @GetMapping("welcome")
    // Model will be provided by the DispatcherServlet as a key/value pair
    public String welcome(@RequestParam String user, @RequestParam int age, Model model) {

        // adding a key value pair since every
        // attribute has a key ("helloMessage") and value from user
        model.addAttribute("helloMessage", demoService.getHelloMessage(user));
        model.addAttribute("age", age);
        model.addAttribute("user", user);

        // these two do the same thing
        // one displays the model in the view
        // one displays the model in the log
        model.addAttribute("modelMessage", model);
        log.info("model= {}", model);


        // this is a reference to the welcome view (welcome.jsp)
        // prefix + name + suffix using ViewResolver Bean
        // /WEB-INF/view/welcome.jsp
        return "welcome";
    }

    @GetMapping("irfan")
    public String irfanHello(Model model, @ModelAttribute("user") String user) {
        model.addAttribute("hello", "hello");
        model.addAttribute("model", model);
        model.addAttribute("theUser", user);
        return "irfan_hello";
    }

    // == model attributes ==

    // this adds the attribute for all models in this controller
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage() {
        log.info("welcomeMessage() called");
        return demoService.getWelcomeMessage();
    }

}
