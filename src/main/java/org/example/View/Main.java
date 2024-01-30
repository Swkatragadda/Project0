package org.example.View;
import java.util.Scanner;

import org.example.Exception.CLIException;
import org.example.Exception.InvalidMenuChoiceException;
import org.example.Model.ToDoList;

import org.example.Service.ToDoListService;

import org.example.View.TodoListView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public  Scanner scanner;

    int option ;
    public static void main (String[] args) throws InvalidMenuChoiceException {
   Scanner scanner = new Scanner(System.in);
        /*Create instances of the model ,view ,and service */
    ToDoList model= new ToDoList();
    TodoListView view= new TodoListView();
    ToDoListService service =new ToDoListService(model,view);
        int choice;
       do {
           System.out.println("\nMenu for Todolist:");
           System.out.println("1. Add Task");
           System.out.println("2. Remove Task");
           System.out.println("3. Display Tasks");
           System.out.println("4. Exit");
           System.out.print("Choose an option: ");

           choice = scanner.nextInt();
           scanner.nextLine();

               /* start the application by processing user input **/
               service.processUserInput(choice);

       }while (choice !=4);
       scanner.close();
       }
    }