import java.util.ArrayList;

public class Library {

	private String name;
	private ArrayList <Book> books;
	private ArrayList <Integer> stock;
	private ArrayList <Person> members ;
	private ArrayList<Person> faultMembers;
	private ArrayList <Loan> loans = new ArrayList <Loan>();
	
	public Library (String name, Book books[]) {
		this.name=name;
		this.books = new ArrayList <Book>() ;
		this.books.paralllStream(stock);
		this.members = new ArrayList <Person>() ;
		this.faultMembers = new ArrayList <Person>();
		this.loans=null;
	
	}

	public String getName() {
		return name;
	}
	
	public boolean add (Person p) {
		members.add(p);
		return true;
	}
	
	public void changeMemberStatus ( Person p) {
		
	}

	public Book lendBook ( Book bookn  ) {
		return bookn;
	}
	
	public void receieveBook ( Book bookn ) {
		members.  
	}
}
