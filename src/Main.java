public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 98; // вес в килограммах
        double heightInMeters = 1.87; // рост в метрах
        int bmi = service.calculate(weightInKg, heightInMeters);
        System.out.println("индекс bmi:" + bmi);
    }
}
