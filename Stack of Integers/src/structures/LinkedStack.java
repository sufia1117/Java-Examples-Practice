package structures;

// 1. Create a new node
// 2. Set node's data to preferred value
// 3. Set node's next to be head/top
// 4. Set the head/top equal to the new value (from step 2)
public class LinkedStack<T> implements Stack<T>{

    /**
     * Inner class to hold the data of our stack
     */
    private class Node {
        T data;
        Node next;
    }

    private Node top;  // refers to the top node of linked stack

    @Override
    public void push(T value) {
        // 1. Instantiate a new node
        // 2. Set new node's data to be value
        // 3. Set new node's next to point to the current top
        // 4. Set top to point to new node
        Node newNode = new Node();
        newNode.data = value;
        newNode.next = top;
        top = newNode;
    }

    @Override
    public T pop() {
        // check if top is null
        // if so, just return null
        // otherwise, top is not null, save data of current top node
        // then make top point to next node after top
        // return data of previous top
        if (top == null){
            return null;
        }
        T dataOfCurrentTop = top.data;
        top = top.next;
        return dataOfCurrentTop;
    }

    @Override
    public T peek() {
        if (top == null) {
            return null;  // TODO throw exception instead
        }
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        if (top == null){
            return true;
        }else{
            return false;
        }  // can also just write return top == null
    }

    public static void main(String[] args){
        Stack<Integer> s = new LinkedStack<>(); // can switch LinkedStack<> with ArrayStack<>

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
