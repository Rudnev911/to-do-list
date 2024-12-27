import java.util.ArrayList;

public class TaskManager {
    public ArrayList<String> list = new ArrayList<>();
    
    void viewTasks(){
        for (String task : list) {
            System.out.println(task);
        }
    }

    void addTask(String name, String description){
        list.add(name + description);
    }

    void deleteTask(int id){
        list.remove(id - 1);
    }
}
