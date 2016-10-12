package tutorial;

import java.sql.*;

public class DeleteBook {
	private String isbn;
	public String getIsbn(){
		return isbn;
	}
	public void setIsbn(String isbn){
		this.isbn = isbn;
	}
	
	public String execute(){
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
}
