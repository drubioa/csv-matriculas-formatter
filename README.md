# Removes whitespaces of larger CSV file.
[![Java CI with Maven](https://github.com/drubioa/csv-matriculas-formatter/actions/workflows/maven.yml/badge.svg)](https://github.com/drubioa/csv-matriculas-formatter/actions/workflows/maven.yml)

# Starting 🚀
The main purpose of this project is sample, we have larger csv file, and need remove all whitespaces of specific csv column.

This application is sample main class which following atributes:
```java
public class CsvMatriculasFormatterApplication {

    // Absolute path of csv file which need remove whitespace column
    private static String csvFile = "/Users/dbiosag/Workspace/CsvMatriculasFormaterApplication/example.csv";
    // Absolute path to save csv file with result of remove whitespace column and identifier column
    private static String csvDestinyFile = "/Users/dbiosag/Workspace/CsvMatriculasFormaterApplication/result.csv";
    // number of column of csv file which need remove whitespace
    private static final int MATRICULAS_COLUMN = 6;
    ...
```

## Examples
### Initial scv file
```csv
id,nombre,nif,dir,localidad,cp,matriculas
1,Anonymous1,24314787S,CARRER MADRID 66, PALENCIA, 34321, 9819 AYY
2,VALERIA SEGURA CORRAL,48647581M, ENPARANTZA MAYOR 75, SEGOVIA, 40988, 7310 EVQ
3,GERARDO VELEZ CHAMORRO,35233585T,PRAZA HORNO 0,CUENCA, 16293, 6221 UZL
```
### Result of changes
```csv
nombre,nif,dir,localidad,cp,matriculas
Anonymous1,24314787S,CARRER MADRID 66, PALENCIA, 34321,9819AYY
VALERIA SEGURA CORRAL,48647581M, ENPARANTZA MAYOR 75, SEGOVIA, 40988,7310EVQ
GERARDO VELEZ CHAMORRO,35233585T,PRAZA HORNO 0,CUENCA, 16293,6221UZL
```
## Requirements 📋
To install and run this project you may be installes next requirements:
- openjdk 11.0.11 2021-04-20
- Apache Maven 3.8.3

## Installation 🔧
To generate jar file the following command is:
```
mvn package
```

# Running project ⚙️
To run jar file, in `target` folder:
```
java -jar csv-matriculas-formatter-1.0-SNAPSHOT.jar
```

