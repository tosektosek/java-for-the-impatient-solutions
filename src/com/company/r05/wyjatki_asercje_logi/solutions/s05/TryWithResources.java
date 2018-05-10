package com.company.r05.wyjatki_asercje_logi.solutions.s05;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

/**
 * @author Kamil
 */
public class TryWithResources {
    public static void main(String[] args) {
        List<String> lines = Arrays.asList("Mary had a little lamb. Its fleece was white as snow.".split(" "));
        PrintWriter out = null;
        try {
             out = new PrintWriter("output.txt");
            for(String line : lines) {
                out.println(line.toLowerCase());
            }
        } catch (IOException ex) {

        } finally {
            if(out != null)
            out.close();
        }
    }
}
