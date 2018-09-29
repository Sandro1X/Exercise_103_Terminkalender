
import java.io.Serializable;
import java.time.LocalDateTime;


public class Appointment implements Serializable{
    private LocalDateTime dt;
    private String text;

    public Appointment(LocalDateTime dt, String text) {
        this.dt = dt;
        this.text = text;
    }
}
