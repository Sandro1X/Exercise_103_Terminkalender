
import java.util.ArrayList;
import javax.swing.AbstractListModel;


public class AppointmentModell extends AbstractListModel{
    private ArrayList<Appointment> app = new ArrayList<>();
    
    public void add(Appointment a){
        app.add(a);
        fireIntervalAdded(this, app.size() - 1, app.size() - 1);
    }
    
    @Override
    public int getSize() {
        return app.size();
    }

    @Override
    public Object getElementAt(int index) {
        return app.get(index);
    }
    
}
