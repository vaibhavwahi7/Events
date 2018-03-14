package question2_part1;

import org.springframework.context.ApplicationEvent;

public class WithdrawMoneySmsEvent extends ApplicationEvent {

    public WithdrawMoneySmsEvent(Object source) {
        super(source);
    }
}
