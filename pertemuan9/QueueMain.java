package pertemuan9;

public class QueueMain {
	public static void main(String[] args) {
		StrukturQueue Queue = new StrukturQueue();
		// Latihan 4
		// SESUDAH ENQUEUE 3X
		System.out.println("### Sebelum Enqueue 3x ###");
		System.out.println("size: " + Queue.sizeEnqueue());
		System.out.println("isEmpty: " + Queue.isEmpty());
		System.out.println();
		// SESUDAH ENQUEUE 3X
		Queue.enqueue(3);
		Queue.enqueue(2);
		Queue.enqueue(3);
		System.out.println("### Sesudah Enqueue 3x ###");
		System.out.println("size: " + Queue.sizeEnqueue());
		System.out.println("isEmpty: " + Queue.isEmpty());
		System.out.println("Front: " + Queue.front());
	}
	
	
}
