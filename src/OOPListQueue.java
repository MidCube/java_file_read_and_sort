public class OOPListQueue implements Queue<Integer> {
    OOPLinkedList fronthalf = new OOPLinkedList();
    OOPLinkedList backhalf = new OOPLinkedList();

    public void offer(Integer x) {
        backhalf.insert(x);
    }

    public Integer poll() {
        if (fronthalf.length()>0) {
            return fronthalf.remove();
        } else {
            OOPLinkedList temp = fronthalf;
            backhalf.reverse();
            fronthalf = backhalf;
            backhalf = fronthalf;
            return fronthalf.remove();
        }
    }

    public Integer peek() {
        if (fronthalf.length()>0) {
            return fronthalf.getHead();
        } else {
            OOPLinkedList temp = fronthalf;
            backhalf.reverse();
            fronthalf = backhalf;
            backhalf = fronthalf;
            return fronthalf.getHead();
        }
    }

    public void remove() {
        if (fronthalf.length()>0) {
            fronthalf.remove();
        } else {
            OOPLinkedList temp = fronthalf;
            backhalf.reverse();
            fronthalf = backhalf;
            backhalf = fronthalf;
            fronthalf.remove();
        }
    }

    public int size() {
        return (fronthalf.length()+backhalf.length());
    }
}
