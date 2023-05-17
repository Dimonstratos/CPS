public class Main {
    public static void main(String[] args) {
        CreditPaymentServices payment = new CreditPaymentServices();

        int payment1 = (int) payment.calculate(1_000_000, 9.99F, 12);
        System.out.println("Ежемесячный платеж по кредиту на 1 год составит" + payment1 + "рублей");

        int payment2 = (int) payment.calculate(1_000_000, 9.99F, 24);
        System.out.println("Ежемесячный платеж по кредиту на 2 год составит" + payment2 + "рублей");

        int payment3 = (int) payment.calculate(1_000_000, 9.99F, 36);
        System.out.println("Ежемесячный платеж по кредиту на 3 год составит" + payment3 + "рублей");
    }
}