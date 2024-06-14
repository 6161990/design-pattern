package pattern.specification.smssender.factor;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class NotificationFactor {
    private String notificationType;
    private ProductItemGroup productItemGroup;
    private ProductItemHierarchy hierarchy;
    private SubscriptionState subscriptionState;
    private String userId;

    public int getFailedNth() {
        return 0;
    }
}
