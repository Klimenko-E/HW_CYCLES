package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
//import ru.netology.services.VacationService;

public class VacationServiceTest {

    @Test
    public void vacatin10_3_20() {

        VacationService service = new VacationService();
        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void vacatin100_60_150() {

        VacationService service = new VacationService();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);

    }

}
