
public class SuperArray{
    String[] arr;
    int arrSize= 0;
    
    public SuperArray(){
    	arr = new String[10];
    }
    
    public void clear(){
    	arr = new String[10];
    	arrSize = 0;
    }
    
    public int size(){
    	return arrSize;
    }
    public boolean IsEmpty(){
        return (arrSize == 0); 
    }                 
    public boolean add(String element){
	  	if (arrSize == arr.length){
		    resize();
	  	}
	  	arr[arrSize] = element;
	  	arrSize += 1;
	  	return true;
    }
    public String get(int index){
    	if (index < 0 || index > size()){
    		throw new IndexOutOfBoundsException();
    	}
    	return arr[index];
    }
    public String set(int index, String element){
    	if (index < 0 || index > size()){
	    throw new IndexOutOfBoundsException();
    	}
    	String tmp = arr[index];
    	arr[index] = element;
    	return tmp;
    }
    public String toString(){
    	String  returnString = "[";
		for (int i = 0; i < arrSize; i++){
		    returnString += arr[i];
			if (i != arrSize-1){
			    returnString += ", ";
			}
		}
		returnString += "]";
	        return returnString;
    }

    public boolean contains(String element){
		for (int i = 0; i < arrSize; i ++){
		    if (arr[i].equals(element)){
		    	return true;
		    }
		}
		return false;
    }
    private void resize(){
	String[] tmp = new String[arrSize * 2];
		for (int i = 0; i < arr.length; i++){
		    tmp[i] =  arr[i];
		}
		arr = tmp;
    }
    public void add(int index, String element){
    	if (index < 0 || index > size()){
	    throw new IndexOutOfBoundsException();
    	}
    	if (arrSize == arr.length){
		    resize();
		}
		String[] tmpArr = new String[arr.length];
		for (int i = 0; i < index; i++){
			tmpArr[i] = arr[i];
		}
		
		for (int i = index; i < arrSize; i ++){
		    tmpArr [i+1] = arr[i];
		}
		tmpArr[index] = element;
		arr = tmpArr;
		arrSize += 1;
    }
    public int indexOf(String element){
    	for (int i = 0; i < arrSize; i ++){
    		if (arr[i].equals(element)){
    			return i;
    		}
    	}
    	return -1;
    }
    public int lastIndexOf(String element){
    	int lastOccur = -1;
    	for (int i = 0; i < arrSize; i ++){
    		if (arr[i].equals(element)){
    			lastOccur = i;
    		}
    	}
    	return lastOccur;
    }
    public String remove(int index){
    	if (index < 0 || index > size()){
	    throw new IndexOutOfBoundsException();
    	}
    	String removed = arr[index];
    	String[] tmpArr = new String[arrSize];
		for (int i = 0; i < index; i++){
			tmpArr[i] = arr[i];
		}
		
		for (int i = index; i <= arrSize-2; i ++){
		    tmpArr [i] = arr[i+1];
		}
		arr = tmpArr;
		arrSize -= 1;
		return removed;
    }
    public boolean remove(String element){
    	if (indexOf(element) != -1){
    		remove(indexOf(element));
    		return true;
    	}
    	return false;
    }


}
