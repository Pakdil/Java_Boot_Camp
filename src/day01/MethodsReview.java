package day01;

public class MethodsReview {

    public static void main(String[] args) {

        String str1 = "Cydeo";
        printEach(str1);
    /*
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
        }

     */
        System.out.println("-------------------------------");

        String str2 = "Java";
        printEach(str2);

        System.out.println("-------------------------------");

        String str3 = "WoodenSpoon";
        printEach(str3);


    }

    public static void printEach(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }
}
