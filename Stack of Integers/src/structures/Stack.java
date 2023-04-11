package structures;

// structures.Stack is  a "generic" interface
// can contain elements of some type T
// that can be specified later
// Interface is parameterized by type T; T is a type parameter
public interface Stack<T> {
    /**
     * Push a new element to the top of the stack
     * @param value a new value to add to the top of the stack
     */
    void push(T value);

    /**
     * Return and remove the top element from the stack
     * @return the top element of the stack
     */
    T pop();

    /**
     * Return the top element of the stack
     * @return the current top element of the stack
     */
    T peek();

    /**
     * Test whether stack is empty
     * @return true if empty, false if not empty
     */
    boolean isEmpty();

}
