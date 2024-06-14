package pattern.specification.smssender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import pattern.specification.Specification;
import pattern.specification.smssender.factor.SmsTriggingFactor;

@Getter
@AllArgsConstructor
public class SmsPolicy implements Policy<SmsTriggingFactor, SmsContent> {

    private final Specification<SmsTriggingFactor> condition;
    private final SmsContent smsContent;

    @Override
    public boolean isSatisfy(SmsTriggingFactor factor) {
        return condition.isSatisfy(factor);
    }

    @Override
    public SmsContent outer() {
        return smsContent;
    }

}
