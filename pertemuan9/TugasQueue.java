package pertemuan9;

public class TugasQueue {
	public static void main(String[] args) {
		StrukturQueue Queue = new StrukturQueue();
		// TUGAS QUEUE
		// Tambahkan operasi dequeue di kelas StrukturQueue yang telah anda kerjakan. 
		// Kemudian anda tes dengan melakukan operasi Enqueue maupun 
		// Dequeue dan kemudian uji dengan operasi-operasi yang telah 
		// anda buat seperti Latihan 4 maupun Latihan 5.
		// SEBELUM ENQUEUE & DEQUEUE
		System.out.println("### Sebelum ENQUEUE & DEQUEUE ###");
		System.out.println("size: " + Queue.sizeEnqueue());
		System.out.println("isEmpty: " + Queue.isEmpty());
		System.out.println();
		
		// SESUDAH ENQUEUE 5X
		Queue.enqueue(1);
		Queue.enqueue(2);
		Queue.enqueue(3);
		Queue.enqueue(4);
		Queue.enqueue(5);
		System.out.println("### Sesudah Enqueue 5x###");
		System.out.println("size: " + Queue.sizeEnqueue());
		System.out.println("isEmpty: " + Queue.isEmpty());
		System.out.println("Front: " + Queue.front());
		System.out.println();
		
		// SESUDAH DEQUEUE 2X
		Queue.dequeue();
		Queue.dequeue();
		System.out.println("### Sesudah Dequeue 2x ###");
		System.out.println("size: " + Queue.sizeEnqueue());
		System.out.println("isEmpty: " + Queue.isEmpty());
		System.out.println("Front: " + Queue.front());
}
}
