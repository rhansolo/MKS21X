public class ReversedCharSequence implements CharSequence{
    String charstr = "";
    public ReversedCharSequence(String str){
		for (int i = str.length() - 1; i >= 0; i--){
		    charstr +=  str.charAt(i);
		}
    }
    public char charAt(int index){
    	return charstr.charAt(index);
    }
    public int length(){
    	return charstr.length();
    }
    public CharSequence subSequence(int start, int end){
    	return charstr.substring(start,end);
    }
}
