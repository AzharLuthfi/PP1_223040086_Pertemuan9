package pertemuan9;

public class StrukturQueue {
private Node FRONT;
private Node REAR;
	
	public StrukturQueue() {
		this.FRONT = FRONT;
	}

  	public boolean isEmpty() {
		return FRONT == null;
	}
	
	//display Qeueu
    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Queue Kosong !!");
        } else {
            Node current = FRONT;
            while (current != null) {
                System.out.print(current.getData() + " ");
                current = current.getNext();
            }
            System.out.println(); // Baris baru setelah semua elemen ditampilkan
        }		
    }
	
	// fungsi Enqueue
	public void enqueue (int data) {
		Node newNode = new Node(data);
		if (isEmpty()) {
			FRONT = newNode;
			REAR = newNode;
		} else {
			REAR.setNext(newNode);
			REAR = newNode;
		}
	}
	
	// fungsi Dequeue
	public void dequeue () {
		if (isEmpty()) {
			System.out.println("Data Masih Kosong");
		} else {
			Node tempFRONT = FRONT;
			FRONT = FRONT.getNext();
			REAR = null;
			tempFRONT = null;
		}
	}
	
	// fungsi Size Enqueue | Latihan 3
	public int sizeEnqueue() {
		int size = 0;
		Node curNode = FRONT;
		while(curNode != null) {
			size++;
			curNode = curNode.getNext();
		}
		return size;
	}
	
	public int front() {
		return (int) (FRONT != null ? FRONT.getData() : -1);
	}
	
	

}
