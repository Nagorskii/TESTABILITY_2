public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 100;
        double heightInMeters = 1.84;
        int index = service.calculate(weightInKg, heightInMeters);
        System.out.println(index);

    }
}
