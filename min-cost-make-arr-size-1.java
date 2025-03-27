import java.lang.*;
public class Main{
  static int cost(int []a,int n){
    int min = a[0];
    for(int i = 1; i< a.length; i++){
      if(a[i]<min){
        min = a[i];
      }
    }
    return (n-1) * min;
  }
  public static void main (String[] args) {
    
    int a[] = { 7,5,4,3,2};
    int n = a.length;
    System.out.println(cost(a,n));
  }
}
