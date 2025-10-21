class Node{
	int data;
	Node next;
	Node(int data){
		this.data  = data;
		this.next = null;
	}
}
class ssl{
	Node head;
	public void insertBegin(int data){
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}
	public void insertEnd(int data){
		Node newNode = new Node(data);
		Node temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = newNode;
	}
	public void insertPos( int data,int pos){
		Node newNode = new Node(data);
		Node temp =head;
		for(int i =1;i < pos -1;i++){
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		
	}
	public void deleteBegin(){
		if(head != null){
			head = head.next;
		}
	}
	public void deleteEnd(){
		Node temp = head;
		while(temp.next.next != null){
			temp = temp.next;
		}
		temp.next = null;
	}
	public void deletepos(int pos){
		Node temp  = head;
		for(int i = 1 ;i< pos -1 ;i++){
			temp = temp.next;
		}
		temp.next = temp.next.next;
	}
	
	
