static void selectionSort(int[] arr,int n){
		
		for(int i=0;i<=n-2;i++){
			int minIndex=i;
			for(int j=i;j<=n-1;j++){
				if(arr[j]<arr[minIndex]){
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	}
