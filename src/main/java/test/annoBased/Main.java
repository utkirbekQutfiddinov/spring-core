package test.annoBased;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import test.javaBased.Passport;

public class Main {
    public static void main(String[] args) {
        /** main annotations:
         * @Configuration : config classlarga qoýiladi, java based IOC ni configure qilish uchun
         * @Bean : ioc beanlarni qaytaradigan metodlarni belgilash uchun
         * @Scope : beanning scope turini belgilash uchun
         * @Primary : primary bean sifatida belgilash
         * @Autowired : auto inject qilish uchun
         * @ComponentScan :
         * @Lazy :
         */

        /**
         * bean stereotypes:
         * @Component (base)
         * @Repository
         * @Service
         * @Controller
         */


        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(AnnoConfig.class);
//        ioc.register(AnnoConfig.class);
//        ioc.refresh();
//
//        Student st = ioc.getBean(Student.class);
//
//        st.hello();

//        Student student = ioc.getBean(Student.class);
//        student.hello();

//        Passport bean = ioc.getBean(Passport.class);
//        bean.getOwner().hello();

//        Passport bean = ioc.getBean(Passport.class);

        Passport bean = ioc.getBean(Passport.class);
        System.out.println("12122");
        bean.getOwner().hello();
    }
}
