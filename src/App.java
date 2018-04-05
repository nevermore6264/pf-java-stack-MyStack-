public class App {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println("1. Size of stack after push operations: " + stack.size());

        System.out.println("------------------------------------------------");

        System.out.printf("2. Pop elements from stack : ");

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + "\t");
        }

        System.out.println("\n------------------------------------------------");

        System.out.println("3. Size of stack after pop operations : " + stack.size());
    }
}

