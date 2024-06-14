package pattern.specification.smssender;


import pattern.specification.smssender.condition.ProductItemGroupCondition;
import pattern.specification.smssender.condition.SubscriptionStateCondition;
import pattern.specification.smssender.factor.ProductItemGroup;
import pattern.specification.smssender.factor.SmsTriggingFactor;
import pattern.specification.smssender.factor.SubscriptionState;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SmsPolicyFinder {

    public static Optional<SmsContent> getSmsContent(SmsTriggingFactor factor) {
        List<SmsPolicy> smsPolicies = getSmsPolicies();

        for (SmsPolicy policy : smsPolicies) {
            if (policy.isSatisfy(factor)) {
                return Optional.of(policy.outer());
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
