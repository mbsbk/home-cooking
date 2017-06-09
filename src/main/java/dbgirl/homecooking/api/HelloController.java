package dbgirl.homecooking.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mengbo on 17-6-9.
 */
@RestController
public class HelloController {
    private final static Logger logger = LoggerFactory.getLogger(HelloController.class);


    @RequestMapping("/say")
    public String hello() {
        logger.info("saying hello");
        return "hello";
    }

}
