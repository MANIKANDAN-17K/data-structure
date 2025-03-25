import java.io.*;

class Main{
  public int secondLargestElement(int arr[]){
    int n = arr.length;
    fL = -1;
    sL = -1;
     for(int i = 0 ; i < n ;i++){
        if(arr[i] > fL){
          sL = fL;
          fl = arr[i];
        }else if(arr[i]>sL){
          sL = arr[i];
        }
    }
    return sL
  }
  public static void main (String[] args) {
    int arr[] = {12,45,6,743,34,1};
    System.out.println(secondLargestElement(arr));
  }
}
