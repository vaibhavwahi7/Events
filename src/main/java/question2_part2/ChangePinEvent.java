package question2_part2;

import org.springframework.context.ApplicationEvent;

public class ChangePinEvent extends ApplicationEvent {

    public ChangePinEvent(Object source) {
        super(source);
    }
}
