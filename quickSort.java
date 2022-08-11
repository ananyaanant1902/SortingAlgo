 public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static int partition(int[] arr, int low, int high){
        int pivot=arr[high];
        int index=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                index++;
                swap(arr,index,j);
            }
        }
        swap(arr,index+1,high);
        return(index+1);
    }

    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int partition=partition(arr,low,high);

            quickSort(arr,low,partition-1);
            quickSort(arr,partition+1,high);
        }
    }
