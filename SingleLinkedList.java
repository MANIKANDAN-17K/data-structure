class SingleLinkedList{
    pulic static void traverseLinkedList(Node head){
      Node curr = head;
      while(curr != null){
        System.out.print(curr.data+" ");
        curr = curr.next;
      }
      System.out.println();
    }
    public boolean searchLinkedList(Node head,int target){
      Node curr = head;
      while(curr != null){
      if(curr.data = target){
          return true;
      }
      curr = curr.next;
    }
    return false;
    }
    public int findLength(Node head){
      int length = 0;
      Node curr = head;
      while(curr != null){
        length++;
        curr = curr.next;
      }
      return length;
    }
    public Node insertAtBeginning(Node head, int value){
      Node newNode = new Node(value);
      newNode.next = head;
      head = newNode;
      return head;
    }
    public static Node insertAtEnd(Node head,int value){
      Node newNode = new Node(value);
      if(head == null){
        return newNode;
      }
      Node curr = head;
      while(curr.next != null){
        curr = curr.next;
      }
      curr.next = newNode;
      return head;
    }
    public static Node insertPos(Node head, int pos, int data){
      if(pos < 1){
        System.out.println("invalid position!");
      }
      if(pos == 1){
        Node temp = new Node(data);
        temp.next = head;
        return temp;
      }
      Node prev = head;
      int count =1;
      while(count < pos -1 && prev != null){
        prev = prev.next;
        count++;
      }
      if(prev == null){
        System.out.println("invalid position!");
        return head;
      }
      Node temp = new Node(data);
      temp.next = prev.next;
      prev.next = temp;
      return head;
    }
    Node removeLastNode(Node head){
      if(head ==null){
        return null;
      }
      if(head.next == null){
        head = null;
        return null;
      }
      Node second_last = head;
      while(second_last.next.next != null){
        second_last = second_last.next;
      }
      second_last.next =null;
      return head;
    }
    public void deleteAtposition(Node head,int position){
      if(head == null || position < 1){
        return;
      }
      if(position == 1){
        Node temp = head;
        head = head.next;
        temp = null;
        return;
      }
      Node curr = head;
      for(int i= 1 ; i<position -1 && current != null ; i++){
        curr = curr.next;
      }
      if(curr == null || curr.next = null){
        return;
      }
      Node temp = curr.next;
      curr.next = curr.next.next;
      temp = null;
    }
  

}

public class Node{
  int data;
  Node next;
  public Node(int data){
    this.data = data;
    this.next = null;
  }
}



