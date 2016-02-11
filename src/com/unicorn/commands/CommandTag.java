package com.unicorn.commands;

/**
 * Created by heiki on 11/02/16.
 */
public enum CommandTag {
    LOAD ('L'),
    DELIVER ('D'),
    WAIT ('W');


    private final char tag;

    CommandTag(char tag) {
        this.tag = tag;
    }

    public String toString() {
        return Character.toString(this.tag);
    }
}
