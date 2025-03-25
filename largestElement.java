import java.io.*;

class Main{
  static int largest(int[] arr ){
    int max = arr[0];
    for(int i = 0;i<arr.length;i++){
      if(arr[i] > max){
        max = arr[i];
      }
    }
    return max;
  }
  public static void main (String[] args) {
    int arr[] = {20,40,4,22,28};
    System.out.println(largest(arr));
  }
}
