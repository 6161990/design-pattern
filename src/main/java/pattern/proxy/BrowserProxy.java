package pattern.proxy;

public class BrowserProxy implements IBrowser {

    private String url;
    private Browser browser;

    public BrowserProxy(String url) {
        this.url = url;
    }

    @Override
    public Html show() {
        if (browser == null) {
            this.browser = new Browser(url);
            System.out.println("BrowserProxy loading html from : " + url);
        }
        System.out.println("BrowserProxy use cache : " + url);
        return browser.show();
    }
}
