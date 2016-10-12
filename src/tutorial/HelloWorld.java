package tutorial;

public class HelloWorld {

    private String name;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String execute() {
        name = "Hello, " + name + "!"; 
        return "success";
    }
}
