package Interface;

public class Connguoi implements Person,Animal {
    
	@Override
	public void ancom() {
		   System.out.println("lung linh kaka");
		
	}

	@Override
	public void kaka() {
	   System.out.println("lung linh");
		
	}
	public static void main(String[] args) {
	
		// Phải tạo đối tượng thì mới test được
        Connguoi tui = new Connguoi();
        
        tui.ancom();
        tui.kaka();
	}

}
