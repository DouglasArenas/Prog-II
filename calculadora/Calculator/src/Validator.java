public class Validator {
    public static boolean isValidNumber(double num) {
        return !Double.isNaN(num) && !Double.isInfinite(num);
    }

    public static boolean isValidOperator(String operator) {
        return operator.matches("[+\\-*/]");
    }
}
