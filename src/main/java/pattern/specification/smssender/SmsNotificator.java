package pattern.specification.smssender;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pattern.specification.smssender.factor.NotificationFactor;
import pattern.specification.smssender.factor.Subscription;

import java.util.NoSuchElementException;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class SmsNotificator implements Notifier {

    private final FactorGenerator factorGenerator;
    private final SmsFinder smsFinder;
    private final SmsSender smsSender;

    @Override
    public void notifier(Subscription subscription, String... variables) {
        NotificationFactor factor = factorGenerator.generate("SMS", subscription);
        Optional<Sms> sms = smsFinder.findWithPolicy(factor, variables);

        if(sms.isEmpty()) throw new NoSuchElementException();

        smsSender.send(sms.get());
    }

}
