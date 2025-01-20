
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros, this.cents + addition.cents);
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        boolean ifLess = false;
        if ((this.euros == compared.euros) && (this.cents < compared.cents)) ifLess = true;
        if ((this.euros != compared.euros) && (this.euros < compared.euros)) ifLess = true;

        return ifLess;
    }

    public Money minus(Money decreaser) {
        int allMoney = this.euros * 100 + this.cents;
        int allDecreaser = decreaser.euros * 100 + decreaser.cents;

        allMoney = allMoney - allDecreaser;
        if (allMoney < 0) allMoney = 0;

        Money newMoney = new Money(allMoney / 100, allMoney % 100);

        return newMoney;
    }

}
