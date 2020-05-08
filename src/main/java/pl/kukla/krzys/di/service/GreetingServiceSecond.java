package pl.kukla.krzys.di.service;

import org.springframework.stereotype.Service;

/**
 * @author Krzysztof Kukla
 */
@Service
public class GreetingServiceSecond implements GreetingService {
    @Override
    public String sayHello() {
        return "hello second";
    }

}
