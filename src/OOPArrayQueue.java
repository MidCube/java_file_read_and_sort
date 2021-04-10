public class OOPArrayQueue implements Queue<Integer> {

    private int head;
    private int bottom;
    private Integer[] list;

    OOPArrayQueue(int length) {
        list = new Integer[length];
        head = 0;
        bottom = 0;

    }

    public void offer(Integer x){
        this.list[this.bottom] = x;
        if (this.bottom == this.size()-1 ) {
            this.bottom = 0;
        } else {
            this.bottom++;
        }
    }

    public Integer poll() {
        int data = this.list[head];
        this.list[head] = null;
        if (this.head == this.size()-1 ) {
            this.head = 0;
        } else {
            this.head++;
        }
        return data;

    }

    public Integer peek() {
        return this.list[head];
    }

    public void remove() {
        this.list[head] = null;
        if (this.head == this.size()-1 ) {
            this.head = 0;
        } else {
            this.head++;
        }
    }

    public int size() {
        return this.list.length;
    }
}
