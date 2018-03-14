package question2_part3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ChangeMobileNumberAlertEventListener implements ApplicationListener<ChangeMobileNumberAlertEvent> {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void onApplicationEvent(ChangeMobileNumberAlertEvent event){

        Myuser user=(Myuser) event.getSource();
        long newmobile =user.getUphone();

        String nm=user.getUname();
        int oldpin=user.getUpin();

        jdbcTemplate.update("update user set mobile=? where name=? and pin=?",new Object[]{newmobile,nm,oldpin});
        System.out.println("internal changing");




    }
}
