package pattern.specification.smssender;

public interface Policy<F, R> {

    boolean isSatisfy(F f);

    R outer();

}
