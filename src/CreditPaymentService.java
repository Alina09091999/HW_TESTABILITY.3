public class CreditPaymentService {
    public int calculate(int loanAmount, int loanTerm, double annualRate) {
        int numberOfPayments = loanTerm * 12;
        double monthlyRate = annualRate / 1200;
        double annuityRatio = monthlyRate * Math.pow((1 + monthlyRate), numberOfPayments) / (Math.pow((1 + monthlyRate), numberOfPayments) - 1);
        double monthlyPayment = (annuityRatio * loanAmount);
        return (int) monthlyPayment;
    }
}
