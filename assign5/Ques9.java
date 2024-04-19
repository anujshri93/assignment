class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class BubbleSortLinkedList {
    public ListNode bubbleSort(ListNode head) {
        if (head == null || head.next == null) {
            return head; 
        }

        ListNode temp;
        boolean swapped;
        do {
            swapped = false;
            ListNode prev = null;
            ListNode curr = head;
            ListNode nextNode = head.next;

            while (nextNode != null) {
                if (curr.val > nextNode.val) {
                  
                    if (prev != null) {
                        prev.next = nextNode;
                    } else {
                        head = nextNode;
                    }
                    curr.next = nextNode.next;
                    nextNode.next = curr;
                    temp = curr;
                    curr = nextNode;
                    nextNode = temp;
                    swapped = true;
                }
                prev = curr;
                curr = nextNode;
                nextNode = nextNode.next;
            }
        } while (swapped);

        return head;
    }

   
    public void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);

        BubbleSortLinkedList sorter = new BubbleSortLinkedList();
        System.out.println("Original Linked List:");
        sorter.printList(head);

        ListNode sortedHead = sorter.bubbleSort(head);

        System.out.println("Sorted Linked List:");
        sorter.printList(sortedHead);
    }
}
