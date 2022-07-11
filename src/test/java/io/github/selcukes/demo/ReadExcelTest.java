package io.github.selcukes.demo;

import io.github.selcukes.databind.annotation.DataFile;
import io.github.selcukes.databind.annotation.Interpolate;
import io.github.selcukes.databind.annotation.Key;
import io.github.selcukes.databind.excel.ExcelMapper;
import io.github.selcukes.databind.substitute.StringSubstitutor;
import lombok.Data;
import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class ReadExcelTest {
    @Interpolate(substitutor = StringSubstitutor.class)
    @Data
    @DataFile(fileName = "TestData.xlsx", sheetName = "Yahoo")
    static class SampleExcel1 {
        @Key(name = "First Name")
        String firstName;
        @Key(name = "Last Name")
        String lastName;
    }

    @Test
    public void interpolateExcelMapperTest() {
        Stream<SampleExcel1> excelStream = ExcelMapper.parse(SampleExcel1.class);
        excelStream.forEach(System.out::println);
    }
}
