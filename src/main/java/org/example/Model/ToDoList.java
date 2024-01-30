package org.example.Model;
import java.util.ArrayList;


public class ToDoList {
             private ArrayList<String> tasks;

        public ToDoList() { /** Constrcutor to init the task list **/
        tasks = new ArrayList<>();
    }
         public void addTask(String task) { /** Method to add a task to the list **/
         if(task ==null || task.trim().isEmpty()){ throw new IllegalArgumentException("Task cannot be Empty");}
        tasks.add(task);
    }
        public void removeTask(int index) {  /** Method to remove a task to the list **/
        //if(index >= 0 && index < tasks.size()) {
            tasks.remove(index);
        //}
    }
        public ArrayList<String> getTasks() { /** Method to get a copy of the task list **/
        return new ArrayList<>(tasks);
        }

    }

