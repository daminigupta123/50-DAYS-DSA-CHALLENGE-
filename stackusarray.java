public class stackusarray {

    int max = 5;
    int[] stack = new int[max];
    int top = -1;

    void push(int value) {
        if(top == max - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed");
        }
    }

    void pop() {
        if(top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top--] + " popped");
        }
    }

    public static void main(String[] args) {

        stackusarray s = new stackusarray();

        s.push(10);
        s.push(20);
        s.pop();
    }
}
