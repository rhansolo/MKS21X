import java.io.*;
public class Barcode{
    String zip = "";
    static String[] numToSymbol = new String[]{"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};
    public Barcode(String barString){
	if (barString.length()!=5){
	    throw new IllegalArgumentException();
	}
	zip = barString;
    }
    public String getCode(){
	return "|"+ toCode(zip+getCheckDigit(zip))+  "|";
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
	   finalcode += numToSymbol[zip.charAt(i)-48];
	}
	return finalcode;
    }
    public String toZip(String code){
	String finalZip = "";
	if (code.length() != 32){
	    throw new IllegalArgumentException();
	}
	if (code.charAt(0) != '|' && code.charAt(code.length()-1) != '|'){
	    throw new IllegalArgumentException();
	}
	for(int i = 1; i < 27; i+=5){
	    try{
		finalZip += numToSymbol.findIndex(code.substring(i,i+6));
	    }
	    catch (IllegalArgumentException e){
		throw new IllegalArgumentException();
	    }	
	}
	if (getCheckDigit(finalZip.substring(0,6))==(finalZip.charAt(6)-48)){
	    return finalZip;
		}

	throw new IllegalArgumentException();

    }
    private int  getCheckDigit(String zip){
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
