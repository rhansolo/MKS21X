public class Barcode{
    String barcode = "";
    String[] numToSymbol = new String[]{"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};
    public Barcode(String barString){
	barcode = barString;
    }
    public String getCode(){
	return barcode;
    }
    public String getZip(){
	return codeToZip(getCode());
    }
    public boolean equals(Barcode otherBarCode){
	return this.barcode.equals(otherBarCode.barcode);
    }
    public int compareTo(Barcode otherBarCode){
	return this.barcode.compareTo(otherBarCode.barcode);
    }
    private String codeToZip(String code){
	return "awefaf";
    }
   
}
