import java.util.ArrayList;

public class QueueArray<E> {
    ArrayList<E> array;
    public QueueArray() {
        array = new ArrayList<>();
    }
    public E enqueue(E item) {
        array.add(item);
        return item;
    }
    public E dequeue(){
        return array.remove(0);
    }
    public E peek(){
        return array.get(0);
    }
    public void display() {
        QueueArray<E> current = new QueueArray<>();
        while (!isEmpty()) {
            System.out.print(current.enqueue(dequeue()));
        }
        array = current.getArray();
    }
    public int size(){
        return array.size();
    }
    public boolean isEmpty(){
        return peek() == null;
    }
    public ArrayList<E> getArray(){
        return array;
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
