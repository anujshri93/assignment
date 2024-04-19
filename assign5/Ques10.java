class DoublyListNode {
    int val;
    DoublyListNode prev;
    DoublyListNode next;

    DoublyListNode(int val) {
        this.val = val;
    }
}

 class BubbleSortDoublyLinkedList {
    public DoublyListNode bubbleSort(DoublyListNode head) {
        if (head == null || head.next == null) {
            return head; 
        }

        boolean swapped;
        DoublyListNode last = null;

        do {
            swapped = false;
            DoublyListNode curr = head;

            while (curr.next != last) {
                if (curr.val > curr.next.val) {
                    swap(curr, curr.next);
                    swapped = true;
                }
                curr = curr.next;
            }
            last = curr; 
        } while (swapped);

        return head;
    }

 
    private void swap(DoublyListNode node1, DoublyListNode node2) {
        int temp = node1.val;
        node1.val = node2.val;
        node2.val = temp;
    }

    
    public void printList(DoublyListNode head) {
        DoublyListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyListNode head = new DoublyListNode(4);
        head.next = new DoublyListNode(2);
        head.next.prev = head;
        head.next.next = new DoublyListNode(1);
        head.next.next.prev = head.next;
        head.next.next.next = new DoublyListNode(3);
        head.next.next.next.prev = head.next.next;

        BubbleSortDoublyLinkedList sorter = new BubbleSortDoublyLinkedList();
        System.out.println("Original Doubly Linked List:");
        sorter.printList(head);

        DoublyListNode sortedHead = sorter.bubbleSort(head);

        System.out.println("Sorted Doubly Linked List:");
        sorter.printList(sortedHead);
    }
}
