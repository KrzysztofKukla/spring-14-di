package pl.kukla.krzys.di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Krzysztof Kukla
 */
@Service
@Profile({"default", "second"})
public class GreetingServiceSecond implements GreetingService {
    @Override
    public String sayHello() {
        return "hello second";
    }

}
