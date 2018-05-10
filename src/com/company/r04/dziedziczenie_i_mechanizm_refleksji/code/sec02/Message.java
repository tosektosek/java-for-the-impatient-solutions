package com.company.r04.dziedziczenie_i_mechanizm_refleksji.code.sec02;

import java.util.ArrayList;

/**
 * @author Kamil
 */
public final class Message {
    private String sender;
    private ArrayList<String> recipents;
    private String text;

    public Message(String sender, String text) {
        this.sender = sender;
        recipents = new ArrayList<>();
        this.text = text;
    }

    public void addRecipent(String recipent) {
        recipents.add(recipent);
    }

    public Message clone() {
        try {
            Message cloned = (Message) super.clone();
            @SuppressWarnings("unchecked") ArrayList<String> clonedRecipents
                    = (ArrayList<String>) recipents.clone();
            cloned.recipents = clonedRecipents;
            return cloned;
        } catch (CloneNotSupportedException ex) {
            return null;
        }
    }
}
