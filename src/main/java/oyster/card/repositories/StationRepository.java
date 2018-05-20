package oyster.card.repositories;

import oyster.card.models.Station;

import java.util.Optional;

public interface StationRepository {
    Optional<Station> get(String name);

}