public class MoldovanHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth(){
     //  System.out.print("fmf123");
     int   eggs = 10;
        return eggs;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна Молдова. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
