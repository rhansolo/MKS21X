public class InsertionSort{
    int[] arr;
    public InsertionSort(int[] arr){
	this.arr = arr;
    }
    public static sort(){
	for(int i = 0; i < arr.length-1; i ++){
	    if (arr[i+1] < arr[i]){
		int j = i;
	        while(j >= 0; arr[j] > arr[i]){
		    arr[j+1] = arr[j];
		    j --;
		}
		arr[j+1] = arr[i]
	}
	     
	}
    }
    public String toString(){
	String finalOutput = "";
	for (int i = 0; i < arr.length; i++){
	    finalOutput += arr[i];
	}
    }
}
