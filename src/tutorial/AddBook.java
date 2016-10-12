package tutorial;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddBook {
	private Book book;
	public Book getBook(){
		return book;
	}
	public void setBook(Book book){
		this.book = book;
	}

	public String execute(){
		Conn c = new Conn();
		Connection con = c.getConnection();
		try{
			String isbn = book.getIsbn();
			String title = book.getTitle();
			int authorID = book.getAuthorID();
			String publisher = book.getPublisher();
			Date publishDate = book.getPublishDate();
			float price = book.getPrice();
			
			if(!isbn.equals("") && !title.equals("") && authorID>0){
				Statement sql = con.createStatement();
				ResultSet res = sql.executeQuery("select * from Author where AuthorID="+authorID+";");   
				if(!res.next()){
					
					return "abscence";
					/*int outcome2 = sql.executeUpdate("insert into Author (AuthorID) values("+authorID+");");
					if(outcome2==0){
						return "failure";
					}*/
				}
				int outcome1 = sql.executeUpdate("insert into Book values(" 
				           +  "'"  +  isbn            +  "',"
				           +  "'"  +  title      	  +  "',"
				           +  ""   +  authorID		  +  ","
				           +  "'"  +  publisher       +  "',"
				           +  "'"  +  publishDate     +  "',"
				           +  ""   +  price           +  ");"
				           );
				if(outcome1==1){
					return "success";
				}
				else{
					return "failure";
				}
			}
			else{
				return "inputerror";
			}
		}catch(Exception e){
			e.printStackTrace();
			return "exception";
		}
	}
	
}
