package pattern.specification.smssender.factor;

import lombok.Getter;

@Getter
public class SmsTriggingFactor {
    private ProductItemGroup productItemGroup;
    private SubscriptionState subscriptionState;
    private int failedNth;

}
