package pattern.specification.smssender;

import pattern.specification.smssender.factor.Subscription;

public interface Notifier {
    void notifier(Subscription subscription, String... variables);

}
