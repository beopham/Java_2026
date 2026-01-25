package Cu_Phap_Basic;

public class Vong_Loop_While {
	public static void main(String[] args) {
          int i=1;
          int sum=0;
         
//          while(i<100) {
//        	  System.out.println(i);
//        	  i+=1;
//          }
          while(i<=100) {
        	sum=sum+i;
        	i++;
          }
          System.out.println("kết quả "+sum);
	}
}
