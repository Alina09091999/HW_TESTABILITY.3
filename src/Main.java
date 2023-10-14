public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int loanAmount = 1_000_000;
        int loanTerm = 3;
        double annualRate = 9.99;
        int monthlyPayment = service.calculate(loanAmount, loanTerm, annualRate);
        System.out.println("Ежемесячный платёж = " + monthlyPayment);

    }
}