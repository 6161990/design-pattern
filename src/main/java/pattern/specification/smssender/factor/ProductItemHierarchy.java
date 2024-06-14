package pattern.specification.smssender.factor;

public class ProductItemHierarchy {
    // premium. standard, play

    String hierarchy;

    public ProductItemHierarchy(String hierarchy) {
        this.hierarchy = hierarchy;
    }

    public static ProductItemHierarchy of(String itemGroup) {
        return new ProductItemHierarchy(itemGroup);
    }
}
