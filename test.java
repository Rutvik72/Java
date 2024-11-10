
import java.util.Arrays;
import java.util.List;


class HelloWorld {

    // QUESTION 1
    // static {
    //     System.out.println("Block 1");
    // }

    // public static void main() {
    //     System.out.println("Block 2");
    // }

    // public static void main(String[] args) {
    //     System.out.println("Block 3");
    //     main();
    // }

    // static { // These are static blocks and called once before the any static methods are created
    //     System.out.println("Block 4");
    // }

    // QUESTION 2
    // public static void main(String[] args) {
    //     System.out.println("Hello");
    //     if (true) {
    //         System.out.println("Inside if condition");
    //         // break; // should only go inside loops or switch case, so this would result in compile error
    //     }
    // }

    // QUESTION 7
    // public static void main(String[] args) {
    //     List<Integer> ints = Arrays.asList(1, 2, 3);
    //     List<? super Integer> nums = ints;
    //     ints.add(Integer.valueOf(4));
    //     System.out.println(nums);
    // }
}