public class BmiService {
    public int calculate(int weightINKg, double heightInMeters) {
        double bmi = weightINKg / heightInMeters / heightInMeters;
        return (int) bmi;
    }
}

