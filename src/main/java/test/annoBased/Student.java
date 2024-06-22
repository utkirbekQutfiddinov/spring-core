package test.annoBased;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import test.javaBased.Passport;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    private final Passport passport;

    public Student(Passport passport) {
        System.out.println("student created");
        this.passport = passport;
    }

    public void hello(){
       System.out.println("Salom student");
    }
}
