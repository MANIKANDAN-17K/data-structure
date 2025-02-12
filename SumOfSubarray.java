class Main{
  static int subarraySum(int[] arr){
    int n = arr.length;
    int res = 0;
    for(int i = 0 ; i<n ; i++){
      res += (arr[i] * (i+1)*(n-i));
    }
    return res;
  }
  public static void main (String[] args) {
    int[] arr = { 25,47,63 };
    System.out.println(subarraySum(arr));
  }
}
