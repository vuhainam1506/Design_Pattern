public class Student implements Observer{
    private int id;
    private String name;

    public Student(int id, String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " nhan tin nhan tu lop truong: " + message + "\n");
    }
}
