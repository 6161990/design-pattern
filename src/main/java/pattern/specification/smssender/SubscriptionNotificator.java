package pattern.specification.smssender;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pattern.specification.smssender.factor.NotificationFactor;
import pattern.specification.smssender.factor.Subscription;

import java.util.NoSuchElementException;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class SubscriptionNotificator {

    private final FactorGenerator factorGenerator;
    private final SmsSender smsSender;
    private final SmsPolicyFinder smsPolicyFinder;

    public void send(String userId, Subscription subscription, String... variables) {
        NotificationFactor factor = factorGenerator.generate("SMS", subscription);
        Optional<Sms> sms = smsPolicyFinder.getSms(factor, variables);

        if(sms.isEmpty()) throw new NoSuchElementException();

        smsSender.send(sms.get());
    }
}
