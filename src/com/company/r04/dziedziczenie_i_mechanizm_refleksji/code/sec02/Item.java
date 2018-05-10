package com.company.r04.dziedziczenie_i_mechanizm_refleksji.code.sec02;

import java.util.stream.Stream;

/**
 * @author Kamil
 */
public class Item {
    private Stream description;
    private double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        return Double.compare(item.price, price) == 0 && (description != null ? description.equals(item.description) : item.description == null);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = description != null ? description.hashCode() : 0;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public Item(Stream description, double price) {

        this.description = description;
        this.price = price;
    }
}
