package com.datapreparation;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class DataPreparationRunner {
    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("src/main/java/com/datapreparation/in/input.csv");
        CSVReader csvReader = new CSVReaderBuilder(fileReader)
                .withSkipLines(1)
                .build();
        List<String[]> strings = csvReader.readAll();
        System.out.println();
    }
}
