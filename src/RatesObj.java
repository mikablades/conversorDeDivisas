public class RatesObj {
    private String base_code;
    private String target_code;
    private double conversion_result;


    public RatesObj(Rates rates) {
        this.base_code = rates.base_code();
        this.target_code = rates.target_code();
        this.conversion_result = rates.conversion_result();
    }

    @Override
    public String toString() {
        return  "" + conversion_result;

    }
}
