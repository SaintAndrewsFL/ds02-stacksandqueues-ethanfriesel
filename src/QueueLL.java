import java.util.ArrayList;
import java.util.LinkedList;

public class QueueLL<E> {
    LinkedList<E> list;
    public QueueLL() {
        list = new LinkedList<>();
    }
    public E enqueue(E item){
        list.add(item);
        return item;
    }
    public E dequeue(){
        return list.poll();
    }
    public E peek(){
        return list.getFirst();
    }
    public void display() {
        QueueLL<E> current = new QueueLL<>();
        while (!isEmpty())
            System.out.println(current.enqueue(list.poll()));
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
E enqueue(E item) - Pushes an item onto the bottom/back of this queue.
E dequeue() - Removes the object at the top of this queue and returns that object as the value of this function.
E peek()- Looks at the object at the top of this queue without removing it from the queue.
void display() - Outputs the queue order
int size() - Returns number of items in the queue
boolean isEmpty - Checks if queue is currently empty
 */