public class prefix {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int prefix[]=new int [arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int j=0;j<arr.length;j++){
            System.out.print(prefix[j]+" ");
        }
        int left =0;
        int target=5;
        int right =arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println("Pair found: "+arr[left]+", "+arr[right]);
                left++;
                right--;
            } else if(sum<target){
                left++;
            } else {
                right--;
            }
        }
    }
}