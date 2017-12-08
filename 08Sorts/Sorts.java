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
   
    public static void main(String[] args){
	int[] randish = new int[15];
	for(int i = 0; i < randish.length;i++){
	    randish[i] = (int)(Math.random()*100);
	}
	System.out.println(Arrays.toString(randish));
	selectionSort(randish);
	System.out.println(Arrays.toString(randish));
	insertionSort(randish);
	System.out.println(Arrays.toString(randish));
    }
}
