import java.util.*;
public class SuperArrayIterator implements Iterator<String>{
    SuperArray array;
    int index;
    public SuperArrayIterator(SuperArray array){
	this.array = array;
	index = 0;
    }
    public String  next(){
	if(hasNext()){
	    index ++;
	}
	else{
	    System.exit(0);
	}
	return array.get(index-1);
    }
    public boolean hasNext(){
	return index <  array.size();
    }
}
