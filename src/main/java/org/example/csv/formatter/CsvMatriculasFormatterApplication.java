package org.example.csv.formatter;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

public class CsvMatriculasFormatterApplication {

    private static String csvFile = "/Users/dbiosag/Workspace/CsvMatriculasFormaterApplication/example.csv";
    private static String csvDestinyFile = "/Users/dbiosag/Workspace/CsvMatriculasFormaterApplication/result.csv";
    private static final int MATRICULAS_COLUMN = 6;

    public static void main(String[] args) throws IOException, CsvValidationException {
        System.out.println("[Start] Remove white space in csv file "+
                csvFile+ "in column " + MATRICULAS_COLUMN);
        Instant start = Instant.now();
        long n = 0L;
        CSVReader reader = new CSVReader(new FileReader(csvFile));
        CSVWriter writer = new CSVWriter(new FileWriter(csvDestinyFile));
        String [] nextLine;
        while ((nextLine = reader.readNext()) != null) {
            if(nextLine.length >= MATRICULAS_COLUMN) {
                nextLine[MATRICULAS_COLUMN] = nextLine[MATRICULAS_COLUMN]
                        .replaceAll("\\s+", "");
                writer.writeNext(Arrays.copyOfRange(nextLine, 1, nextLine.length), false);
                writer.flush();
                n++;
            }
        }
        Instant end = Instant.now();
        System.out.println("Finish in " + Duration.between(start, end).getSeconds() +" seconds");
        System.out.println("Read " + n +" lines");
        System.out.println("[End] Removed white space in csv file, file with results "+
                csvDestinyFile);
    }
}