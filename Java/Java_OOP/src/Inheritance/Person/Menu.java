package Inheritance.Person;

public class Menu {
	public static void main(String[] args) {
     Child con=new Child("Nam",12,3.25);
     con.display();
     con.an();

     Cha akaka = new Cha("đức",20);
     System.out.println(akaka.toString());

     akaka.an();
     
	}
}
