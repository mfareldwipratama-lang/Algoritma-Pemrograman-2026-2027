import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class belajar {
    public static void main(String[] args) {
        LocalDate hari = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
            "EEE dd MMMM yyyy",
         Locale.forLanguageTag("id-ID"));
        System.out.println(" hari ini " + hari.format(formatter)
        + ", saya belajar library di jawa");
    }
}