import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BmiSertviceTest {


    @Test
    void shouldCalculateTrue() {
        BmiSertvice service = new BmiSertvice();

        double bmi = service.calculate(97, 1.65);
        System.out.println(bmi);

        double expected = 35;
        double actual = 35;
        assertEquals(expected, actual);
    }

        @Test
        void shouldCalculateNotTrue () {
            BmiSertvice service = new BmiSertvice();

            double bmi = service.calculate(97, 1.65);
            System.out.println(bmi);

            double expected = 30;
            double actual = 35;
            assertEquals(expected, actual);

        }
    }
