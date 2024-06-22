package test.javaBased;

import test.xmlbased.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        /**
         * @Configuration : config classlarga qoýiladi, java based IOC ni configure qilish uchun
         * @Bean : ioc beanlarni qaytaradigan metodlarni belgilash uchun
         * @Scope : beanning scope turini belgilash uchun
         * @Primary : primary bean sifatida belgilash
         * @Autowired : auto inject qilish uchun
         */


        ApplicationContext ioc = new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = ioc.getBean(Car.class);
        car.run();

    }
}
