package pattern.specification.smssender.factor;

public class Subscription {

    String itemGroup;

    public Subscription(String itemGroup) {
        this.itemGroup = itemGroup;
    }

    public static Subscription of(String itemGroup) {
        return new Subscription(itemGroup);
    }

    public Long getProductItemId() {
        return null;
    }

    public String getUserId() {
        return "";
    }
}
