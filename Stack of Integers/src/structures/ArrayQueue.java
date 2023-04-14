package structures;

// T is a placeholder for whatever type we choose to add into the queue
// called a "type parameter"
public class ArrayQueue<T> {  // implements Queue<T>
    private T[] elements;
    private int head;
    private int tail;

    public boolean isEmpty(){
        return head == tail;
    }
    public boolean isFull(){
        if (head == 0)
            return tail == elements.length - 1;
        else
            return tail == head - 1; // when tail immediately precedes head
    }

    public T front() throws Exception {
        if (isEmpty())
            throw new Exception("Empty queue has no front element");
        return elements[head];
    }

    public T back() throws Exception {
        if (isEmpty())
            throw new Exception("Empty queue has no front element");
        if (tail == 0)
            return elements[elements.length - 1];
        else // else can be removed or kept for organization
            return elements[head - 1];
    }
    public void enqueue(T value) throws Exception {
        if (isFull())
            throw new Exception("Cannot enqueue on a full queue");
        elements[tail] = value;
        tail++;
        if (tail == elements.length)
            tail = 0;
    }

    public T dequeue() throws Exception {
        T data = front();
        if (head == elements.length - 1)
            head = 0;
        else
            head++;
        return data;
    }

}
