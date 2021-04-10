import java.util.Collection;

interface Queue<T> {
    public void offer(T x);
    public T poll();
    public T peek();
    public void remove();
    public int size();
}
