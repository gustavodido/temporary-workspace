package queries;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import models.Fare;
import repositories.FareRepository;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;
import static support.FareFactory.anyBusJourney;
import static support.FareFactory.anyThreeZones;
import static support.FareFactory.anywhereInZoneOne;

@RunWith(MockitoJUnitRunner.class)
public class GetMaximumFareQueryTest {
    @Mock
    private FareRepository fareRepository;

    @InjectMocks
    private GetMaximumFareQuery getMaximumFareQuery;

    @Test
    public void theMaximumFare_ShouldReturnedFromFares() {
        when(fareRepository.list()).thenReturn(asList(anyBusJourney(), anyThreeZones(), anywhereInZoneOne()));

        Fare value = getMaximumFareQuery.run();

        assertThat(value, is(anyThreeZones()));
    }
}