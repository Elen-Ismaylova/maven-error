public class BmiSertvice {

    public double calculate (double weight, double height) {

        double bmi = ((weight / (height * height)) * 1);
        System.out.println(bmi);

        return bmi;
    }
}
