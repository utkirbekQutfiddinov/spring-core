package test.javaBased;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import test.annoBased.Student;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Passport {
    private final Student owner;

    public Passport(@Lazy Student owner) {
        this.owner = owner;
        System.out.println("paspport created");
    }

}
