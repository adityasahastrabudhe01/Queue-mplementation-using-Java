public class Main
{
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println("Queue is Empty " + q.isEmpty());
        System.out.println("EnQueuing the Queue");
        q.enQueue(5);
        q.enQueue(20);
        q.enQueue(10);
        q.enQueue(50);
        q.show();
        System.out.println("Queue is Full " + q.isFull());


        System.out.println("DeQueuing the Queue");
        q.deQueue();
        q.deQueue();
        System.out.println("Size of Queue " + q.getSize());
        q.show();

        System.out.println("EnQueuing the Queue");
        q.enQueue(65);
        q.enQueue(75);

        System.out.println("DeQueuing the Queue");
        q.deQueue();

        System.out.println("\nSize of Queue " + q.getSize());
        q.show();
    }
}
