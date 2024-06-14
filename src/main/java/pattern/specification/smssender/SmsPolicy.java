package pattern.specification.smssender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pattern.specification.Specification;
import pattern.specification.smssender.factor.NotificationFactor;

@Getter
@AllArgsConstructor
public class SmsPolicy implements Policy<NotificationFactor, SmsContent> {

    private final Specification<NotificationFactor> condition;
    private final SmsContent smsContent;

    @Override
    public boolean isSatisfy(NotificationFactor factor) {
        return condition.isSatisfy(factor);
    }

    @Override
    public SmsContent outer() {
        return smsContent;
    }

}
