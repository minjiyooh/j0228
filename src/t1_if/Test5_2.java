package t1_if;

import java.util.Scanner;

// 직급코드를 입력받아서 직급별 명칭을 출력하시오
/*
   직급코드 1 :  부장, 본봉 : 5000000
   직급코드 2 :  과장, 본봉 : 4000000
   직급코드 3 :  대리, 본봉 : 3000000
   직급코드 4 :  사원, 본봉 : 2000000
   
   시간수당(sudang) : 시간을 입력받아서 1시간당 2만5천원으로 계산 한다.
   공제액(gongje) : 본봉(bonbong + 수당)의 10%로 한다.
   실수령액(netpay)을 구하시오.
   단, 실수령액 본봉 = 본봉 + 수당 - 공제액
 */
public class Test5_2 {
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
		
    int sudang, bonbong, netpay, code, hour, gongje;

    System.out.println("직급을 입력하시오? (1:부장,1:과장,1:대리,1:사원)");
    code = sc.nextInt();

    if (code >= 1 && code <= 4) {
        System.out.println("시간수당을 입력하세요.");
        hour = sc.nextInt();
        
        if (code == 1) {
          bonbong = 5000000;
      } else if (code == 2) {
          bonbong = 4000000;
      } else if (code == 3) {
          bonbong = 3000000;
      } else { 
          bonbong = 2000000;
      }

      System.out.println("입력하신 코드 " + code + "는 본봉 " + bonbong + " 원입니다.");

     
      sudang = 25000 * hour;
      gongje = (int) (0.1 * (bonbong + sudang));
      netpay = bonbong + sudang - gongje;

      System.out.println("본봉: " + bonbong + "원");
      System.out.println("시간수당: " + sudang + "원");
      System.out.println("공제액: " + gongje + "원");
      System.out.println("실수령액: " + netpay + "원");
  } else {
      System.out.println("비사원");
  }

  sc.close();
	}
}
