import java.io.*;
class BinarySearch{
  int binarySearch(int arr[] , int x){
    int l = 0 , h = arr.length -1;
    while(l<=h){
      int mid = l+(h-l)/2;
      if(arr[mid] == x){
        return mid;
      }
      if(arr[mid] < x ){
        l = mid +1;
      }
      else{
        h =mid+1;
      }
    }
    return -1;
  }
  public static void main (String[] args) {
    BinarySearch ob = new BinarySearch();
    int arr[] = {4,5,8,9,45,78,90};
    int n = arr.length;
    int x = 9;
    int res = ob.binarySearch(arr,x);
    if(res == -1){
      System.out.println("element isn't present in arr");
    }else{
      System.out.println("element is present at index "+res);
    }
  }
}
