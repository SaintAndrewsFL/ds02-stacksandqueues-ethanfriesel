import java.util.ArrayList;

public class StackArray<E> {
    private ArrayList<E> array;
    public StackArray(){
        array = new ArrayList<>();
    }
    public E push(E item){
        array.add(0, item);
        return item;
    }
    public E pop(){
        return array.remove(0);
    }
    public E peek(){
        return array.get(0);
    }
    public void display(){
        QueueArray<E> current = new QueueArray<>();
        while (!isEmpty()) {
            System.out.print(current.enqueue(pop()));
        }
        array = current.getArray();
    }
    public int size(){
        return array.size();
    }
    public boolean isEmpty(){
        return peek() == null;
    }
}


/*
E push(E item) - Pushes an item onto the top of this stack.
E pop() - Removes the object at the top of this stack and returns that object as the value of this function.
E peek()- Looks at the object at the top of this stack without removing it from the stack.
void display() - Outputs the stack order
int size() - Returns number of items in the stack
boolean isEmpty - Checks if stack is currently empty
 */