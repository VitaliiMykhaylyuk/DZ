public class Main {

    public static void main(String[] args) {

        double degree = 10.00;

        Degree systemaFrom = Degree.celciy;
        Degree systemaTo =  Degree.calvyn;

        BaseConverter.convert(degree,systemaFrom,systemaTo);
    }
}
