package tutorial;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;

public class Book {
        private String isbn;
        private String title;
        private String publisher;
        private Date publishDate;
        private int authorID;
        private float price;
        
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

        
        public String showBookInfo(){
        	return "success";
        }
        
        public String deleteBook(){
        	Conn c = new Conn();
    		Connection con = c.getConnection();
    		try{
    			Statement sql = con.createStatement();
    			int res = sql.executeUpdate("delete from Book where ISBN='"+isbn+"';");
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
        	Conn c = new Conn();
    		Connection con = c.getConnection();
    		try{
    			if(!isbn.equals("") && !title.equals("") && authorID>0){
    				Statement sql = con.createStatement();
    				ResultSet res = sql.executeQuery("select * from Author where AuthorID="+authorID+";");   
    				if(!res.next()){
    					return "abscence";
    				}
    				int outcome = sql.executeUpdate("insert into Book values(" 
    				           +  "'"  +  isbn            +  "',"
    				           +  "'"  +  title      	  +  "',"
    				           +  ""   +  authorID		  +  ","
    				           +  "'"  +  publisher       +  "',"
    				           +  "'"  +  publishDate     +  "',"
    				           +  ""   +  price           +  ");"
    				           );
    				if(outcome==1){
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
        
        public String updateBook(){
        	return "";
        }
        
}
