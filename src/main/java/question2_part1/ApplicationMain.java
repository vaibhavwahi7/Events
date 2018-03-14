package question2_part1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class ApplicationMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
//       JdbcTemplate jdbcTemplate=applicationContext.getBean(JdbcTemplate.class);
//        jdbcTemplate.update("insert into user (name,pin,amount,mobile) VALUES (?,?,?,?)",new Object[]{"vaibhav",1234,"30000","8377918843"});

       Myuser user=applicationContext.getBean(Myuser.class);
       user.setUname("vaibhav");
       user.setUpin(1234);
       user.setWithdrawamt(5000);
       user.withrawMoney();
        System.out.println("your account has debited");
    }

}
