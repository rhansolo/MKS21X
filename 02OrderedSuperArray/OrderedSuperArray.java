public class OrderedSuperArray extends SuperArray{
    public OrderedSuperArray(){
    	super();
    }
    public OrderedSuperArray(int capacity){
    	super(capacity);
    }
    public OrderedSuperArray(String[] arr){
    	super(arr.length);

	for (int j = 0; j < arr.length; j++){
	    add(arr[j]);
	}
	
    }

    public int indexOfBinary(String element){
    	//System.out.println(element);
       	int low = 0;
        int high = size() - 1;
        int mid;
        while (low <= high) {

            mid = (low + high) / 2;
        	//System.out.println(get(mid));
            if (element.compareTo(get(mid)) > 0) {
                low = mid + 1;
            } 
            else if (element.compareTo(get(mid)) < 0) {
                high = mid - 1;
            } 
            else {
		while (get(mid-1)==get(mid)){
		    mid -= 1;
		}
                return mid;
            }
        }
        return -1;
    }
    public int lastIndexOfBinary(String element){
    	//System.out.println(element);
       	int low = 0;
        int high = size() - 1;
        int mid;
        while (low <= high) {

            mid = (low + high) / 2;
        	//System.out.println(get(mid));
            if (element.compareTo(get(mid)) > 0) {
                low = mid + 1;
            } 
            else if (element.compareTo(get(mid)) < 0) {
                high = mid - 1;
            } 
            else {
		while (get(mid+1)==get(mid)){
		    mid += 1;
		}
                return mid;
            }
        }
        return -1;
    }
    private int findIndex(String element){
    	for (int i = 0; i < size(); i ++){
    		if (element.compareTo(get(i)) < 0){
    			return i;
    		}
    	}
 
    	return size();
    }
    private int findIndexBinary(String element){
       	int low = 0;
        int high = size() - 1;
        int mid;
        while (true) {
            mid = (low + high) / 2;
            if (element.compareTo(get(mid)) == 0){
            	return mid;
            }
            else if (element.compareTo(get(mid)) > 0) {
                low = mid + 1;
                if (low > high){
                	return mid+1;
                }
            } 
            else{
                high = mid - 1;
                if (low > high){
                	return mid;
                }
            } 
        }
    }

    
    public void add(int index, String value){
    	add(value);
    }
    public boolean add(String value){
		if (size() == 0){
		    super.add(value);
		    return true;
		}
		else{
			//System.out.println("insert index" + findIndexBinary(value));
		    super.add(this.findIndexBinary(value),value);
			return true;
		}
		
    }
}
