import java.util.ArrayList;

 class ArrayListCheckEmpty {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);

        if (list1.isEmpty()) {
            System.out.println("list1 is empty");
        } else {
            System.out.println("list1 is not empty");
        }

        if (list2.isEmpty()) {
            System.out.println("list2 is empty");
        } else {
            System.out.println("list2 is not empty");
        }
    }
}
