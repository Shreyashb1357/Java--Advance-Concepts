package app.Tourism.Models;
import app.Tourism.Data.TravellerEntity;
import app.Tourism.Data.TripsEntity;

public record Visitor(String name , String stars , int visits , Date recent) {
    public static Visitor fromTraveller(TravellerEntity traveller) {
        var trips = traveller.getTours();
        var last = trips.stream()
            .map(TripsEntity::getCheckin)
            .max(Date::compareTo);
        return new Visitor(
            traveller.getId(),
            "*".repeat(traveller.getRating()),
            trips.size(),
            last.get()
        );
    }
}