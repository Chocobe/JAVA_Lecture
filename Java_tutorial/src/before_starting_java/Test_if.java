package before_starting_java;

import java.util.Scanner;

public class Test_if {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		
		//num = scanner.nextInt();
		num = Integer.parseInt(scanner.nextLine());
		System.out.println("입력된 값 : " + num);
		
		if(num < 100)
			num += 100;	//num = num + 100;
		else
			num -= 100;	//num = num - 100;
		
		System.out.println("num : " + num);
		System.out.println("---------------------------");
		
		
		// 두 수를 입력하여 큰 값을 출력하기
		//
		int num1, num2;
		String str = "";
		
		System.out.print("num1 입력 : ");		
		num1 = scanner.nextInt();
		System.out.print("num2 입력 : ");
		num2 = scanner.nextInt();
		
		if(num1 < num2) 
			str = "큰 수는 " + num2 + "입니다.";
		else 
			str = "큰 수는 " + num1 + "입니다.";
		
		System.out.println("비교결과 : " + str);
		System.out.println("---------------------------");
		
		
		// 두 과목의 점수를 입력받아, 180이면 "조건성립", 그 외에는 "조건 불일치"
		//
		int sub_1, sub_2, sum = 0;
		
		System.out.print("과목 1 : ");
		sub_1 = scanner.nextInt();
		System.out.print("과목2 : ");
		sub_2 = scanner.nextInt();
		
		sum = sub_1 + sub_2;
		
		if(sum == 180)
			System.out.println("조건성립");
		
		else
			System.out.println("조건 불일치");
		System.out.println("---------------------------");
		
		
		// 이름, 점수 입력
		// 출력 :
		//		이름 : 합격(70점 이상일 경우)
		//		이름 : 불합격(70점 미만)
		//
		String name = "";
		int score = 0;
		
		scanner.nextLine();	// 버퍼 비우기
		
		System.out.print("이름을 입력하세요 : ");
		name = scanner.nextLine();
		System.out.print("점수를 입력하세요 : ");
		score = scanner.nextInt();
		
		System.out.print("이름 : " + name + ", ");
		if(score < 70) 
			System.out.println("불합격 점수 : " + score);
		
		else {
			System.out.println("합격 점수 : " + score);
		}
		System.out.println("---------------------------");
		
		
		// 두 정수를 입력하여, 합과 차를 비교하여 결과 출력
		// 출력 :
		//		"합 > 차" 또는 "합 < 차" "같다"
		//		합 = xxx
		//		차 = xxx
		int lhs, rhs, sub = 0;
		System.out.println("두 수를 입력하세요");
		
		System.out.print("좌측항 : ");
		lhs = scanner.nextInt();
		System.out.print("우측항 : ");
		rhs = scanner.nextInt();
		
		sum = lhs + rhs;
		
		if(lhs < rhs) {
			int temp = lhs;
			lhs = rhs;
			rhs = temp;
		}
		
		sub = lhs - rhs;
		
		if(sum > sub) {
			System.out.println("합 > 차");
			
		} else if(sum < sub) {
			System.out.println("합 < 차");
			
		} else {
			System.out.println("같다");
		}
		
		System.out.println("합 : " + sum + ", 차 : " + sub);
		System.out.println("---------------------------");
		
		// 입력 :
		//		총 인원수 : xxx
		//		총 식사비 : xxx
		// 총 인원수가 4명 이상이면, "총 식사비 * 0.1"로 할인하여, 총 지불액을 계산한다.
		//
		int member = 0;
		int cost = 0;
		
		System.out.print("총 인원수를 입력하세요 : ");
		member = scanner.nextInt();
		System.out.print("총 식사비를 입력하세요 : ");
		cost = scanner.nextInt();
		
		if(member >= 4) {
			cost = cost - (int)(cost * 0.1);
		}
		
		System.out.println("총 인원수 : " + member);
		System.out.println("총 식사비 : " + cost);
		System.out.println("---------------------------");
		
		// 비율에 따라 30이상이면 "최상이익" 출력
		// 20이상이면 "좋은수익",
		// 10이상이면 "보통수익" 출력
		//
		// 입력형식 :
		//			원가 : xxx
		//			판매가 : xxx
		//			이익 = 판매가 - 원가
		//			비율 = 이익 / 판매가 * 100
		//
		int origin_price = 0;
		int sale_price = 0;
		int profit = 0;
		double rate = 0.0F;
		int res = 0;
		
		System.out.print("재품의 원가 : ");
		origin_price = scanner.nextInt();
		System.out.print("재품의 판매가 : ");
		sale_price = scanner.nextInt();
		
		profit = sale_price - origin_price;
		rate = ((double)profit / sale_price) * 100;
		res = (int)rate;

		System.out.println("판매가 : " + sale_price + ", 원가 : " + origin_price);
		
		System.out.print("수익평가 : ");
		if(res >= 30)
			System.out.println("최상이익");
		
		else if(res >= 20)
			System.out.println("좋은수익");
		
		else
			System.out.println("보통수익");
		
		System.out.printf("비율 : %d\n", res);
		System.out.println("---------------------------");
		
		
		// 2과목의 점수, 공인점수 입력
		// 평균 >= 70 이거나, 공인점수 >= 700이면 합격, not 불합격
		int kor_score = 0;
		int eng_score = 0;
		
		System.out.print("국어점수 : ");
		kor_score = scanner.nextInt();
		System.out.print("영어점수 : ");
		eng_score = scanner.nextInt();
		
		if(kor_score >= 70 || eng_score >= 700)
			System.out.println("합격");
		
		else
			System.out.println("불합격");
		
		System.out.println("---------------------------");
		
		
		// 평균이 70이고 성별이 "man"이면 "해외근무"
		int work_score = 0;
		String sex = "";
		
		System.out.print("고가점수 : ");
		work_score = scanner.nextInt();
		scanner.nextLine();		// 버퍼제거
		
		System.out.print("성별 : ");
		sex = scanner.nextLine();
		
		if(work_score >= 70 && sex.equals("남"))
			System.out.println("해외근무");
		
		System.out.println("---------------------------");
		
		
		scanner.close();
	}
}
