package test.annoBased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Cinfig {

    @Bean
    @Primary
    public String getString(){
        return "PDP student";
    }

    @Bean
    public String aksbsaj(){
        return "PDsdfskjdsbcjshP";
    }
}
