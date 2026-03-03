package Try_Catch;

import java.util.Scanner;

public class vidu {
	public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        while(true)
        {
        	try {
            	System.out.println("nhập vào số");
                int n=nhap.nextInt();	
                break;
        	}catch (Exception e) {
    			System.out.println("sai");
    		    break;
        	}	
        }
        System.out.println("đã thoát ");
        
	}
}
