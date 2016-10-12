package tutorial;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Author {
	private int authorID;
	private String name;
	private int age;
	private String country;
	private ArrayList<Book> books;
	
	
	public int getAuthorID() {
		return authorID;
	}
	public void setAuthorID(int authorID) {
		this.authorID = authorID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public String searchAuthorBooks(){
		Conn c = new Conn();
		Connection con = c.getConnection();
		try{
			Statement sql = con.createStatement();
			ResultSet res = sql.executeQuery("select * from Author where Name='"+name+"';");
			int id;
			if(res.next()){
				id = res.getInt("AuthorID");
			}
			else{
				  return "failure";
			}
			res = sql.executeQuery("select * from Book where AuthorID="+String.valueOf(id));
			books = new ArrayList<Book>();
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
	
	public String addAuthor(){
		Conn c = new Conn();
		Connection con = c.getConnection();
		try{
			Statement sql = con.createStatement();
			int res = sql.executeUpdate("insert into Author(Name,Age,Country) values("
			                             +  "'"  +  name  +  "',"
			                             +     age        +  ","
			                             +  "'"  +  country + "');");
			if(res==1){
				return "success";
			}
			else{
				return "failure";
			}
		}catch(Exception e){
			e.printStackTrace();
			return "exception";
		}
	}
	
	
}
