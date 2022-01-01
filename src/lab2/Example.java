package lab2;


public class Example {
    public static void doIt(SimpleCLass c1, SimpleCLass c2) {
        c2 = new SimpleCLass(9);
        c1.incr();
        c2.incr();
        c1.incr();
        c2 = c1;
        c2.incr();
    }

    public static void main(String[] args) {
        SimpleCLass c1 = new SimpleCLass(3);
        SimpleCLass c2 = new SimpleCLass(4);
        doIt(c1, c2);
        System.out.println("Line 1: " + c1.getValue() + " " + c2.getValue());

        c1 = new SimpleCLass(3);
        c2 = new SimpleCLass(5);
        doIt(c2, c1);
        System.out.println("Line 2: " + c1 + " " + c2);

        doIt(c1, c1);
        System.out.println("Line 3: " + c1 + " " + c2);

        doIt(c2, c2);
        System.out.println("Line 4: " + c1 + " " + c2);
    }
}
