public class BookDriver{
	public static void main(String[] args){
		Book b1 = new Book("Robin Han","My Terrible Life","12324");
		Book b2 = new Book("Jerry Sun","I'm No Longer Cuffed", "12342");
		System.out.println(b1.getAuthor());
		System.out.println(b2.getTitle());
		System.out.println(b2);
	}
}
