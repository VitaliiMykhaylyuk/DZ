

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class dz8 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //1.Notepad
        Notepad dateone = new Notepad(new GregorianCalendar(2022, 0, 15));
        Notepad dateTwo = new Notepad(new GregorianCalendar(2022, 0, 16));

        Notepad.Records record1 = dateone.new Records("Запись 1");
        Notepad.Records record2 = dateone.new Records("Запись 2");
        Notepad.Records record3 = dateTwo.new Records("Запись 3");
      //  sdf.format(calendar.getTime())
        System.out.println("Записи: " + '\n'+ dateone.getListOfRecords() +"созданы: " + sdf.format(dateone.getDate().getTime()));
        System.out.println("Записи: " + '\n'+ dateTwo.getListOfRecords() +"созданы: " + sdf.format(dateTwo.getDate().getTime()));

    }
}
