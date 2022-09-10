import java.util.*;

public class Main {
    public static final Random ran = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add( ran.nextInt(0, 2));
            Collections.sort(list);
            System.out.println(list);
        }
        System.out.println(" ");
        LinkedList<Integer> linkedList = new LinkedList<>(list);
        for (int i = 0; i < linkedList.size(); i++) {;
            Collections.sort(linkedList);
            System.out.println(linkedList);
        }
    }
}
