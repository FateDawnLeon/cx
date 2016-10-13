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
	private ArrayList<Author> authors;
	
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
	public ArrayList<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(ArrayList<Author> authors) {
		this.authors = authors;
	}
	
	
	
	public String searchAuthorBooks(){
		Conn c = new Conn();
		Connection con = c.getConnection();
		try{
			Statement sql1 = con.createStatement();
			Statement sql2 = con.createStatement();
			ResultSet res1 = sql1.executeQuery("select * from Author where Name='"+name+"';");
			if(!res1.next()){
				return "abscence";
			}
			res1.beforeFirst();
			books = new ArrayList<Book>();
			while(res1.next()){
				ResultSet res2 = sql2.executeQuery("select * from Book where AuthorID="
				                                  + String.valueOf(res1.getInt("AuthorID")));
				while(res2.next()){
					Book book = new Book();
					book.setIsbn(res2.getString("ISBN"));
					book.setTitle(res2.getString("Title"));
					book.setAuthorID(res2.getInt("AuthorID"));
					book.setPublisher(res2.getString("Publisher"));
					book.setPublishDate(res2.getDate("PublishDate"));
					book.setPrice(res2.getFloat("Price"));
					books.add(book);
				}
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
	
	public String showAllAuthors(){
    	Conn c = new Conn();
		Connection con = c.getConnection();
		try{
			Statement sql = con.createStatement();
			ResultSet res = sql.executeQuery("select * from Author");
			authors = new ArrayList<Author>();
			while(res.next()){
				Author author = new Author();
				author.setAuthorID(res.getInt("AuthorID"));
				author.setName(res.getString("Name"));
				author.setAge(res.getInt("Age"));
				author.setCountry(res.getString("Country"));
				authors.add(author);
			}
		}catch(Exception e){
			e.printStackTrace();
			return "exception";
		}
		return "success";
    }
	
	public String deleteAuthor(){
    	Conn c = new Conn();
		Connection con = c.getConnection();
		try{
			Statement sql = con.createStatement();
			int res = sql.executeUpdate("delete from Author where AuthorID="+authorID+";");
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
