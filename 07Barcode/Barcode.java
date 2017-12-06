import java.io.*;
public class Barcode{
    String zip = "";
    String[] numToSymbol = new String[]{"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};
    public Barcode(String barString){
	if (barString.length()!=5){
	    throw new IllegalArgumentException();
	}
	zip = barString;
    }
    public String getCode(){
	return "|"+ toCode(zip+getCheckDigit())+  "|";
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
    public String toCode(String zip){
	String finalcode = "";
	for (int i = 0; i < zip.length(); i++){
	   finalcode += numToSymbol[zip.charAt(i)-48];
	}
	return finalcode;
    }
    public String toZip(String code){
	return "Awefawef";
    }
    private int  getCheckDigit(){
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
