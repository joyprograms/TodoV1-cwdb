package com.theironyard.charlotte;

/**
 * Created by meekinsworks on 8/8/16.
 */

// we can write a program that constantly loops and
// provides an option to add, toggle, and list the to-do items.
public class ToDoItem {


    public String text;
    public boolean isDone;
    //declares fields

    public ToDoItem(String text, boolean isDone) {
        this.text = text;
        this.isDone = isDone;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

}