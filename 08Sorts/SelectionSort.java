public class SelectionSort{
    int[] arr;
    public SelectionSort(int[] arr){
	this.arr = arr;
    }
    public void sort(){
	for (int i = 0; i < arr.length; i++){
	    int leastSum = arr[i];
	    int index = i;
	    for (int j = i; j < arr.length; j++){
		if (arr[j] < leastSum){
		    leastSum = arr[j];
		    index = j;
		}
	    }
	    int tmp = arr[i];
	    arr[i] = leastSum;
	    arr[index] = tmp;
	}
   
    }
    public String toString(){
	String output = "";
	for (int i = 0; i < arr.length; i++){
	    output += arr[i] + " ";
	}
	return output;
    }

}

