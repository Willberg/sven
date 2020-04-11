package fun.johntaylor.sven.controller.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.logging.Logger;


@RestController
public class HelloController {
    private final Logger logger = Logger.getLogger(HelloController.class.getName());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Mono<String> hello() {
        logger.info(String.format("/hello:%s", client.getOrder()));
        return Mono.just("hello");
    }
}
