package pl.kukla.krzys.di.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Krzysztof Kukla
 */
@Service
@Profile("first")
public class GreetingServiceFirst implements GreetingService {
    @Override
    public String sayHello() {
        return "hello first";
    }

}
