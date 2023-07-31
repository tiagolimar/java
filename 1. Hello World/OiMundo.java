import java.util.ArrayList;
import java.util.List;

public class OiMundo {
    public static void main (String[] args) {
        System.out.println("Oi mundo\n");

        List<String> list = new ArrayList<>();
        
        list.add("Item 01");
        list.add("Item 02");
        list.add("Item 03");

        String msg = String.format("A lista atualmente está assim: %s\n",list);
        System.out.println(msg);

        for (int i=0; i<list.size();i++){
            String msg_for = String.format("Esse é o item %s",list.get(i));
            System.out.println(msg_for);
        }


    }
}