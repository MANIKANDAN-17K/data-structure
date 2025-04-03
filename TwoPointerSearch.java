import java.util.Arrays;
public class TwoPointerSearch {
    static boolean twoSum(int arr[], int target){
        Arrays.sort(arr);
        int left = 0,right = arr.length-1;
        while(left < right){
            int sum = arr[left]+arr[right];
            if(sum == target){
                return true;
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {10,40,30,20,50};
        int target = 0;
        if(twoSum(arr, target)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
