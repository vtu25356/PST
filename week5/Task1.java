import java.util.Scanner;
class Task1{
    public static int maxSubArray(int[] nums){
        int currentsum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            currentsum=Math.max(nums[i],currentsum+nums[i]);
            maxsum=Math.max(currentsum,maxsum);
        }        
        return maxsum;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Number of Elements:");
            int n=sc.nextInt();
            int [] arr=new int[n];
            System.out.println("Enter Elements:");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int result=maxSubArray(arr);
            System.out.println("Maximum Subarray sum:"+ result);
        }
    }
}