package stubs;

import models.Journey;
import models.Station;
import models.TransportType;

import java.util.List;

import static java.util.Arrays.asList;
import static models.TransportType.BUS;
import static models.TransportType.TRAIN;

public class JourneyStubs {
    public static Journey newJourney(Station origin, Station destination, TransportType transportType) {
        return Journey.builder()
                .origin(origin)
                .destination(destination)
                .transportType(transportType)
                .build();
    }

    public static Journey newJourney(Station origin, Station destination) {
        return Journey.builder()
                .origin(origin)
                .destination(destination)
                .build();
    }

    public static Journey holbornToEarlsCourtByTrain() {
        return  newJourney(StationStubs.holborn(), StationStubs.earlsCourt(), TRAIN);
    }

    public static Journey earlsCourtToChelseaByBus() {
        return newJourney(StationStubs.holborn(), StationStubs.chelsea(), BUS);
    }

    public static Journey earlsCourtToHammersmithByTrain() {
        return newJourney(StationStubs.holborn(), StationStubs.hammersmith(), TRAIN);
    }

    public static List<Journey> journeys() {
        return asList(holbornToEarlsCourtByTrain(), earlsCourtToChelseaByBus(), earlsCourtToHammersmithByTrain());
    }
}
