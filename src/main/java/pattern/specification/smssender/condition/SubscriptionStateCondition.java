package pattern.specification.smssender.condition;

import lombok.AllArgsConstructor;
import pattern.specification.Specification;
import pattern.specification.smssender.factor.SmsTriggingFactor;
import pattern.specification.smssender.factor.SubscriptionState;

@AllArgsConstructor
public class SubscriptionStateCondition implements Specification<SmsTriggingFactor> {

    SubscriptionState expected;

    public static SubscriptionStateCondition of(SubscriptionState state){
        return new SubscriptionStateCondition(state);
    }

    @Override
    public boolean isSatisfy(SmsTriggingFactor factor) {
        return expected.equals(factor.getSubscriptionState());
    }
}
