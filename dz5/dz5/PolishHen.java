public class PolishHen extends Hen{

    @Override
    public int getCountOfEggsPerMonth(){

        int   eggs = 50;


        return eggs;
    }


    public String getDescription() {
        return super.getDescription() + " Моя страна Польша. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
