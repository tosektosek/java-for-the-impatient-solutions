package com.company.r04.dziedziczenie_i_mechanizm_refleksji.code.sec02;

import java.util.stream.Stream;

/**
 * @author Kamil
 */
public class DiscountedItem extends  Item{
    private double discount;

    public DiscountedItem(Stream description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DiscountedItem that = (DiscountedItem) o;

        return Double.compare(that.discount, discount) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(discount);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
