package question2_part3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);

       Myuser user=applicationContext.getBean(Myuser.class);
       user.setUname("vaibhav");
       user.setUpin(5678);
       user.changeMobile();

        System.out.println("your mobile has changed");
    }

}
