public class SimpleClass {
    String name;
    
    // Constructor
    public SimpleClass(String name) {
        this.name = name;
    }
    
    public static void main(String[] args) {
        // Creating object with my name
        SimpleClass obj = new SimpleClass("Jaewon Kim"); 
        System.out.println("Object created for: " + obj.name);
    }
}
