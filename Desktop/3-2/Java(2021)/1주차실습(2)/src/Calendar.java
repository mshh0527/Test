/*
 * 2021�� 9�� �޷¸����
 */

public class Calendar {
	
	public static void main(String[]args) {
		String[]days = {"��","��","ȭ","��","��","��","��"};
		final int NUM = 30;
	
		
		System.out.println("2021�� 9��");
		
		for(int i=0;i<7;i++) {
			System.out.print(days[i]+"\t");
		}
		System.out.print("\n");
		
		for(int i=1;i<=NUM;i++) {
			System.out.print(i+"\t");
			if(i%7==0)
				System.out.println();
		}
		
	}

}
