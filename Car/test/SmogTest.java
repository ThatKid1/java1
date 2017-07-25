
import car.Car;
import org.junit.Test;
import static org.junit.Assert.*;

public class SmogTest {
double e = 0.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000001;
        Car car1 = new Car("Toyota", "Camry", 1999, "ToyYoda", "Green", 18, 10000000);
        
        @Test
        public void makeGetterTest() {
            assertEquals(car1.getMake(), "Toyota");
        }

        @Test
        public void modelGetterTest() {
            assertEquals(car1.getModel(), "Camry");
        }
        
        @Test
        public void NicknameGetterTest() {
            assertEquals(car1.getNickname(), "ToyYoda");
        }
        
        @Test
        public void ColorGetterTest() {
            assertEquals(car1.getColor(), "Green");
        }
        
        @Test
        public void YearGetterTest() {
            assertEquals(car1.getYear(), 1999);
        }    
        
        @Test
        public void YearsOwnedGetterTest() {
            assertEquals(car1.getYearsOwned(), 18);
        }
        
        @Test
        public void MilesGetterTest() {
            assertEquals(car1.getMiles(), 10000000, e);
        }
}

        



