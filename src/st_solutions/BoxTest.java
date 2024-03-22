package st_solutions;

public class BoxTest {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.add(1);
        box.add(2);
        box.add(3);
        box.add(4);
        box.getElements();
        System.out.println();
        box.remove(0);
        box.getElements();

    }
}
