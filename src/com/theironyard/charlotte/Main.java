package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //checking git

    public static void main(String[] args) {
        // write your code here

        ArrayList<ToDoItem> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);// read in input and scan it in

        while (true) {// will have to break out of loop at some point
            System.out.println("1. Create to-do item");// adding statements
            System.out.println("2. Toggle to-do item");
            System.out.println("3. List to-do items");
            // this is an endless list oftodo statmeents at point

            String option = scanner.nextLine();
//
            if (option.equals("1")) {
                System.out.println("Enter your to-do item:");

                String text = scanner.nextLine();
                ToDoItem item = new ToDoItem(text, false);
                items.add(item);
            } else if (option.equals("2")) {
                System.out.println("Enter the number of the item you want to toggle:");

                int idx = Integer.valueOf(scanner.nextLine());

                ToDoItem currentTodo = items.get(idx);
                currentTodo.setDone(!currentTodo.isDone());

            } else if (option.equals("3")) {
                System.out.println("Listing To do Items");

                String checkbox = "[]";
                String finishedCheckBox = "[x]";
                //set reference points for our finished items
                for (int i = 0; i < items.size(); i++) {
                    ToDoItem currentItem = items.get(i);

                    System.out.printf("%d. %s %s\n",
                            i, currentItem.isDone() ? finishedCheckBox : checkbox, // if finished, check box, if not finished, no check
                            currentItem.getText());// prints text of current todo
                }
            } else {
                System.out.println("Please try again");
            }

        }
    }
}
