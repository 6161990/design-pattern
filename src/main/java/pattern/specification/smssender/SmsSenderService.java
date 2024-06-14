package pattern.specification.smssender;


import pattern.specification.smssender.factor.SmsTriggingFactor;

import java.util.Optional;

public class SmsSenderService {

    public SmsContent send(SmsTriggingFactor factor, String... variables) {
        Optional<SmsContent> bestPolicy = SmsPolicyFinder.getSmsContent(factor);

        return bestPolicy.get();

    }
}
