public class MyStack {
    int size;
    int[] arr;
    int index = 0;

    public MyStack(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isEmpty()) {
            System.out.println("Fail!");
        }
        arr[index] = element;
        index++;

    }

    public int pop() {
        if (isEmpty() == true) {
            System.out.println("Fail!");
        }
        return arr[--index];

    }

    public int size() {
        return index;
    }

    public boolean isEmpty() {
        if (index == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (index == size) {
            return true;
        }
        return false;
    }


}
