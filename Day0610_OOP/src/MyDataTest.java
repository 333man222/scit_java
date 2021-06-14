//VO클래스(Value Object Class) - 값을 저장하기 위한 용도
//대부분의 정의한 클래스는 생성해야 사용가능
class Score{
	private String name;	//메소드 밖에 있는 것 
						//멤버변수, 인스턴스 변수
	private double jumsu;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getJumsu() {
		return jumsu;
	}
	public void setJumsu(double jumsu) {
		this.jumsu = jumsu;
	}
	
}
// 접근지정자 (Access Modifier) 종류 : private, protected, default, public
// 메소드(Method) 생성 : 로직이 있는 프로그램 덩어리

class Phone{
	private String name;
	private String address;
	private String phoneNum;
}
public class MyDataTest {

	public static void main(String[] args) {
		int jumsu; //지역변수 ==> 초기화 안하면 오류
		String name;
		jumsu = 98;
		name = "손오공";
		
		Score s = new Score();	// 메모리에 로딩시키는 역할 수행
		s.setJumsu(89);
		s.setName("저팔계");
		
		int kor, eng, mat, sum;
		double avg;
		
		kor=80;
		eng=78;
		mat=99;
		
		//평균을 구하는 로직 : 값이 있는 변수 (시험 점수) ==>매개변수
			//담는 작업 ==> 리턴
		avg = (kor+eng+mat) / 3.0;	// 로직 처리(계산하는 것)
		
	// 값(명사)를 저장하기 위한 용도 VO클래스
	// 로직을 처리하는 용도(Service 클래스, Manager클래스)
	// 데이터베이스 저장을 위한 용도(dao클래스)(Database access object - DB에 접근해서 처리하기 위한 용도의 클래스)
	// 데이터베이스 접근해서 service와 dao의 데이터를 처리하기 위한 용도(dto)
		//- dao의 vo를 전달하기 위한 용도
	// mapper =>자바가  DB의 쿼리문에서 사용할 데이터를 주거나 받기위해 할일을 설계 해놓은 클래스
	
			
	}
	/*  접근지정자 리턴타입 메소드명(전달인자) {
			이 메소드에서 해야하는 로직;
			return;
		}
*/
	public double avg(int kor, int eng, int mat) {
		return(kor+eng+mat) / 3.0;
	}

}
