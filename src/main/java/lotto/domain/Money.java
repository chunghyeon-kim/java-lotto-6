package lotto.domain;

public class Money {
    private static final int EACH_LOTTO = 1000;
    private static final int ZERO = 0;

    private final int amount;

    public Money(int amount) {
        if (amount < EACH_LOTTO) {
            throw new IllegalArgumentException("로또 구입 금액은 1000원 이상이어야 합니다");
        }

        if (amount % EACH_LOTTO != ZERO) {
            throw new IllegalArgumentException("로또 구입 금액은 1000원 단위로 입력해주세요");
        }

        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

}