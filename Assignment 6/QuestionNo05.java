class Replace{
    public static void main(String args[]){
    int arr[]={1,2,30,4,50,6,32,98,5,1};
    for(int i=0;i<arr.length;i++){
        if(arr[i]%5==0)
        arr[i]=0;
        System.out.print(arr[i]+" ");
    }
    
    }
    
}
