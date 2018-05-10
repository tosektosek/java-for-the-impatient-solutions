package com.company.r03_interfejsy_i_wyrazenia_lambda.solutions.s11;

import java.io.File;
import java.util.Arrays;

/**
 * @author Kamil
 */
public class FileDemo_FilenameFilter {

    private String pathName;
    private String extension;

    public FileDemo_FilenameFilter(String pathName, String extension) {
        this.pathName = pathName;
        this.extension = extension;
    }

    public String[] getFiles() {
        File file = new File(pathName);
        return file.list((path, name) -> {
           name = name.toLowerCase();
           extension = extension.toLowerCase();
           return name.endsWith(extension);
        });
    }

    public static void main(String[] args) {
        FileDemo_FilenameFilter filter = new FileDemo_FilenameFilter("E://", ".dll");
        String[] files = filter.getFiles();

        Arrays.asList(files).forEach(System.out::println);
    }
}
