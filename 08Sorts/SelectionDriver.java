public class SelectionDriver{
    public static void main(String[] args){
	int[] stuff = new int[]{1,6,3,4,7,3,8,2,7,4,3};
	SelectionSort arr1 = new SelectionSort(stuff);
	arr1.sort();
	System.out.println(arr1);
    }
}
