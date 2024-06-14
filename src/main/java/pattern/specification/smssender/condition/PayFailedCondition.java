package pattern.specification.smssender.condition;

import lombok.AllArgsConstructor;
import pattern.specification.Specification;
import pattern.specification.smssender.factor.SmsTriggingFactor;

@AllArgsConstructor
public class PayFailedCondition implements Specification<SmsTriggingFactor> {

    int nth;

    public static PayFailedCondition of(int nth){
        return new PayFailedCondition(nth);
    }

    @Override
    public boolean isSatisfy(SmsTriggingFactor factor) {
        return nth == factor.getFailedNth();
    }
}
