package com.company.r03_interfejsy_i_wyrazenia_lambda.code.sec6;

import java.awt.*;

@FunctionalInterface
public interface PixelFunction {
    Color apply(int x, int y);
}
