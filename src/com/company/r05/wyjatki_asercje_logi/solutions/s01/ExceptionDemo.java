package com.company.r05.wyjatki_asercje_logi.solutions.s01;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Kamil
 */
public class ExceptionDemo {
    public static ArrayList<Double> readValues(String filename) throws IOException{
        ArrayList<Double> results = new ArrayList<>();

        try(Scanner in = new Scanner(Paths.get(filename))) {
            while (in.hasNextLine()) {
               results.add(Double.parseDouble(in.nextLine()));
            }
        } catch (IOException ex) {
            System.out.println("ERROR " + ex.getClass().getName());
            ex.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println(e.getClass().getName());
        }
        return results;
    }

    public static double sumOfValues(String filename) throws NumberFormatException, IOException {
        ArrayList<Double> result = readValues(filename);

        double sum = 0;
        for(Double d : result)
            sum+= d;
        return sum;

    }
    public static void main(String[] args) throws IOException {
        try(PrintWriter out = new PrintWriter("double.txt")) {
            out.println(22.2);
            out.println(232.21);
            out.println("sds");
        } catch (Exception ex) {
            System.out.println("ERROR " + ex.getClass().getName());
        }

        System.out.println("Wynik: + "+sumOfValues("double.txt"));
    }
}
