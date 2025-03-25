import java.util.*;

class Main{
  static ArrayList<Integer> getAlter(int arr[]){
    ArrayList<Integer> res = new ArrayList<>();
    
    for(int i = 0; i<arr.length;i+=2){
      res.add(arr[i]);
    }
    return res;
  }
  public static void main (String[] args) {
    int arr[] = {10,20,30,40,50,60};
    ArrayList<Integer> res = getAlter(arr);
    for(int x : res) {
      System.out.print(x + "  ");
    }
    
  }
}
