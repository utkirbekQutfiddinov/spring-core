package test.xmlbased;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class Car {

    private Engine motor1;

    public void run(){
        motor1.start();
    }

    @Autowired
    public void setsdjhbsdjhd(Engine motor) {
        this.motor1 = motor;
    }
}
