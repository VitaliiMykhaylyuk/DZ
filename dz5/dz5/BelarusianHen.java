public class BelarusianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth(){
        int mineggs=1;
        int maxeggs = 100;

        int eggs= mineggs + (int) ((1 + maxeggs - mineggs) * Math.random());

        return eggs;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна Беларусь. Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }


}
