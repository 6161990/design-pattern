package pattern.specification.smssender.condition;

import lombok.AllArgsConstructor;
import pattern.specification.Specification;
import pattern.specification.smssender.factor.NotificationFactor;
import pattern.specification.smssender.factor.ProductItemGroup;
import pattern.specification.smssender.factor.ProductItemHierarchy;

@AllArgsConstructor
public class ProductItemHierarchyCondition implements Specification<NotificationFactor> {

    ProductItemHierarchy expected;

    public static ProductItemHierarchyCondition of(ProductItemHierarchy itemHierarchy){
        return new ProductItemHierarchyCondition(itemHierarchy);
    }

    @Override
    public boolean isSatisfy(NotificationFactor factor) {
        return expected.equals(factor.getHierarchy());
    }


}
