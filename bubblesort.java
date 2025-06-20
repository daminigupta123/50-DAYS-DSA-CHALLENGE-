public class bubblesort {
        public static void bubblesort(int[] arr) {
            for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
if(arr[j]>arr[j+1]){
    int temp=arr[j];
    arr[j]=arr[j+1];
    arr[j+1]=temp;
}
            }
        }   
        for(int i:arr)  
        {
            System.out.println(i);
            
        }
                int[]arr={2,56,7,3,4,5,6};
            int target=7;
            bubblesort(arr);
        }
    }

