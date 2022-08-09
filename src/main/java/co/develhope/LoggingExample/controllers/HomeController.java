package co.develhope.LoggingExample.controllers;

import co.develhope.LoggingExample.services.GreetingsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    GreetingsService greetingsService;
    Logger logger = LoggerFactory.getLogger(HomeController.class);

    @GetMapping("/debug-logging")
    public void getDebug(){
        logger.debug("This is a DEBUG logging");
    }

    @GetMapping("/greetings")
    public String greetings(){
        logger.info("Starting Greeting in controller");
        return greetingsService.doGreeting(3);
    }

    @GetMapping("/info-logging")
    public void getInfo(){
        logger.info("This is an INFO logging");
    }

    @GetMapping("/warning-logging")
    public void getWarning(){
        logger.warn("This is a WARNING logging");
    }

    @GetMapping("/error-logging")
    public void getError(){
        Error error = new Error("This is the Error");//logga tutti gli errori
        logger.error("This is an ERROR logging",error);
    }
}
