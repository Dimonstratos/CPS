public class CreditPaymentServices {
    public float calculate(float sum, float percent, int period) {
        float payment = 0;
        float monthlyRate = 0;
        float ratio = 0;
        /* процентная ставка в месяц */
        monthlyRate = percent / 12 / 100;
        /* коэф. аннуитентного платежа */
        ratio = (monthlyRate * (float) Math.pow((1 + monthlyRate), period)) / ((float) Math.pow((1 + monthlyRate), period) - 1);
        /* ежемесячный платёж */
        payment = sum * ratio;
        return payment;
    }
}
