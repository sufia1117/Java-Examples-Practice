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

}
