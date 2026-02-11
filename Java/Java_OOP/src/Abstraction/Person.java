package Abstraction;

public abstract class Person {
   private String name ;
   private int tuoi;
   
   public Person()
   {
	   
   }

   /**
    * @param name
    * @param tuoi
    */
   public Person(String name, int tuoi) {
	this.name = name;
	this.tuoi = tuoi;
   }

   public String getName() {
	return name;
   }

   public void setName(String name) {
	this.name = name;
   }

   public int getTuoi() {
	return tuoi;
   }

   public void setTuoi(int tuoi) {
	this.tuoi = tuoi;
   }
   public void display() {
	    System.out.println("Tên: " + name + ", Tuổi: " + tuoi);
	}
   public abstract void xe();
}
