package stack;

public class DemoStackApp {
    public static void main(String[] args) {
        Integer arr[] = new Integer[5];
        Stack<Integer> stack = new Stack<Integer>(arr);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());
        System.out.println("stack.pop() = " + stack.pop());

        Stack<String> wochentage = new Stack<>(new String[7]);
        wochentage.push("Montag");
        wochentage.push("Dienstag");
        wochentage.push("Mittwoch");
        wochentage.push("Donnerstag");
        System.out.println(wochentage.pop());
        wochentage.push("Freitag");
        System.out.println(wochentage.pop());
        System.out.println(wochentage.pop());
    }
}
