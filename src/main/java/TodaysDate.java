import java.util.Calendar;
import java.util.GregorianCalendar;

public class TodaysDate {
    // Atributos (variables)
    String time;          // Modificador por defecto (package-private)
    public int day;       // Publico
    private int month;    // Privado
    protected int year;   // Protegido

    // Metodo del ejercicio
    public void printDateAndTime() {
        GregorianCalendar calendar = new GregorianCalendar();

        time = calendar.get(Calendar.HOUR_OF_DAY) + ":"
                + calendar.get(Calendar.MINUTE) + ":"
                + calendar.get(Calendar.SECOND);

        day = calendar.get(Calendar.DATE);
        month = calendar.get(Calendar.MONTH) + 1; // Enero es el 0, por eso +1
        year = calendar.get(Calendar.YEAR);

        System.out.println("Time: " + time);
        System.out.println("Date: " + month + " " + day + " " + year);
    }
}