public class SimpleClass {
    String name;
    // Constructor
    public SimpleClass(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        SimpleClass obj = new SimpleClass("Student");
        System.out.println("Object created for: " + obj.name);
    }
}
