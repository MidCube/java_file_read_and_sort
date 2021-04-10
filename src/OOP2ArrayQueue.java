public class OOP2ArrayQueue implements Queue<Integer> {

    private int head;
    private int bottom;
    private Integer[] listone;
    private Integer[] listtwo;
    private final int length;

    OOP2ArrayQueue(int length) {
        this.length = length;
        listone = new Integer[length];
        listtwo = new Integer[length];
        head = 0;
        bottom = 0;

    }

    public void offer(Integer x){
        this.listtwo[this.bottom] = x;
        if (this.bottom == length-1 ) {
            this.bottom = 0;
        } else {
            this.bottom++;
        }
    }

    public Integer poll() {
        Integer data = this.listone[head];
        if (data.equals(null)) {
            Integer[] temp = listone;
            listone = listtwo;
            listtwo = temp;
            this.head = 0;
            this.bottom = 0;
            data = this.listone[head];
        }

        this.listone[head] = null;
        if (head == this.length-1 ) {
            Integer[] temp = listone;
            listone = listtwo;
            listtwo = temp;
            this.head = 0;
            this.bottom = 0;
        } else {
            this.head++;
        }
        return data;

    }

    public Integer peek() {
        Integer data = this.listone[head];
        if (data.equals(null)) {
            Integer[] temp = listone;
            listone = listtwo;
            listtwo = temp;
            this.head = 0;
            this.bottom = 0;
            data = this.listone[head];
        }
        return data;
    }

    public void remove() {
        if (this.listone[head].equals(null)) {
            Integer[] temp = listone;
            listone = listtwo;
            listtwo = temp;
            this.head = 0;
            this.bottom = 0;
        }
        this.listone[head] = null;
        if (this.head == this.length-1 ) {
            Integer[] temp = listone;
            listone = listtwo;
            listtwo = temp;
            this.head = 0;
            this.bottom = 0;
        } else {
            this.head++;
        }
    }

    public int size() {
        int size = 0;
        for (int i = 0;i<this.length;i++) {
            if (this.listone[i] != null) {
                size++;
            }
            if (this.listtwo[i] != null) {
                size++;
            }
        }
        return size;
    }
}
