class IsSort{
  static boolean arraySortedOrNot(int arr[],int n){
    if(n ==0 || n == 1)
      return true;
    for(int i = 1;i< n ; i++)
      if(arr[i - 1 ] > arr[i])
          return false;
    return true;
  }
  public static void main (String[] args) {
    int arr[] = {12,34,400,56,67,78,89};
    int n = arr.length;
    if(arraySortedOrNot(arr,n)){
      System.out.print("yes");
    }else{
      System.out.print("no");
    }
  }
}
