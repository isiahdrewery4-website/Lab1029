public class StringArrayLab {
    public static void main(String[] args) {
        String[] names = {"John Moss", "Mary Johns", "Mark Woods", "Welbeck Sutcliff", "Nancy Brose"};

        System.out.println("Student List:");
        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }

        System.out.println(); // Blank line for formatting

        System.out.println("Total number of names: " + names.length);

        System.out.println("First name in the array: " + names[0]);
        System.out.println("Last name in the array: " + names[names.length - 1]);
    }
}
