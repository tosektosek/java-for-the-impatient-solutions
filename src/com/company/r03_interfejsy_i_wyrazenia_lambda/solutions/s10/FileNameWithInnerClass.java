package com.company.r03_interfejsy_i_wyrazenia_lambda.solutions.s10;

import java.io.File;
import java.io.FileFilter;

/**
 * @author Kamil
 */
public class FileNameWithInnerClass {

    private String catalogPath;

    public FileNameWithInnerClass(String catalogPath) {
        this.catalogPath = catalogPath;
    }

    public File[] getCatalogs() {
        File file = new File(catalogPath);
        return file.listFiles(fileFilter());
    }

    static FileFilter fileFilter() {
        return new FileFilter() {

            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        };
    }

    public static void main(String[] args) {
        FileNameWithInnerClass fileDemo = new FileNameWithInnerClass("E:\\");
        File[] files = fileDemo.getCatalogs();
        for(File file : files)
            System.out.println(file.getName());
    }
}
