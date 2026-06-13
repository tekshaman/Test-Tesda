public class Num29 {
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2018-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
        
        date.plusDays(2);
        
        // CRITICAL: This line will cause a compilation failure!
        // LocalDate does not have a plusHours() method.
        date.plusHours(3); 
        
        System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDayOfMonth());
    }
}
}
