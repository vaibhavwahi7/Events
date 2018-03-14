package question2_part2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);

       Myuser user=applicationContext.getBean(Myuser.class);
       user.setUname("vaibhav");
       user.setUpin(1234);
       user.changeAtmPin();
        System.out.println("done");
    }

}
