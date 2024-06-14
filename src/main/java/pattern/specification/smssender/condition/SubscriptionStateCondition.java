package pattern.specification.smssender.condition;

import lombok.AllArgsConstructor;
import pattern.specification.Specification;
import pattern.specification.smssender.factor.NotificationFactor;
import pattern.specification.smssender.factor.SubscriptionState;

@AllArgsConstructor
public class SubscriptionStateCondition implements Specification<NotificationFactor> {

    SubscriptionState expected;

    public static SubscriptionStateCondition of(SubscriptionState state){
        return new SubscriptionStateCondition(state);
    }

    @Override
    public boolean isSatisfy(NotificationFactor factor) {
        return expected.equals(factor.getSubscriptionState());
    }
}
