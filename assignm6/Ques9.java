import java.util.LinkedList;
import java.util.Queue;

class StackUsingQueues {
    private Queue<Integer> mainQueue;
    private Queue<Integer> tempQueue;

    public StackUsingQueues() {
        mainQueue = new LinkedList<>();
        tempQueue = new LinkedList<>();
    }

    public void push(int element) {
    
        mainQueue.offer(element);
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
 
        while (mainQueue.size() > 1) {
            tempQueue.offer(mainQueue.poll());
        }
    
        int poppedElement = mainQueue.poll();
     
        Queue<Integer> temp = mainQueue;
        mainQueue = tempQueue;
        tempQueue = temp;
        return poppedElement;
    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        int topElement = 0;
      
        while (!mainQueue.isEmpty()) {
            topElement = mainQueue.poll();
            tempQueue.offer(topElement);
        }
     
        Queue<Integer> temp = mainQueue;
        mainQueue = tempQueue;
        tempQueue = temp;
        return topElement;
    }

    public boolean isEmpty() {
        return mainQueue.isEmpty();
    }
}

class StackElement {
    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top element of stack: " + stack.top());

        System.out.println("Elements popped from stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
