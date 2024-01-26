package org.example.Service;

import java.util.ArrayList;
import org.example.Model.ToDoList;
import org.example.View.TodoListView;

import java.util.Scanner;

public class ToDoListService {
    private ToDoList model;
    private  TodoListView view;
    private  Scanner scanner;

    public ToDoListService(ToDoList model, TodoListView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void processUserInput() {
        int option;

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (option) {
                case 1:

                    addTask();
                    break;
                case 2:

                    removeTask();
                    break;
                case 3:

                    displayTasks();
                    break;
                case 4:

                    view.showMessage("Existing todo List .Goodbye");
                    System.exit(0);
                    //break;
                default:

                    view.showMessage("Invalid choice.Please enter a number between 1 and 4.");
            }

        }
    }


    /*private void displayMenu()
    {
        view.showMessage("\nTodo List Menu:");
        view.showMessage("1. Add Task");
        view.showMessage("2.Remove Task");
        view.showMessage("3.Display Tasks");
        view.showMessage("4.Exit");
        view.showMessage("Enter your choice (1-4):");
    }
    */
    private void addTask() {
        view.showMessage("Enter task to add: ");
        String taskToAdd = scanner.nextLine();
        model.addTask(taskToAdd);
        view.showMessage("Task added:" + taskToAdd);
    }

    private void removeTask() {
        view.showMessage("Enter index of task to remove:");
        int indexToRemove = scanner.nextInt();
        model.removeTask(indexToRemove - 1);
    }

    private void displayTasks() {
        ArrayList<String> tasks = model.getTasks();
        view.displayTasks(tasks);
    }


}