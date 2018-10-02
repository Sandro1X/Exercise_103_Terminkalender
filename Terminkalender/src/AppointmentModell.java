
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.AbstractListModel;


public class AppointmentModell extends AbstractListModel{
    private ArrayList<Appointment> app = new ArrayList<>();
    
    public void add(Appointment a){
        app.add(a);
        Collections.sort(app, new SortByDate());
        fireIntervalAdded(this, app.size() - 1, app.size() - 1);
    }
    
    public void delete(int idx){
        app.remove(idx);
        fireContentsChanged(this, 0, app.size() - 1);
    }
    
    public void update(){
        fireContentsChanged(this, 0, app.size()-1);
    }
    
    public void safe(File f)throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        
        for (Appointment a : app) {
            oos.writeObject(a);
        }
        
        oos.flush();
        oos.close();
    }
    
    public void load(File f)throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        try{
            Appointment ap;
        while((ap = (Appointment) ois.readObject()) != null){
            app.add(ap);
        }
        }catch(EOFException eof){
           
        }
    }
    
    public void sortByName(){
        Collections.sort(app);
        fireContentsChanged(this, 0, app.size() - 1);
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
