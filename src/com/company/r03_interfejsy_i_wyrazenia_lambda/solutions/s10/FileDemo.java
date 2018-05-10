package com.company.r03_interfejsy_i_wyrazenia_lambda.solutions.s10;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

/**
 * @author Kamil
 */
public class FileDemo {
    private String catalogPath;

    public FileDemo(String catalogPath) {
        this.catalogPath = catalogPath;
    }

    public File[] getCatalogs() {
        File file = new File(catalogPath);
        return file.listFiles();
    }

    public static void main(String[] args) {
        FileDemo fileDemo = new FileDemo("E:\\");
        File[] files = fileDemo.getCatalogs();
//        for(File file : files)
//            System.out.println(file.getName());

        Arrays.asList(files).stream()
                .sorted((first, second) -> {
                    if(first.isDirectory() && !second.isDirectory())
                        return -1;
                    else if(!first.isDirectory() && second.isDirectory())
                        return 1;
                    return 0;
                })
                .forEach(System.out::println);
    }
}
