class Encapsulation {
    private int roll, marks;  // Private variables (data hiding)
    private String v;

    // Constructor
    public Encapsulation() {
        this.roll = 1;
        this.v = "sai";
        this.marks = 10;
    }

    // Getter methods (to access private variables)
    public int getRoll() {
        return roll;
    }

    public String getName() {
        return v;
    }

    public int getMarks() {
        return marks;
    }

    // Setter methods (to modify private variables)
    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String v) {
        this.v = v;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void greeting() {
        System.out.println("My name is " + this.v);
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();

        // Accessing data using getter methods (not directly)
        System.out.println(obj.getRoll());
        System.out.println(obj.getName());
        System.out.println(obj.getMarks());

        // Modifying data using setter methods
        obj.setMarks(99);
        System.out.println("Updated Marks: " + obj.getMarks());
    }
}
/*output
1
sai
10
Updated Marks: 99*/
