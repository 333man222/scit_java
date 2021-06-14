package net.scit41.oper;

import java.util.Scanner;

public class Operator {


		   private int num1;
		   private char op;
		   private int num2;

		   public Operator() {
		   }
		   
		   public void setNum1(int data) {num1 = data;}   
		   public void setOp(char data) {op = data;}
		   public void setNum2(int data) {num2 =data;}
		  
		   public int getNum1() {return num1;}
		   public char getOp() {return op;}
		   public int getNum2() {return num2;}

		   public int plus( ) {return num1+num2;}
		   public int min( ) {return num1-num2;}
		   public int mul( ) {return num1*num2;}
		   public int div( ) {return num1/num2;}
		   
		   public static void main(String[] args) {
		        Operator oe = new Operator(); 
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.println("ù��°����");
		        oe.setNum1(sc.nextInt());
		        
		        System.out.println("������");
		        oe.setOp(sc.next().charAt(0));
		        
		        System.out.println("�ι�°����");
		        oe.setNum2(sc.nextInt());
		        
		        
		        if(oe.getOp()=='+') {
		           System.out.println(oe.plus());
		        }
		        else if(oe.getOp()=='-') {
		           System.out.println(oe.min());
		        }
		        else if(oe.getOp()=='*') {
		           System.out.println(oe.mul());
		        }
		        else if(oe.getOp()=='/') {
		           System.out.println(oe.div());
		        }
		        else {
		           System.out.println("������ �Է��� �� �� �Ǿ����ϴ�.");
		        }
		        
				try {
					int result = num1/num2;
					System.out.println(num1+" / "+num2+" = "+result);
					break;
				} catch (ArithmeticException e){
					System.out.println("0���� ������ �����ϴ�.");
					continue;
				}
			}
		
		
	}

}

