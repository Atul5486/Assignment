class ArraySum{
    public static void main(String args[]){
    int arr[]={1,2,3,4,5};
    int even=0,odd=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]%2==0){
        even+=arr[i];
        }else{
            odd+=arr[i];
        }
    }
    System.out.print("Sum of odd "+odd+" Sum of even "+even);
    }
        
        
}
