public class Barcode{
    String barcode = "";
    String[] numToSymbol = new String[]{"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};
    public Barcode(String barString){
	barcode = barString;
    }
    public String getCode(){
	return "|"+ codeToZip()+ getCheckDigit()+  "|";
    }
    public String getZip(){
	return barcode + getCheckDigit();
    }
    public boolean equals(Barcode otherBarCode){
	return this.barcode.equals(otherBarCode.barcode);
    }
    public int compareTo(Barcode otherBarCode){
	return this.barcode.compareTo(otherBarCode.barcode);
    }
    private String codeToZip(){
	String finalcode = "";
	for (int i = 0; i < barcode.length(); i++){
	   finalcode += numToSymbol[barcode.charAt(i)];
	}
	return finalcode;
    }
    private int  getCheckDigit(){
	int total = 0;
	for (int i = 0; i < barcode.length(); i++){
	    total += barcode.charAt(i)-48;
	}
	return (total%10);
    }
    public String toString(){
	return "|"+ getCode() + "| (" + getZip() + getCheckDigit()+ ")";
    }
}
