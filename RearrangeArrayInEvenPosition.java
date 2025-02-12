import java.util.ArrayList;
import java.util.Collections;

class Main{
  static ArrayList<Integer> rearrangeArray(ArrayList<Integer> arr){
    int n = arr.size();
    for(int i = 1;i<n;i++){
      if((i+1)%2 == 0){
        if(arr.get(i)<arr.get(i-1)){
          Collections.swap(arr,i,i-1);
        }
      }else{
        if(arr.get(i) > arr.get(i-1)){
          Collections.swap(arr,i,-1);
        }
      }
    }
    return arr;
  }
  public static void main (String[] args) {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(1);
    arr.add(2);
    arr.add(2);
    arr.add(1);
    ArrayList<Integer> res = rearrangeArray(arr);
    for(int num : res){
      System.out.println(num+" ");
    }
  }
}
