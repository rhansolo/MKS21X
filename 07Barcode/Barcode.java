import java.io.*;
public class Barcode{
    String zip = "";
 
    public Barcode(String barString){
	if (barString.length()!=5){
	    throw new IllegalArgumentException("Input zip is not the right size");
	}
	for (int i = 0; i < barString.length(); i++){
	    if (!Character.isDigit(barString.charAt(i))){
		throw new IllegalArgumentException("Make sure the zip only contains numbers!");
	    }
	}
	zip = barString;
    }
    private static String convertToSymbol(int num){
	String[] codeArr = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};
	return codeArr[num];
    }
    private static int convertToNum(String code){
	String[] codeArr = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};
	for (int i = 0; i < codeArr.length; i++){
	    if (codeArr[i].equals(code)){
		    return i;
		}
	}
	    throw new IllegalArgumentException();
    }
    public String getCode(){
	return "|"+ toCode(zip + getCheckDigit(zip))+  "|";
    }
    public String getZip(){
	return zip;
    }
    public boolean equals(Barcode otherBarCode){
	return this.zip.equals(otherBarCode.zip);
    }
    public int compareTo(Barcode otherBarCode){
	return this.zip.compareTo(otherBarCode.zip);
    }
    public static String toCode(String zip){
	String finalcode = "";
	for (int i = 0; i < zip.length(); i++){
	    finalcode += convertToSymbol(zip.charAt(i)-48);
	}
	finalcode += convertToSymbol(zip.charAt(getCheckDigit(zip))-48);
	return finalcode;
    }
    public static String toZip(String code){
	String finalZip = "";
	if (code.length() != 32){
	    throw new IllegalArgumentException("Check the code length!");
	}
	if (code.charAt(0) != '|' && code.charAt(code.length()-1) != '|'){
	    throw new IllegalArgumentException("invalid sequence in code. Check beginning and end");
	}

	for (int i = 0; i < code.length(); i++){
	    if (code.charAt(i) == '|' || code.charAt(i) == ':'){
	    }
	    else{
		throw new IllegalArgumentException("Make sure barcode consists of | or :");
	    }
	}
	for(int i = 1; i < 26; i+=5){
	    if (code.substring(i,i+5).equals(":::::") || code.substring(i,i+5).equals("|||||")){
		throw new IllegalArgumentException("invalid sequence in code");
	    }
	    finalZip += convertToNum(code.substring(i,i+5));
	    }

	if (getCheckDigit(finalZip)==convertToNum(code.substring(26,31))){
	    return finalZip;
		}

	throw new IllegalArgumentException("Code is invalid, check digit doesn't match");

    }
    private static int getCheckDigit(String zip){
	int total = 0;
	for (int i = 0; i < zip.length(); i++){
	    total += zip.charAt(i)-48;
	}
	return (total%10);
    }
    public String toString(){
	return "|"+ getCode() + "| (" + getZip() + ")";
   }
}
