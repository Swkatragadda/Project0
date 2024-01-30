package org.example.Service;

import java.util.ArrayList;

import org.example.Model.ToDoList;
import org.example.View.TodoListView;
import org.slf4j.LoggerFactory;
import org.example.Exception.InvalidMenuChoiceException;
import java.util.Scanner;
import java.util.logging.Level;

import org.slf4j.Logger;

public class ToDoListService {

   public static Logger log = LoggerFactory.getLogger(ToDoListService.class);
    private ToDoList model;
    private  TodoListView view;
    private  Scanner scanner;

    /** constructor to initialize the model,view ansd scanner **/
    public ToDoListService(ToDoList model, TodoListView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }
    public ToDoListService() {

    }

    /** Method to process user input and control the application flow **/
    public void processUserInput(int option) throws InvalidMenuChoiceException   {
      //  int option ;
             //  while (true) {

             /*   System.out.println("\nMenu for Todolist:");
                System.out.println("1. Add Task");
                System.out.println("2. Remove Task");
                System.out.println("3. Display Tasks");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");

                   option = scanner.nextInt();
                   scanner.nextLine(); // Consume newline character
*/
                switch (option) {
                    case 1:
                        addTask(" Add Task");
                        log.info("Entering the task" );
                        break;
                    case 2:
                        removeTask();
                        log.info("Removing the task" );
                        break;
                    case 3:
                        displayTasks();
                        log.info("displaying the task" );
                        break;
                    case 4:
                        view.showMessage("Existing todo List .Goodbye");
                        log.info("Exit the To do list." );
                        System.exit(0);
                        //break;
                    default:
                        //throw new CLIException("Invalid choice.Please enter a number between 1 and 4.");
                        //view.showMessage("Invalid choice.Please enter a number between 1 and 4.");
                        log.info("Invalid choice: {0}", option, Level.WARNING);
                        throw new InvalidMenuChoiceException("Invalid menu choice. Please try again");

}
        }

    /** Method to add a task based on user input **/
    public void addTask(String s) {
        try {
            view.showMessage("Enter task to add: ");
            String taskToAdd = scanner.nextLine();
            log.info("Attempting to add a task." );
            model.addTask(taskToAdd);
            view.showMessage("Task added:" + taskToAdd);
        }catch(IllegalArgumentException e){System.out.println("Please enter valid task. Null or space not allowed.");}
    }
    /** Method to remove a task based on user input **/
    public void removeTask() {
        try {
            view.showMessage("Enter index of task to remove:");
            int indexToRemove = scanner.nextInt();
            log.info("Attempting to remove a task." );
            model.removeTask(indexToRemove - 1);
        }catch(IndexOutOfBoundsException e){System.out.println("Invalid index exception");}
        catch(NumberFormatException e){System.out.println("number needed");}
    }

    /**
     * Method to displaytasks  tasks based on user input
     *
     * @return
     **/
    public ArrayList<String> displayTasks() {
        log.info("Attempting to display task." );
        ArrayList<String> tasks = model.getTasks();
        view.displayTasks(tasks);
        return tasks;
    }


}