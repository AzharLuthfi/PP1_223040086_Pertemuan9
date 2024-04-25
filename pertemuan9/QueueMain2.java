package pertemuan9;

public class QueueMain2 {
	public static void main(String[] args) {
		StrukturQueue Queue = new StrukturQueue();
		// LATIHAN 5
		// SESUDAH ENQUEUE 4X
		System.out.println("### Sebelum Enqueue 4x ###");
		System.out.println("size: " + Queue.sizeEnqueue());
		System.out.println("isEmpty: " + Queue.isEmpty());
		Queue.displayElements();
		System.out.println();
		// SESUDAH ENQUEUE 4X
		Queue.enqueue(2);
		Queue.enqueue(7);
		Queue.enqueue(6);
		Queue.enqueue(1);
		System.out.println("### Sesudah Enqueue 4x ###");
		System.out.println("size: " + Queue.sizeEnqueue());
		System.out.println("isEmpty: " + Queue.isEmpty());
		System.out.print("Elemen  Queue: ");
		Queue.displayElements();
		System.out.println("Front: " + Queue.front());
	}
	
}
