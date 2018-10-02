
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Appointment implements Serializable{
    private LocalDateTime dt;
    private String text;
    private static transient DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy - HH.mm");
    
    public Appointment(String dt, String text) {
        this.dt = LocalDateTime.parse(dt,dtf);
        this.text = text;
    }

    public LocalDateTime getDt() {
        return dt;
    }

    public String getText() {
        return text;
    }

    public DateTimeFormatter getDtf() {
        return dtf;
    }

    public void setDt(LocalDateTime dt) {
        this.dt = dt;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    @Override
    public String toString(){
        return String.format("%s --> %s", dt.format(dtf), text);
    }
}