package test.javaBased;

import test.xmlbased.Car;
import test.xmlbased.BenzinEngine;
import test.xmlbased.MetanEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean
    @Primary
    public Teacher getTeacher(){
        return new Teacher();
    }

    @Bean
    public Driver getDriver(){
        return new Driver();
    }

    @Bean
    public BenzinEngine getBenzin(){
        return new BenzinEngine();
    }

    @Bean
    @Primary
    public MetanEngine getMetan(){
        return new MetanEngine();
    }

    @Bean
    public Car getCar(){
        return new Car();
    }
}
