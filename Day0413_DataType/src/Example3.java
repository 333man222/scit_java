
public class Example3 {
	public static void main(String[] args) {
		//문제 1: 섭씨온도를 화씨온도로 바꾸어 출력하시오
		double f, c;
		c = 13;
		f = c * (9 / 5.0) + 32; //문법오류(syntax error), 실행오류(runtime error)
		
		System.out.println("섭씨" + c + "℃는 화씨로" + f + "℉입니다.");
		
		//섭씨 13도는 화씨로xx도입니다.
		
		//문제 2 : 적정체중 구하기 - * 연산자만 사용할 것
		
		//적정체중 = (키 - 100) * 0.9
		//
			
		double cm, kg;
		cm = 170.2;
		kg = (cm - 100) * 0.9;
		
		System.out.print(cm + "cm 키의 적정체중은");
		System.out.println(kg + "kg입니다.");
		
		/*문제 3 :
		사과 2335개가 있다. 개당 4300원이다. 도매상 13명이 나눠서 내려고 한다면,
		한명당 얼마를 내야 하는가?
		*/
		int apple , price, merchant, total;
		apple = 2335;
		price = 4300;
		merchant = 13;
		total = (apple * price) / merchant;
		System.out.println("한명당 내야하는 금액은" + total + "원 이다.");
		
		/*문제 4 
		라면 1200원, 과자 1500원, 음료수 700원
		라면 1개 과자1개 음료수 2개 샀을경우 내야할 돈
		*/
		
		int ramen = 1200;
		int okashi = 1500;
		int nomimono = 700;
		
		int cost = ramen * 2 + okashi * 1 + nomimono * 2;
		System.out.println("금액은" + cost + "원 입니다.");
		
		/*문제 5
		 2021년 현재 최저시급은 8590원이다. 하루 8시간 근무, 주 5일 근무를 한다고 했을 때
		 총 계산된 급여액을 계산하시오.
		 */
		
		
	}
}
