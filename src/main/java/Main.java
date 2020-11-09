public class Main {
    public static void main(String[] args) {

        BmiSertvice service = new BmiSertvice();

        double bmi=service.calculate(97,1.65);
        System.out.println(bmi);




 //       double weight = 97;
 //       double height = 1.65;
        //       double bmi = ((weight / (height * height)) * 1);
  //      System.out.println(bmi);

    }
}
