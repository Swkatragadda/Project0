package org.example.View;


import org.example.Model.ToDoList;

import org.example.Service.ToDoListService;
/*import org.example.View.TodoListView;
import java.util.Scanner;
*/
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main (String[] args){
    ToDoList model= new ToDoList();
    TodoListView view= new TodoListView();
    ToDoListService service =new ToDoListService(model,view);
        service.processUserInput();
    }
}