package pattern.specification.smssender.condition;

import lombok.AllArgsConstructor;
import pattern.specification.Specification;
import pattern.specification.smssender.factor.ProductItemGroup;
import pattern.specification.smssender.factor.SmsTriggingFactor;

@AllArgsConstructor
public class ProductItemGroupCondition implements Specification<SmsTriggingFactor> {

    ProductItemGroup expected;

    public static ProductItemGroupCondition of(ProductItemGroup productItemGroup){
        return new ProductItemGroupCondition(productItemGroup);
    }

    @Override
    public boolean isSatisfy(SmsTriggingFactor factor) {
        return expected.equals(factor.getProductItemGroup());
    }


}
