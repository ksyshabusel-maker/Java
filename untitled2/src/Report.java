import java.sql.SQLOutput;

public class Report
{
    public static void generateReport(Employee[] employees){

        System.out.printf(  "%-15s %17s","FUO","Salary" );
        System.out.println();
                for(int i = 0; i<employees.length; i++){
            System.out.printf("%-20s %10.2f", employees[i].fullname,  employees[i].salary );
                    System.out.println();
                }
            //%-15s, - значит по левому краю, 15 символов, s - строка.
            //%10.2f, 10 - мин. ширина поля, .2 - сколько после запятой, f - то что у нас запятая есть
}
}
