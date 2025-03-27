import java.io.*;
import java.util.Arrays;
class Main{
  static int minOps(int arr[] , int n, int k){
    int max = Integer.MIN_VALUE;
    for(int i =0;i<n;i++){
      max = Math.max(max,arr[i]);
    }
    int res =0 ;
    for (int i = 0; i< n;i++){
      if((max - arr[i])%k!= 0){
        return -1;
      }
      else{
        res += (max - arr[i])/k;
      }
    }
    return res;
  }
  public static void main (String[] args) {
    int arr[] = { 4,7,19,16};
    int n = arr.length;
    int k = 1;
    System.out.println(minOps(arr,n,k));
  }
}
