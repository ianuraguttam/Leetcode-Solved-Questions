class Solution {
    public static void reverse(int arr[],int s,int e){
        if(s>=e) return;
        while(s<e){
            int temp=arr[e];
            arr[e]=arr[s];
            arr[s]=temp;
            s++;
            e--;
        }
    }
    public void nextPermutation(int[] arr) {
        int n =arr.length;
        for(int i=n-1;i>=1;i--){
// First check from the end where does the number begin to decrease
// In only one case numbers will not decrease when its the last permutation
            if(arr[i-1]<arr[i]){
// When we find it, find the minmum number greater than this number from the right
                int j=n-1;
                int min=Integer.MAX_VALUE;
                int ith=-1;
                while(j>=i){
                    // System.out.println('a');
                    if(arr[j]<min && arr[j]>arr[i-1]){
                        min=arr[j];
                        ith=j;
                    }
                    j--;
                }
// Now swap those numbers
                int temp=arr[ith];
                arr[ith]=arr[i-1];
                arr[i-1]=temp;
// After swaping the number should be in its next permutation
// If u cant think why reverse you can also sort the remaining numbers on the right
                reverse(arr,i,n-1);
                return;
            }
        }
// Here the only case has been taken care of
        reverse(arr, 0, n-1);
    }
}