import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import dev.arturo.models.Toll;
import dev.arturo.models.factories.VehicleFactory;
import static org.mockito.Mockito.*;


public class TollTest {

    Toll toll;
    VehicleFactory vehicleFactoryMock;

    @BeforeEach
    void toll() {
        vehicleFactoryMock = mock(VehicleFactory.class);
        toll = new Toll("Bumby", "Maracay", 100, vehicleFactoryMock);
    }

    @Test
    public void testGetters() {
        assertThat(toll.getName(), is("Bumby"));
        assertThat(toll.getCity(), is("Maracay"));
        assertThat(toll.getTollAmount(), is(100));
        assertThat(toll.getVehicleFactory(), is(vehicleFactoryMock));
    }

    @Test
    public void testSetters() {
        toll.setName("Giaco");
        assertThat(toll.getName(), is("Giaco"));

        toll.setCity("Gijon");
        assertThat(toll.getCity(), is("Gijon"));

        toll.setTollAmount(0);
        assertThat(toll.getTollAmount(), is(0));

        VehicleFactory newVehicleFactoryMock = mock(VehicleFactory.class);
        toll.setVehicleFactory(newVehicleFactoryMock);
        assertThat(toll.getVehicleFactory(), is(newVehicleFactoryMock));
    }
}
