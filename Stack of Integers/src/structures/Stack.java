package structures;

// structures.Stack is  a "generic" interface
// can contain elements of some type T
// that can be specified later
// Interface is parameterized by type T; T is a type parameter
public interface Stack<T> {
    void push(T value);

    T pop();
    T peek();
    boolean isEmpty();

}
