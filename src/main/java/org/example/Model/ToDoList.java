package org.example.Model;
import java.util.ArrayList;


public class ToDoList {
             private ArrayList<String> tasks;
        public ToDoList() {
        tasks = new ArrayList<>();
    }
         public void addTask(String task) {
        tasks.add(task);
    }
        public void removeTask(int index) {
        if(index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        }
    }
        public ArrayList<String> getTasks() {
        return new ArrayList<>(tasks);
        }

    }

