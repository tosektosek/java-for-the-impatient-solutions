package com.company.r04.dziedziczenie_i_mechanizm_refleksji.solutions.s07;

public enum Colors {
    
    BLACK("ff","ff","ff"), RED("ff","00","00"), BLUE("00","00","ff"),
    GREEN("00","ff","00"), CYAN("00","ff","ff"), MAGENTA("ff","00","ff"), YELLOW("ff","ff","00"), WHITE("00","00","00");

    private String red;
    private String green;
    private String blue;

    Colors(String red, String green, String blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String getRed() {
        return red;
    }

    public String getGreen() {
        return green;
    }

    public String getBlue() {
        return blue;
    }


}