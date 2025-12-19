package app.Tourism.Data;

import java.util.ArrayList;
import java.util.List;

public class TravellerEntity {
    private int id;
    private int rating;
    private List<TripsEntity> tours = new ArrayList<>();
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }
    public void setRating(int r) {
        rating = r;
    }

    public List<TripsEntity> getTours() {
        return tours;
    }
    public void setTours(List<TripsEntity> tours) {
        this.tours = tours;
    }

}