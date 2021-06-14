
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
                continue; //제일 가까운 명령문으로 이동
            }
            tmp += ch; //연산자 앞까지의 숫자를 임시로 넣어 놓음
        }
        numList.add(Integer.parseInt(tmp)); //마지막 숫자
 
        while(!opList.isEmpty()) { //연산자배열이 빌 때까지
            int prevNum = numList.poll(); //poll : 앞부터 완전히 뺀다
            int nextNum = numList.poll();
            char op = opList.poll();
            
            if(op == '+') {
                numList.addFirst(prevNum + nextNum); //addFirst 배열 제일 앞에 넣는다
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
			System.out.println("0으로 나눌수 없습니다.");
			continue;
		}
	}
		
	}

}
