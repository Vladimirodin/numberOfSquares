package ru.netology.sqr.numberOfSquares.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/parameter.csv")

    public void numberOfSquares(int expected, int beginningRange, int endRange) {
        SQRService service = new SQRService();

        int actual = service.numberOfSquares(beginningRange, endRange);

        Assertions.assertEquals(expected, actual);
    }
}
