import java.util.LinkedList;

public class StackLL<E> {
    LinkedList<E> list;
    public StackLL() {
        list = new LinkedList<>();
    }
    public E push(E item){
        list.addFirst(item);
        return item;
    }
    public E pop(){
        return list.poll();
    }
    public E peek(){
        return list.getFirst();
    }
    public void display() {
        QueueLL<E> current = new QueueLL<>();
        while (!isEmpty())
            System.out.println(current.enqueue(pop()));
        list = current.getList();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public LinkedList<E> getList(){
        return list;
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