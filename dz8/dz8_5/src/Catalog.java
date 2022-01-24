import java.util.ArrayList;
import java.util.List;

public class Catalog {
        private String name;
        private String autor;

        private List<String> recordList = new ArrayList<>();

    public Catalog(String name, String autor) {
        this.name = name;
        this.autor = autor;
    }

    public String getName() {
            return name;
        }

        public String getListOfRecords(){
            StringBuilder strRecords = new StringBuilder("");
            for (String str:recordList) {
                strRecords.append(str+'\n');

            }
            return strRecords.toString();
        }

        public void getShowListOfRecords(){

            for (String str:recordList) {
                System.out.println(str);
            }
        }

        public class Records {
            private String record;

            Records(String record) {
                this.record = record;
                recordList.add(record);
            }

            @Override
            public String toString() {
                return "Records{" +
                        ", record='" + record + '\'' +
                        '}';
            }
        }

    }

