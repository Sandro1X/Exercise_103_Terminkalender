
import java.util.ArrayList;
import javax.swing.AbstractListModel;


public class AppointmentModell extends AbstractListModel{
    private ArrayList<Appointment> app = new ArrayList<>();
    
    @Override
    public int getSize() {
        return app.size();
    }

    @Override
    public Object getElementAt(int index) {
        return app.get(index);
    }
    
}
