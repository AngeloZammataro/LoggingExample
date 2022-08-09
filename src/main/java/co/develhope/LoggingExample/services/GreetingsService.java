package co.develhope.LoggingExample.services;

import co.develhope.LoggingExample.controllers.HomeController;
import co.develhope.LoggingExample.entities.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class GreetingsService {

    Logger logger = LoggerFactory.getLogger(GreetingsService.class);

    public String doGreeting(int numberOfGreetings){
        try {
            logger.info("Starting Greeting - Number of greetings: " + numberOfGreetings +
                    " User: " + new User("Angelo","Zammataro","Palermo"));
            //[...]
            return "Greetings";
        }finally {
            logger.info("Ending Greeting");
        }
    }
}
