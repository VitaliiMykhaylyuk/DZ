public class RunDepartment {


    public static void main(String[] args) {

        Department OtdelProdag = new Department("Otdel Prodag");
        Department otdelAnalitiki = new Department("Otdel Analitiky");
        Department otdelFinasov = new Department("Otdel Finansov");

        Department.Records records1 = OtdelProdag.new Records("Ivanov Ivan Ivanovich");
        Department.Records records2 =OtdelProdag.new Records("Petrov Petro Petrovich");
        Department.Records records3 =otdelAnalitiki.new Records("Sidorov Oleg Vasilevi4");
        Department.Records records4 =otdelFinasov.new Records("Pinchuk Viktor Fedorovich");

        System.out.println("Отдел: " + '\n'+ OtdelProdag.getName() + '\n'+  "Список сотудников"  + '\n'+ OtdelProdag.getListOfRecords());
        System.out.println("Отдел: " + '\n'+ otdelAnalitiki.getName() + '\n'+  "Список сотудников"  + '\n'+ otdelAnalitiki.getListOfRecords());
        System.out.println("Отдел: " + '\n'+ otdelFinasov.getName() + '\n'+  "Список сотудников"  + '\n'+ otdelFinasov.getListOfRecords());



    }
}
