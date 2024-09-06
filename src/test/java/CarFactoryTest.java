import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.arturo.models.factories.CarFactory;
import dev.arturo.models.implementation.IVehicle;
import dev.arturo.models.vehiclesproduct.Car;

public class CarFactoryTest {

    CarFactory carFactory;

    @BeforeEach
    void setup(){
        carFactory = new CarFactory("SBA48W");
    }

    @Test
    void testCreatVehicle() {
        IVehicle toyota = carFactory.creatVehicle();
        assertThat(toyota, is(instanceOf(Car.class)));
    }

    @Test
    void testGetters(){
        assertThat(carFactory.getCarRegistration(), is("SBA48W"));
    }

    @Test
    void testSetters(){
        carFactory.setCarRegistration("10275294");
        assertThat(carFactory.getCarRegistration(), is("10275294"));
    }
}
