
import java.util.Comparator;


public class SortByDate implements Comparator<Appointment>{

    @Override
    public int compare(Appointment o1, Appointment o2) {
        if(o1.getDt().isBefore(o2.getDt())){
            return -1;
        }else if (o1.getDt().isAfter(o2.getDt())){
            return 1;
        }
        return 0;
    }
    
}
