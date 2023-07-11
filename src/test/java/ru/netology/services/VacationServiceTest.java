package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
//import ru.netology.services.VacationService;

public class VacationServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/vacation.csv")
    public void vacation(int income, int expense, int threshold, int expected) {

        VacationService service = new VacationService();
        int actual = service.calculate(income, expense, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
