import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ConditionTest1 {
	 public static void main(String[] args) throws IOException{
		  System.out.print("���ʪ�����������������ƪ��������� : ");
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  String imsi = br.readLine();
		  Calendar birth = Calendar.getInstance();
		  StringTokenizer sf = new StringTokenizer(imsi, "-");
		  int year = Integer.parseInt(sf.nextToken());
		  int mon = Integer.parseInt(sf.nextToken());
		  int date = Integer.parseInt(sf.nextToken());
		  birth.set(year, mon-1, date);
		  
		  Calendar now = Calendar.getInstance();

		  long past = birth.getTime().getTime();
		  long today = now.getTime().getTime();

		  long day = (today - past)/(24*60*60*1000);
		  long time = (today - past)/(60*60*1000);
		  long sec = (today - past)/ 1000;
		  long minute = (today - past)/(60*1000);
		  System.out.println("���ʪ����Ѫު�"+day+"��  "+time+"���ࡡ"+minute+"�¡�"+sec+"���檭�ƪ��ު���");
		  
		  System.out.println("�ƾ�ī �ٺ� ����");
	}
	
}
