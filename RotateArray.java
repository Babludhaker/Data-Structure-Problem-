public class RotateArray {

    public static int[] reverse(int arr[], int l, int j){
        // int l = 0;
        // int j = arr.length-1;

        while(l<=j) {
            int temp = arr[j];
            arr[j] = arr[l];
            arr[l] = temp;
            j--;
            l++;
        }
        return arr;
    }

    public static int [] Rotate(int arr[], int k){
        int n = arr.length;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);

        return arr;

    }
    public static void main(String[] args) {
        int arr[] =  {1,2,3,4,5,6,7};
        int k = 3;
        Rotate(arr,k);

        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
