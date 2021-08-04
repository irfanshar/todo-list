package academy.learnprogramming.service;

import org.springframework.stereotype.Service;

// annotation is a stereotype, thus no need for component annotation
// service holds business logic
// i.e. manipulates data, calculations, logic etc.
@Service
public class DemoServiceImpl implements DemoService{

    public String getHelloMessage(String user) {
        return "Hello " + user;
    }

    public String getWelcomeMessage() {
        return "Welcome to this Demo application";
    }
}
