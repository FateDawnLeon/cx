package tutorial;

import java.sql.*;
import java.util.ArrayList;

public class AuthorSearch {
	
	private Book book;
	public Book getBook(){
		return book;
	}
	public void setBook(Book book){
		this.book = book;
	}
	
	private ArrayList<Book> books;
	public ArrayList<Book> getBooks(){
		return books;
	}
	public void setBooks(ArrayList<Book> books){
		this.books = books;
	}
	
	private String author;
	public String getAuthor(){
		return author;
	}
	public void setAuthor(String author){
		this.author = author;
	}

	public String execute() {
		Conn c = new Conn();
		Connection con = c.getConnection();
		try{
			Statement sql = con.createStatement();
			ResultSet res = sql.executeQuery("select * from Author where Name='"+author+"';");
			int id;
			if(res.next()){
				id = res.getInt("AuthorID");
			}
			else{
				return "failure";
			}
			books = new ArrayList<Book>();
			res = sql.executeQuery("select * from Book where AuthorID="+String.valueOf(id));
			while(res.next()){
				Book book = new Book();
				book.setIsbn(res.getString("ISBN"));
				book.setTitle(res.getString("Title"));
				book.setAuthorID(res.getInt("AuthorID"));
				book.setPublisher(res.getString("Publisher"));
				book.setPublishDate(res.getDate("PublishDate"));
				book.setPrice(res.getFloat("Price"));
				books.add(book);
			}
		}catch(Exception e){
			e.printStackTrace();
			return "exception";
		}
		return "success";
	}
}


