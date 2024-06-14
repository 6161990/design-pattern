package pattern.specification.smssender;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SmsContent {

    private final String reason;

    public SmsContent(String reason) {
        this.reason = reason;
    }
}
