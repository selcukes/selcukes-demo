package io.github.selcukes.demo;

import io.github.selcukes.databind.annotation.DataFile;
import io.github.selcukes.databind.annotation.Interpolate;
import io.github.selcukes.databind.annotation.Key;
import io.github.selcukes.databind.excel.ExcelMapper;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.Stream;

public class ReadExcelTest {
    @Interpolate(substitutor = FakerDataSubstitutor.class)
    @Data
    @DataFile(fileName = "TestData.xlsx", sheetName = "Yahoo")
    static class TestData {
        @Key(name = "First Name")
        String firstName;
        @Key(name = "Last Name")
        String lastName;
        @Key(name = "DOB", format = "MM-dd-yyyy")
        LocalDate dob;
        String location;

    }

    @Test
    public void interpolateExcelMapperTest() {
        Stream<TestData> dataStream = ExcelMapper.parse(TestData.class);
        dataStream.forEach(System.out::println);
    }
}
