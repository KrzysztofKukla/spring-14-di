package pl.kukla.krzys.di.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Krzysztof Kukla
 */
@Service
@Primary
public class GreetingServiceFirst implements GreetingService {
    @Override
    public String sayHello() {
        return "hello first";
    }

}
