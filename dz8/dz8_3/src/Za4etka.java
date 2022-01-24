import java.util.ArrayList;
import java.util.List;

public class Za4etka {

    public Za4etka() {
    }

    List<Session> sessionList = new ArrayList<>();
    List<Examination> examinationList = new ArrayList<>();
    List<Za4et> za4etList = new ArrayList<>();


    public void showSession(){
        for(int i=0;i< sessionList.size();i++){
            System.out.println(sessionList.get(i));
        }
    }

    public void showExamination(){
        for(int i=0;i< examinationList.size();i++){
            System.out.println(examinationList.get(i));
        }
    }
    public void showZa4et(){
        for(int i=0;i< za4etList.size();i++){
            System.out.println(za4etList.get(i));
        }
    }

    public List<Session> getSessionList() {
        return sessionList;
    }
    public List<Examination> getExaminationList() {
        return examinationList;
    }

    public List<Za4et> getZa4etList() {
        return za4etList;
    }


    public void addSession(String name, String ocenka) {
        sessionList.add(new Session(name, ocenka));
    }
    public void addExamination(String name, int ocenka) {
        examinationList.add(new Examination(name, ocenka));
    }

    public void addZa4et(String name, String ocenka) {
        za4etList.add(new Za4et(name, ocenka));
    }






    private class Session  {
        private String name;
        private String ocenka;

        public Session(String name, String ocenka) {
            this.name = name;
            this.ocenka = ocenka;
        }

        @Override
        public String toString() {
            return "Session{" +
                    "name='" + name + '\'' +
                    ", ocenka='" + ocenka + '\'' +
                    '}';
        }
    }


    private class Examination  {
        private String name;
        private int ocenka;

        public Examination(String name, Integer ocenka) {
            this.name = name;
            this.ocenka = ocenka;
        }

        @Override
        public String toString() {
            return "Examination{" +
                    "name='" + name + '\'' +
                    ", ocenka='" + ocenka + '\'' +
                    '}';
        }
    }

    private class Za4et  {
        private String name;
        private String ocenka;

        public Za4et(String name, String ocenka) {
            this.name = name;
            this.ocenka = ocenka;
        }

        @Override
        public String toString() {
            return "Za4et{" +
                    "name='" + name + '\'' +
                    ", ocenka='" + ocenka + '\'' +
                    '}';
        }
    }
}
