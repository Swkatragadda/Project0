import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.example.Model.ToDoList;
import org.example.Service.ToDoListService;
import org.example.View.TodoListView;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class ToDoListTest {
  ToDoListService toDoListService;
    ToDoList toDoList;
    TodoListView toDoListView;
    ArrayList<String> tasksList;
    private Scanner scanner;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

  @Before
    public void setup(){
      toDoList =new ToDoList();
      TodoListView view =new TodoListView();
      ToDoList model = new ToDoList();
      view = new TodoListView();
      System.setOut(new PrintStream(outputStream));
      ToDoListService service = new ToDoListService(model, view);
      this.scanner = new Scanner(System.in);
  }


/* checking that there are no tasks at the start */
@Test
 public void testEmptyTasksAtStart(){
     tasksList = toDoList.getTasks();
     Assert.assertTrue(tasksList.size() == 0);
    // toDoListView.displayTasks(tasksList);1
}
    /* checking valid list of tasks are added to list*/
 @Test
    public void addTasksTest(){

        String testTaskValue = "Remove Garbage";
        toDoList.addTask(testTaskValue);
         tasksList = toDoList.getTasks();
        /*tasksList actual = tasks.get(0);*/
        assertEquals(testTaskValue,tasksList.get(0));
         //toDoListView.displayTasks(tasksList);
    }
}



