import java.util.Scanner;

public class HenFactory {

    public static Hen getHen(Integer country) {
        Hen hen=null;
        System.out.print(country);
        if(country == 1) {
            System.out.println("Украинская боевая.");
             hen = new UkrainianHen();
            return hen;

        } else if(country == 2) {
            System.out.println("Польская защитная.");
            hen = new PolishHen();
            return hen;

        }else if(country == 3) {
            System.out.println("Молдавская винная.");
            hen = new MoldovanHen();
            return hen;

        }else if(country == 4) {
            System.out.println("Белорусская колорадная.");
            hen = new BelarusianHen();
            return hen;

        } else {
            //hen = new MoldovanHen();
            return hen;

        }
    }
}