package section1.operator;

public class Operator {

    public static void main(String[] args) {
        JavaMoney money1 = new JavaMoney(1_000L);
        JavaMoney money2 = money1;
        JavaMoney money3 = new JavaMoney(1_000L);

        System.out.println(money1 == money2); // true 동일성
        System.out.println(money1 == money3); // false 동등성

        if (money1.compareTo(money3) > 0) {
            System.out.println("money1 is greater than money2");
        }

        System.out.println(money1.plus(money2));
    }

}
