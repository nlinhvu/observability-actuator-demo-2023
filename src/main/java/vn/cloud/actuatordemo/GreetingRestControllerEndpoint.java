package vn.cloud.actuatordemo;

import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@RestControllerEndpoint(id = "rest-greeting")
public class GreetingRestControllerEndpoint {

    @GetMapping
    public Message hi() {
        return new Message("Hi World!");
    }

    record Message(String message) {}
}
