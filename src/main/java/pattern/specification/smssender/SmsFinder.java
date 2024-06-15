package pattern.specification.smssender;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pattern.specification.smssender.condition.ProductItemGroupCondition;
import pattern.specification.smssender.condition.SubscriptionStateCondition;
import pattern.specification.smssender.factor.ProductItemGroup;
import pattern.specification.smssender.factor.NotificationFactor;
import pattern.specification.smssender.factor.SubscriptionState;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class SmsFinder {

    private final SmsFactory smsFactory;

    public Optional<Sms> findWithPolicy(NotificationFactor factor, String... variables) {
        List<SmsPolicy> smsPolicies = getSmsPolicies();

        for (SmsPolicy policy : smsPolicies) {
            if (policy.isSatisfy(factor)) {
                return Optional.of(smsFactory.create(policy.outer(), factor.getUserId(), variables));
            }
        }

        return Optional.empty();
    }

    private static List<SmsPolicy> getSmsPolicies() {
        SmsPolicy policy = new SmsPolicy(
                ProductItemGroupCondition.of(ProductItemGroup.of("ORDER")).and(SubscriptionStateCondition.of(new SubscriptionState("V0"))),
                new SmsContent("")
        );

        SmsPolicy policy2 = new SmsPolicy(
                ProductItemGroupCondition.of(ProductItemGroup.of("ORDER2")).and(SubscriptionStateCondition.of(new SubscriptionState("V0"))),
                new SmsContent("")
        );
        return Arrays.asList(policy, policy2);
    }

}
