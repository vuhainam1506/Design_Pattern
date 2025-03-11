public class Main {
    public static void main(String[] args) {

        // hoc sinh 1
        Student student1 = new Student(1, "Nguyen Van An");

        // hoc sinh 2
        Student student2 = new Student(2, "Nguyen Van Duc");

        // hoc sinh 3
        Student student3 = new Student(3, "Nguyen Huu Duc");

        ClassLeader classLeader = new ClassLeader();
        classLeader.registerObserver(student1);
        classLeader.registerObserver(student2);
        classLeader.registerObserver(student3);
        System.out.println("Lop truong gui tin nhan toi cac hoc sinh: ");
        classLeader.notifyObservers("Hom nay se co bai kiem tra");

        classLeader.removeObserver(student2);
        System.out.println("Lop truong gui tin nhan toi cac hoc sinh (sau khi xoa hoc sinh 2): ");
        classLeader.notifyObservers("Ngay mai nghi hoc");
    }
}