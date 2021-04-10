public class OOPLinkedList {

    private OOPLinkedListElement head;

    private static class OOPLinkedListElement {
        int data;
        OOPLinkedListElement next;

        OOPLinkedListElement(int d) {
            data = d;
            next = null;
        }
    }


    public void insert(int data) {
        OOPLinkedListElement new_head = new OOPLinkedListElement(data);
        new_head.next = this.head;

        this.head = new_head;
    }

    public int remove(){
        int data = this.head.data;
        this.head = this.head.next;
        return data;
    }

    public int getHead() {
        return this.head.data;
    }

    public int getnth(int n) {
        OOPLinkedListElement current = this.head;
        for (int i=0;i<=n;i++) {
            if (current.next == null) {
                System.out.println("The list isn't that long.");
                return 0;
            } else {
                if (i==n) {
                    return current.data;
                } else {
                    current = current.next;
                }
            }
        }
        return 0;
    }

    public int length() {
        OOPLinkedListElement current = this.head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void reverse(){
        OOPLinkedListElement prev = null;
        OOPLinkedListElement current = this.head;
        OOPLinkedListElement next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        this.head = prev;
    }

}
