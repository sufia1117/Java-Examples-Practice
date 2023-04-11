package structures;

public class ArrayStack<T> implements Stack {
    private T[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 16;

    public ArrayStack(){
        this(DEFAULT_CAPACITY);
    }
    public ArrayStack(int capacity) {elements = (T[]) new Object[capacity];}

    @Override
    public void push(Object value){
        if(size >= elements.length){
            T[] temp = (T[]) new Object[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        elements[size++] = (T) value;


    }

    public T pop(){
        return elements[--size];
    }

    public T peek(){
        return elements[size - 1];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args){
        Stack<Integer> s = new ArrayStack<>(); // can switch LinkedStack<> with ArrayStack<>

        s.push(Integer.valueOf(5));
        s.push(Integer.valueOf(2));
        s.push(Integer.valueOf(8));
        s.push(Integer.valueOf(15));

        System.out.println(s.isEmpty());  // should print 'false'

        while (!s.isEmpty()) {
            System.out.println(s.peek());  // should print each element from top to bottom
            s.pop();
        }

        System.out.println(s.isEmpty());  // should print 'true'
    }

}
