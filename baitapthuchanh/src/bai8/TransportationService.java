package bai8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TransportationService {
    private List<Transportation> transportationList;

    public TransportationService() {
        transportationList = new ArrayList<>();
    }

    public List<Transportation> getAll() {
        return transportationList;
    }

    public Transportation findById(int id) {
        for (Transportation tr : transportationList) {
            if (tr.getId() == id) {
                return tr;
            }
        }
        return null;
    }

    public void addTransportation(Transportation tr) {
        transportationList.add(tr);
    }

    public void deleteId(int id) {
        transportationList.remove(findById(id));
    }
    public void  softByPrice(){
        Collections.sort(transportationList, new Comparator<Transportation>() {
            @Override
            public int compare(Transportation pr1, Transportation pr2) {
                return Double.compare(pr1.getPrice(), pr2.getPrice());
            }
        });
    }
    public Transportation findByColor(String color) {
        for (Transportation tr : transportationList) {
            if (tr.getColor().equalsIgnoreCase(color)) {
                return tr;
            }
        }
        return null;
    }


}
