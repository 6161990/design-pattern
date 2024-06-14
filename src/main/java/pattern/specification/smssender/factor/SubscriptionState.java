package pattern.specification.smssender.factor;

public class SubscriptionState {

    String state;

    public SubscriptionState(String state) {
        this.state = state;
    }

    public static SubscriptionState of(String state){
        return new SubscriptionState(state);
    }

}
