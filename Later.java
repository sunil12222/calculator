import java.util.Scanner;
public class Later {

	public static void main(String[] args) {
		int a,b,total;
   Scanner sc = new Scanner(System.in);
   System.out.print("1.addition");
   System.out.print("2.substraction");
   System.out.print("3.multiplication");
   System.out.println("4.division");
   System.out.println("please choose one operation");
   total= sc.nextInt();
   if(total==1) {
	   System.out.println("you are choosing addition");	   
   }
   if(total==2) {
	   System.out.println("you are choosing substraction");	   
   }
   if(total==3) {
	   System.out.println("you are choosing division");	   
   }
   if(total==4) {
	   System.out.println("you are choosing multipal");	   
   }
   
   
   System.out.println("please enter firs no");
   int no1= sc.nextInt();
   
   System.out.println("please enter secound no");
   int no2= sc.nextInt();
   //please enter two no
   
   //take input from user
   
   
   //make condition
   if(total == 1 ) {
		add obj =new add();
		obj.addition(no1,no2);
		//System.out.println("Addition="+obj.total);
   }else if(total==2){
	     sub su = new sub();
	     su.substraction(no1,no2);
	     //System.out.println("substraction="+su.total);    
   }else if(total==3){
	    division dv =new division();
	    dv.divisions(no1, no2);
	    //System.out.println("division="+dv.total);
	}else if(total==4) {
	   maultipal mb=new maultipal();
	   mb.maltipal( no1, no2);
	}
	}

}
