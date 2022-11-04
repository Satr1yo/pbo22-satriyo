/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotell;

/**
 *
 * @author RIO
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateString {
    public static String now () {
        Locale locale = Locale.forLanguageTag("id");
        String patern = "dd-mm-yy H:m:s";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(patern, locale);
        LocalDateTime dateTime = LocalDateTime.now();
        return dateTime.format(formatter);
        
    }
    
}
