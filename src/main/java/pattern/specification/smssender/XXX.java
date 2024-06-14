package pattern.specification.smssender;

import org.springframework.stereotype.Component;
import pattern.specification.smssender.factor.ProductItemGroup;
import pattern.specification.smssender.factor.ProductItemHierarchy;

@Component
public class XXX {

    public ProductItemGroup find(Long productItemId) {
        return ProductItemGroup.of("PACKAGE");
    }

    public ProductItemHierarchy findHierarchy(Long productItemId) {
        return ProductItemHierarchy.of("PREMIUM");
    }
}
