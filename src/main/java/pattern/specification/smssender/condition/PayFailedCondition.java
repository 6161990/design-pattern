package pattern.specification.smssender.condition;

import lombok.AllArgsConstructor;
import pattern.specification.Specification;
import pattern.specification.smssender.factor.NotificationFactor;

@AllArgsConstructor
public class PayFailedCondition implements Specification<NotificationFactor> {

    int nth;

    public static PayFailedCondition of(int nth){
        return new PayFailedCondition(nth);
    }

    @Override
    public boolean isSatisfy(NotificationFactor factor) {
        return nth == factor.getFailedNth();
    }
}
