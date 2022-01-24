import java.util.Scanner;

public class UkrainianHen extends Hen {

    // eggs= getCountOfEggsPerMonth();
    @Override
    public int getCountOfEggsPerMonth(){

        Scanner sc = new Scanner(System.in);
        boolean proverka4isla = false;
        int eggs = 0;
        do {
            System.out.print("Введите число яиц для курей из страны Украина с клавиатуры и нажмите ентер: ");
            if (sc.hasNextInt()) {
                eggs = sc.nextInt();
                proverka4isla = true;
            } else {
                sc.nextLine();
                System.out.print("Введите корректное число с клавиатуры.");
            }
        } while (!proverka4isla);

        return eggs;
    }

   // @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна Украина. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }

}
