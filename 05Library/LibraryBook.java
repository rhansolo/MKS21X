abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;
    private LibraryBook(String author, String title, String ISBN, String callNumber){
	super(author,title,ISBN);
	this.callNumber = callNumber;
    }
    public String getCallNumber(){
	return callNumber;
    }
    abstract void checkout(String patron, String due);
    abstract void returned();
    abstract String circulationStatus();
    
}
