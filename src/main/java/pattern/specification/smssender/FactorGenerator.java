package pattern.specification.smssender;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pattern.specification.smssender.factor.*;

@Component
@RequiredArgsConstructor
public class FactorGenerator {

    private final XXX productItemFinder;

    public NotificationFactor generate(String notificationType, Subscription subscription) {
        ProductItemGroup itemGroup = productItemFinder.find(subscription.getProductItemId());
        ProductItemHierarchy hierarchy = productItemFinder.findHierarchy(subscription.getProductItemId());
        // TODO Subscription State  === sms useCase
        // 무료 구독 시작
        // 그냥 구독 시작

        // 해지 예약(구독 취소)
        // 해지

        // 결제 실패

        // 기간권 중도 해지 여부 (expiredAt > now)
        // 실물 결합 중도 해지 여부 (expiredAt > now)

        // 상품 변경 여부
        // 자타사 변경 안내 문자 여부

        return new NotificationFactor(notificationType, itemGroup, hierarchy, SubscriptionState.of(""), subscription.getUserId());
    }
}
