package library.model;

public class BookNumberPrinter {

    public void printNumberType(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            } else if (i % 3 == 0) {
                System.out.println(i + " divisible by 3");
            } else {
                System.out.println(i + " something else");
            }
        }
    }
}