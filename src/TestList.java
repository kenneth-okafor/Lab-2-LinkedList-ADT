public class TestList {
    public static void main(String[] args) {

        ListReferenceBased list = new ListReferenceBased();

        System.out.println("Is list empty? " + list.isEmpty());
        System.out.println("Size of list: " + list.size());

        //add()
        list.add(1, "Apple");
        list.add(2, "Banana");
        list.add(3, "Strawberry");
        list.add(4, "Orange");

        System.out.println("Size after adding items: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());

        //get()
        System.out.println("Item at 1: "  + list.get(1));
        System.out.println("Item at 2: "  + list.get(2));
        System.out.println("Item at 3: "  + list.get(3));
        System.out.println("Item at 4: "  + list.get(4));
    }
}
