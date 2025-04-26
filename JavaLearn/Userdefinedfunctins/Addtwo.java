package Userdefinedfunctins;

public class Addtwo {

	public static void main(String[] args) {
		
		int x=10;
		int y=20;
		System.out.println("A");
		int totalsum=add2(x,y)+50;
		System.out.println("totalsum="+totalsum);
		System.out.println("B");
      
	}
	
	public static int add2(int x,int y){
		
		return x+y;
	}

}
