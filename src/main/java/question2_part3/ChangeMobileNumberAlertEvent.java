package question2_part3;

import org.springframework.context.ApplicationEvent;

public class ChangeMobileNumberAlertEvent extends ApplicationEvent {

    public ChangeMobileNumberAlertEvent(Object source) {
        super(source);
    }
}
