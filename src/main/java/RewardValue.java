public class RewardValue {
    private final double cashValue;
    private final double mileValue;
    private final static double CONVERSION_RATE = 0.0035;

    public RewardValue(double cash) {
        cashValue = cash;
        mileValue = cashValue*CONVERSION_RATE;
    }
     public RewardValue(int miles) {
        mileValue = miles;
        cashValue = miles/CONVERSION_RATE;
     }

     public double getCashValue() {
        return cashValue;
     }

     public double getMilesValue() {
        return mileValue;
     }
}
