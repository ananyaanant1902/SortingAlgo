 public static void selectionSort(int[] arr, int l){
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        }
