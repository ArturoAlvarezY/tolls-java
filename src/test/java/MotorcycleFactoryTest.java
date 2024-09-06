import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.arturo.models.factories.MotorcycleFactory;
import dev.arturo.models.implementation.IVehicle;
import dev.arturo.models.vehiclesproduct.Motocycle; 


public class MotorcycleFactoryTest {
    
    MotorcycleFactory motorcycleFactory;

    @BeforeEach
    void setup() {
        motorcycleFactory = new MotorcycleFactory("MEV17P");
    }

    @Test
    void testCreatVehicle() {
        IVehicle moto = motorcycleFactory.creatVehicle();
        assertThat(moto, is(instanceOf(Motocycle.class)));
    }


@Test
void testGetters() {
    assertThat(motorcycleFactory.getCarRegistration(), is("MEV17P"));
}

void testSetters(){
    motorcycleFactory.setCarRegistration("28312196");
    assertThat(motorcycleFactory.getCarRegistration(), is("28312196"));
}
    
}