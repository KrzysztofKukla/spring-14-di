package pl.kukla.krzys.di.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kukla.krzys.di.service.GreetingService;

/**
 * @author Krzysztof Kukla
 */
@RestController
@RequestMapping("/v1/greetings")
@RequiredArgsConstructor
public class GreetingController {

    private final GreetingService greetingService;

    @GetMapping
    public String greetings() {
        return greetingService.sayHello();
    }

}
