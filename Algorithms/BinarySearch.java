public class BinarySearch {


    public static int BinarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length -1;
        while(left <= right){
            System.out.println("left and right value - "+left+" : "+right);
            int mid = (left+right) /2;
            System.out.println("mid value is : "+mid + " and the middle element is : "+ arr[mid]);

            //Check if the middle value is the actual value
            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] < target){
                left = mid +1;
                System.out.println("Left value is : "+left);
            }
            else{
                right = mid -1;
                System.out.println("Right value is : "+right);
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {2,3,4,10,40};
        int target = 10;
        int result = BinarySearch(arr,target);
        if(result == -1){
            System.out.println("Target is not found");
        }
        else{
            System.out.println("Target is found at: "+ result+" place in array");
        }
    }
}
