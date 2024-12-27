import java.util.ArrayList;

public class traning {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        for(Object numb : list){
          
            System.out.println(numb);
        }

        System.out.println(list.get(0));

    }
}
