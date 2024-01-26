package org.example.View;

import java.util.ArrayList;

public class TodoListView {
    public void displayTasks(ArrayList<String> tasks){
        if(tasks.isEmpty()) {
            System.out.println("No tasks in the to-do lists.");
        } else{
            System.out.println("current tasks:");
            for(int i=0;i<tasks.size();i++) {
                System.out.println((i+1)+ ". "+tasks.get(i));
            }
        }
    }
public void showMessage(String message){
    System.out.println(message);
    }
}
