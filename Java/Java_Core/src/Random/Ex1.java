package Random;

import java.util.Random;

public class Ex1 {
	public static void main(String[] args) {
            Random rd=new Random();
            
            for(int i=1;i<10;i++)
            {
                int sorandom=rd.nextInt(1,50);
                
                System.out.println(sorandom);            	
            }

	}
}
