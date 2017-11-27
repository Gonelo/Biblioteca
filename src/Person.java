import java.util.ArrayList;

public class Person {

	private String name;
	private boolean member;
	private ArrayList <Book> book;
	
	public Person (String name) {
		this.name=name;
		this.member= false;
		this.book=null;
		
	}
	
	public void becomeMember( Library library) {
		if (library.add(this)) {
			this.member=true;
			
		}
	}
	
	public void takeBook ( Library library, Book bookn) {
		book.add (library.lendBook(bookn));		
	}
	
	public Book returnBook ( Library library, Book bookn){
		book.remove(bookn);
	}
	
	
}
