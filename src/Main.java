public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(65.5, 1.71);
        System.out.println(bmi);
    }
}