
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Appointment implements Serializable{
    private LocalDateTime dt;
    private String text;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy - HH.mm");
    
    public Appointment(String dt, String text) {
        this.dt = LocalDateTime.parse(dt,dtf);
        this.text = text;
    }
    
    @Override
    public String toString(){
        return String.format("%s --> %s", dt.format(dtf), text);
    }
}
