import java.util.*;

class Deque {
    private int[] deque;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public Deque(int capacity) {
        this.capacity = capacity;
        deque = new int[capacity];
        front = -1;
        rear = 0;
        size = 0;
    }

    public void insertFront(int element) {
        if (isFull()) {
            throw new IllegalStateException("Deque is full");
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = capacity - 1;
        } else {
            front--;
        }
        deque[front] = element;
        size++;
    }

    public void insertRear(int element) {
        if (isFull()) {
            throw new IllegalStateException("Deque is full");
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else if (rear == capacity - 1) {
            rear = 0;
        } else {
            rear++;
        }
        deque[rear] = element;
        size++;
    }

    public int deleteFront() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        int deletedElement = deque[front];
        if (front == rear) {
            front = -1;
            rear = 0;
        } else if (front == capacity - 1) {
            front = 0;
        } else {
            front++;
        }
        size--;
        return deletedElement;
    }

    public int deleteRear() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        int deletedElement = deque[rear];
        if (front == rear) {
            front = -1;
            rear = 0;
        } else if (rear == 0) {
            rear = capacity - 1;
        } else {
            rear--;
        }
        size--;
        return deletedElement;
    }

    public int getFront() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return deque[front];
    }

    public int getRear() {
        if (isEmpty()) {
            throw new NoSuchElementException("Deque is empty");
        }
        return deque[rear];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }
}

 class Deque1 {
    public static void main(String[] args) {
        Deque deque = new Deque(5);

        deque.insertRear(1);
        deque.insertRear(2);
        deque.insertFront(3);
        deque.insertFront(4);

        System.out.println("Size of deque: " + deque.size());
        System.out.println("Front element of deque: " + deque.getFront());
        System.out.println("Rear element of deque: " + deque.getRear());

        System.out.println("Elements deleted from deque:");
        while (!deque.isEmpty()) {
            System.out.println(deque.deleteFront());
        }
    }
}
