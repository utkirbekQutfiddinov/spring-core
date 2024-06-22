package test.xmlbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        /**
         * IOC configuration types:
         * 1. xml based conf:  ClassPathXmlApplicationContext
         * 2. java based conf: AnnotationBasedApplicationContext
         * 3. annotation based conf
         */

        /**
         * Context types:
         * 1. BeanFactory
         * 2. ApplicationContext: ClassPathXmlApplicationContext, AnnotationBasedApplicationContext
         */

        ApplicationContext ioc=new ClassPathXmlApplicationContext("classpath:spring-config.xml");

//        Engine dv = (Engine) ioc.getBean("car");
//
//        dv.start();

        Car bean = ioc.getBean(Car.class);

//        Engine engine=new BenzinEngine();
//        Car car1=new Car(engine);
//
//
//        Engine bean1 = ioc.getBean(Engine.class);
//        Engine bean2 = ioc.getBean(Engine.class);


//        System.out.println("bean1.hashCode() = " + bean1.hashCode());
//        System.out.println("bean2.hashCode() = " + bean2.hashCode());

        /**
         * Bean scopes:
         * 1. singleton: uniqe object
         * 2. prototype: creates a new object every getBean method
         * 3. session
         * 4. request
         * 5. websocket
         */

        /**
         * injection process of dependencies are called wiring
         * There are 2 types of wiring:
         * 1. manual
         * 2. auto
         */

        Car bean1 = ioc.getBean(Car.class);
        bean1.run();


        /**
         * Types of autowire:
         * 1. constructor
         * 2. byName
         * 3. byType
         * 4. no
         * 5. default
         */


        /**
         * resolving autowiring issue:
         * 1. primary: true
         * 2. autowire-candidate: false
         */
    }
}