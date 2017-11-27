import java.util.Date;

public class Loan {

	private String status;
	private Date takenDate;
	private Date dueDate;
	private Person person;
	private Book book;
	
	public Loan (int quantDays, Person person, Book book) {
		this.takenDate= new Date();
		this.dueDate= takenDate + quantDays;
		this.person=person;
		this.book=book;
	}
}
