public class Main {
    public static void main(String[] args) {
        CreditPaymentService ipoteka = new CreditPaymentService();
        int personalData1 = ipoteka.calculate(1_000_000,9.99, 1);
        System.out.println("Ежемесячный платеж по кредиту в 1 млн рублей со сроком пользования кредита в 1 год составляет " + personalData1 + " ₽");
        int personalData2 = ipoteka.calculate(1_000_000,9.99, 2);
        System.out.println("Ежемесячный платеж по кредиту в 1 млн рублей со сроком пользования кредита в 1 год составляет " + personalData2 + " ₽");
        int personalData3 = ipoteka.calculate(1_000_000,9.99, 3);
        System.out.println("Ежемесячный платеж по кредиту в 1 млн рублей со сроком пользования кредита в 1 год составляет " + personalData3 + " ₽");
    }
}