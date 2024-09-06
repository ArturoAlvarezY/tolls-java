import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.arturo.models.factories.TruckFactory;
import dev.arturo.models.implementation.IVehicle;
import dev.arturo.models.vehiclesproduct.Truck;

public class TruckFactoryTest {

    TruckFactory truckFactory;

    @BeforeEach
    void setup() {
        truckFactory = new TruckFactory("MVN81T", 5);
    }

    @Test
    public void testConstructorThrowsExceptionForInvalidAxis() {
        assertThrows(IllegalArgumentException.class, () -> new TruckFactory("MVN81T", 0));
        assertThrows(IllegalArgumentException.class, () -> new TruckFactory("MVN81T", null));
    }

    @Test
    void testCreatVehicle() {
        IVehicle vehicle = truckFactory.creatVehicle();
        assertThat(vehicle, is(instanceOf(Truck.class)));

        Truck truck = (Truck) vehicle;
        assertThat(truck.getAxis(), is(5));
    }


}
