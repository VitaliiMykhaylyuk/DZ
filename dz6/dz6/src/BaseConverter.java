public class BaseConverter {

    public static double convert(double degree, Degree systemaFrom,Degree systemaTo ){

        double itogo = 0.0;

        if((systemaFrom.equals(Degree.calvyn) && systemaTo.equals(Degree.calvyn)) ||
                (systemaFrom.equals(Degree.farengeyt) && systemaTo.equals(Degree.farengeyt)) ||
                (systemaFrom.equals(Degree.celciy) && systemaTo.equals(Degree.celciy))){

        }

        if(systemaFrom.equals(Degree.calvyn)){
            if (systemaTo.equals(Degree.farengeyt)) {
                itogo = ((degree-273.15)*9/5)+32;
            }
            if (systemaTo.equals(Degree.celciy)){
                itogo = degree-273.15;
            }

        }

        if(systemaFrom.equals(Degree.celciy)){
            if (systemaTo.equals(Degree.farengeyt)) {
                itogo = (degree*9/5)+32;
            }
            if (systemaTo.equals(Degree.calvyn)){
                itogo = degree+273.15;
            }

        }

        if(systemaFrom.equals(Degree.farengeyt)){
            if (systemaTo.equals(Degree.celciy)) {
                itogo = (degree-32)*5/9;
            }
            if (systemaTo.equals(Degree.calvyn)){
                itogo = ((degree-32)*5/9)+273.15;
            }

        }
        System.out.println(itogo);
        return itogo;
    }


}