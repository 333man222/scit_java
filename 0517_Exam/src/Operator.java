
import java.util.List;
import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
        List<E>[] num = new List[](); 
        List[] oper = new List[](); /
        
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine(); 
        
        String tmp = ""; 
        
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); 
            
            if(ch == '+' || ch =='-' || ch == '*' || ch == '/') {
                numList.add(Integer.parseInt(tmp)); 
                opList.add(ch); 
                tmp = "";                  
                continue; //���� ����� ��ɹ����� �̵�
            }
            tmp += ch; //������ �ձ����� ���ڸ� �ӽ÷� �־� ����
        }
        numList.add(Integer.parseInt(tmp)); //������ ����
 
        while(!opList.isEmpty()) { //�����ڹ迭�� �� ������
            int prevNum = numList.poll(); //poll : �պ��� ������ ����
            int nextNum = numList.poll();
            char op = opList.poll();
            
            if(op == '+') {
                numList.addFirst(prevNum + nextNum); //addFirst �迭 ���� �տ� �ִ´�
            } else if(op == '-') {
                numList.addFirst(prevNum - nextNum);
            } else if(op == '*') {
                numList.addFirst(prevNum * nextNum);
            } else if(op == '/') {
                numList.addFirst(prevNum / nextNum);
            }
        }
        System.out.println(numList.poll());
    }
}
 
		try {
			int result = num/num;
			System.out.println(first+" / "+second+" = "+result);
			break;
		} catch (ArithmeticException e){
			System.out.println("0���� ������ �����ϴ�.");
			continue;
		}
	}
		
	}

}
