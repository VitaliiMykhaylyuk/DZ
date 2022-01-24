public class RunZa4etka {
    public static void main(String[] args) {
        Za4etka za4etka = new Za4etka();

        za4etka.addSession("First session","Zdano");
        za4etka.addSession("Second session","Ne zdano");

        za4etka.showSession();
     //   za4etka.showSession("Second session","Ne zdano");

        za4etka.addExamination("Finansy",4);
        za4etka.addExamination("IT",5);

        za4etka.showExamination();

        za4etka.addZa4et("OBGD","Ne zdano");
        za4etka.addZa4et("FIZRA","Zdano");

        za4etka.showZa4et();
    }
}
