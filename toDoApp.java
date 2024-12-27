import java.util.Scanner;

public class toDoApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager user = new TaskManager();

        System.out.println("to-do-list\n1. Создать задачу\n2. Удалить задачу\n\nСписок задач:\n" + user.list);
        
        do{
            if(scanner.nextInt() == 1){ // add task
                
                System.out.println("Введите имя задачи - ");
                String task_name = scanner.nextLine();
                System.out.println("Введите описание задачи - ");
                String task_desc = scanner.nextLine();
                user.addTask(task_name, task_desc);
                System.out.println("Новый список - \n" + user.list);
            }
        }
        while(scanner.nextInt() != 0 || scanner.nextInt() != 2);

        if(scanner.nextInt() == 2){ // delete task
            System.out.println("Какую задачу удалить ?");
            int taskN = scanner.nextInt();
            user.deleteTask(taskN);
            System.out.println("Новый список - \n" + user.list);
        }

    }
}