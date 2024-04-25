public class RatesObj {
    private final double conversion_result;


    public RatesObj(Rates rates) {
        this.conversion_result = rates.conversion_result();
    }

    @Override
    public String toString() {
        return  "" + conversion_result;

    }
}
