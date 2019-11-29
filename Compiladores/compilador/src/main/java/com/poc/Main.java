package main.java.com.gabrielspassos.poc;

import java.util.Arrays;
import java.util.List;

public class Main {

    private static final String DEFAULT_FILE = "teste1.lpd";

    public static void main(String[] args) {
        try {
            String fileName = getFileName(args);
            AnalisadorLexico analisadorLexico = new AnalisadorLexico(fileName);
            System.out.println("Analisando léxicamente o arquivo " + fileName);
            List<Token> tokens = analisadorLexico.analise(fileName);

            System.out.println("Número de tokens: " + tokens.size());

            tokens.forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String getFileName(String[] args) {
        return Arrays.stream(args)
                .findFirst()
                .orElse(DEFAULT_FILE);
    }
}
