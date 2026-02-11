package Inheritance.CoderLearn;

public class Menu {
	public static void main(String[] args) {
     Person ps1=new Person("Nam",20,"Đà Nẵng");
     ps1.display();
     Student st1 = new Student("An", 19, "Hà Nội", 3.5);
     st1.display(); 

     System.out.println("----------------");

     // 2. Khởi tạo đối tượng Teacher (Giáo viên)
     // Giả sử Teacher có thêm thuộc tính Salary (Lương) là 1500
     Teacher tc1 = new Teacher("Dũng", 35, "Hồ Chí Minh", 1500);
     tc1.display();
	}
}
