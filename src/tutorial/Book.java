package tutorial;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Book {
        private String isbn;
        private String title;
        private String publisher;
        private Date publishDate;
        private int authorID;
        private float price;
        private ArrayList<Book> books;
        
        public String getIsbn(){
        	return isbn;
        }
        public String getTitle(){
        	return title;
        }
        public String getPublisher(){
        	return publisher;
        }
        public Date getPublishDate(){
        	return publishDate;
        }
        public int getAuthorID(){
        	return authorID;
        }
        public float getPrice(){
        	return price;
        }
        public ArrayList<Book> getBooks() {
			return books;
		}
		
        
        public void setIsbn(String isbn){
        	this.isbn = isbn;
        }
        public void setTitle(String title){
        	this.title = title;
        }
        public void setPublisher(String publisher){
        	this.publisher = publisher;
        }
        public void setPublishDate(Date publishDate){
        	this.publishDate = publishDate;
        }
        public void setAuthorID(int authorID){
        	this.authorID = authorID;
		}
        public void setPrice(float price){
        	this.price = price;
        }
        public void setBooks(ArrayList<Book> books) {
			this.books = books;
		}

        
        public String showBookInfo(){
        	return "success";
        }
        
        public String deleteBook(){
        	Connection con = Conn.getConnection();
    		try{
    			Statement sql = con.createStatement();
    			int res = sql.executeUpdate("delete from book where ISBN='"+isbn+"';");
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
        
        public String addBook(){
        	Connection con = Conn.getConnection();
    		try{
    			Statement sql = con.createStatement();
				ResultSet res = sql.executeQuery("select * from author where AuthorID="+authorID+";");   
				if(!res.next()){
					return "abscence";
				}
				int outcome;
				if(publishDate==null){
					outcome = sql.executeUpdate("insert into book values(" 
  				           +  "'"  +  isbn            +  "',"
  				           +  "'"  +  title      	  +  "',"
  				           +  ""   +  authorID		  +  ","
  				           +  "'"  +  publisher       +  "',"
  				           +  ""  +  publishDate     +  ","
  				           +  ""   +  price           +  ");"
  				           );
				}
				else{
					outcome = sql.executeUpdate("insert into book values(" 
 				           +  "'"  +  isbn            +  "',"
 				           +  "'"  +  title      	  +  "',"
 				           +  ""   +  authorID		  +  ","
 				           +  "'"  +  publisher       +  "',"
 				           +  "'"  +  publishDate     +  "',"
 				           +  ""   +  price           +  ");"
 				           );
				}
				if(outcome==1){
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
        
        public String showAllBooks(){
        	Connection con = Conn.getConnection();
    		try{
    			Statement sql = con.createStatement();
    			ResultSet res = sql.executeQuery("select * from book");
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
		
}
