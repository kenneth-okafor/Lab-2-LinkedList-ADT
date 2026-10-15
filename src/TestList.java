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

        //remove()
        list.remove(2);

        System.out.println("Size after removing items: " + list.size());

        System.out.println("Item at 1: "  + list.get(1));
        System.out.println("Item at 2: "  + list.get(2));
        System.out.println("Item at 3: "  + list.get(3));

        //removeAll()
        list.removeAll();

        System.out.println("Size after removing all items: " + list.size());
        System.out.println("Is list empty? "  + list.isEmpty());


        //displayList()
        list.add(1, "Apple");
        list.add(2, "Banana");
        list.add(3, "Strawberry");
        list.add(4, "Orange");

        System.out.println("Display Linked List:");
        list.displayList();

        //listLongest()
        System.out.println("Longest String: " + list.listLongest());

        //inserting an item in the middle
        list.add(2, "Watermelon");

        System.out.println("List after inserting Watermelon");
        list.displayList();

        System.out.println("Longest String: " + list.listLongest());

        //removing first item
        list.remove(1);

        System.out.println("List after removing first item: ");
        list.displayList();

        System.out.println("Size: " + list.size());

        //invalid get index
        try {
            list.get(10);
        } catch (ListIndexOutOfBoundsException e) {
            System.out.println("Get error: " + e.getMessage());
        }

        //invalid add index
        try {
            list.add(10, "Mango");
        }  catch (ListIndexOutOfBoundsException e) {
            System.out.println("Add error: " + e.getMessage());
        }

        //invalid remove index
        try {
            list.remove(10);
        }   catch (ListIndexOutOfBoundsException e) {
            System.out.println("Remove error: " + e.getMessage());
        }

        //listLongest on empty list
        list.removeAll();

        System.out.println("Longest String in empty list: " + list.listLongest());

        System.out.println("Is list empty? " + list.isEmpty());
    }
}
