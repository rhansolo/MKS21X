public class InsertionDriver{
    public static void main(String[] args){
	int[] arr = new int[]{1,3,4,5,3,2,3,4,6,1};
	InsertionSort arr1 = new InsertionSort(arr);
	arr1.sort();
	System.out.println(arr1);
    }
}
