import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int country = 0;
            Scanner sc = new Scanner(System.in);
            boolean proverka4isla = false;
            do {
                System.out.print("Введите число соответствующее стране, где:");
                System.out.print("1-Украина;");
                System.out.print("2-Польша;");
                System.out.print("3-Молдова;");
                System.out.print("4-Беларусь;");
                System.out.print("Введите число с клавиатуры и нажмите ентер: ");
                if (sc.hasNextInt()) {
                    country = sc.nextInt();
                    if (country > 0 && country <= 4) {
                        proverka4isla = true;
                    } else {
                        System.out.print("В списке нет такой страны. ");
                        proverka4isla = false;
                    }
                } else {
                    sc.nextLine();
                    System.out.println("Введите корректное число с клавиатуры.");
                }
            } while (!proverka4isla);

        Hen hen = HenFactory.getHen(country);
        System.out.println(hen.getDescription());
    }
}

