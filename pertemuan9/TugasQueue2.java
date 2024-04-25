package pertemuan9;

public class TugasQueue2 {
	public static void main(String[] args) {
		StrukturQueue Queue = new StrukturQueue();
		// TUGAS QUEUE
		// Tambahkan operasi dequeue di kelas StrukturQueue yang telah anda kerjakan. 
		// Kemudian anda tes dengan melakukan operasi Enqueue maupun 
		// Dequeue dan kemudian uji dengan operasi-operasi yang telah 
		// anda buat seperti Latihan 4 maupun Latihan 5.
		// SEBELUM ENQUEUE 4X
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
		System.out.println();
		
		// SESUDAH DEQUEUE 2X
		Queue.dequeue();
		Queue.dequeue();
		System.out.println("### Sesudah Enqueue 4x ###");
		System.out.println("size: " + Queue.sizeEnqueue());
		System.out.println("isEmpty: " + Queue.isEmpty());
		System.out.print("Elemen  Queue: ");
		Queue.displayElements();
		System.out.println("Front: " + Queue.front());
	}
}
