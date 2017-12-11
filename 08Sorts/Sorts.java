import java.util.Arrays;
public class Sorts{
    public static String name(){
	return "09.Robin.Han";
    }
    public static void insertionSort(int[] arr){
	for(int i = 0; i < arr.length-1; i ++){
	    if (arr[i+1] < arr[i]){
		int j = i;
	        while(j >= 0 && arr[j] > arr[i]){
		    arr[j+1] = arr[j];
		    j --;
		}
		arr[j+1] = arr[i];
	}
	}
    }
    public static void selectionSort(int[] arr){
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
    public static void bubbleSort(int[] arr){
	for (int i = 0; i < arr.length-1; i ++){
	    for (int j = 0; j < arr.length-i-1; j++){
		if (arr[j] > arr[j+1]){
		    int tmp = arr[j+1];
		    arr[j+1] = arr[j];
		    arr[j] = tmp;
		}
	    }
	}
     
    }
   
    public static void main(String[] args){
	int[] randish = new int[]{5,3,2,4,8,7,3,4,7,2,4,6};
	int[] tmp = randish;
	System.out.println(Arrays.toString(randish));
	selectionSort(randish);
	System.out.println(Arrays.toString(randish));
	bubbleSort(tmp);
	System.out.println(Arrays.toString(tmp));
    }
}
