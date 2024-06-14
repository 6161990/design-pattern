package pattern.specification.smssender.factor;

public class ProductItemGroup {
    // monthly, package, period, etc

    String itemGroup;

    public ProductItemGroup(String itemGroup) {
        this.itemGroup = itemGroup;
    }

    public static ProductItemGroup of(String itemGroup) {
        return new ProductItemGroup(itemGroup);
    }
}
