package com.company.r05.wyjatki_asercje_logi.solutions.s06;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author Kamil
 */
public class TryWithCatchFinally {

    public static void main(String[] args) {
//        BufferedReader in = null;
//        Path path = null;
//        try {
//            in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
//
//        } catch (IOException ex) {
//            System.err.println(ex.getMessage());
//        } finally {
//            if (in != null)
//                try {
//                    in.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//        }

        try(BufferedReader in = Files.newBufferedReader(null, StandardCharsets.UTF_8)) {

        } catch (IOException ex) {

        }
    }
}
