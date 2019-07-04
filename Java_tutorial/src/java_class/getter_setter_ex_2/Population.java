package java_class.getter_setter_ex_2;

import java.util.Scanner;

// 인구 = 인구 + (인구증가율 / 100) * 인구

// 도시 이름을 입력하세요 : ㅁㅁㅁ
// 인구를 입력하세요 : 100
// 인구 증가율(%)를 입력하세요 :10

// 도시 : 부산
// 인구 : 100
// 인구 증가율 : 10.0%
// 10년 후 예상 인구 : 259

// 계속하기를 원하세요?(true, false) : 

public class Population {
	String city_name;
	int cur_population;
	int after_population;
	int growth_rate;
	int after_year;
	
	
	// 생성자
	public Population() {
		this("부산");
	}
	
	public Population(String _city_name) {
		this(_city_name, 100);
	}
	
	public Population(String _city_name, int _population) {
		this(_city_name, _population, 10, 10);
	}
	
	public Population(String _city_name, int _population, int _growth_rate) {
		this(_city_name, _population, _growth_rate, 10);
	}
	
	public Population(String _city_name, int _population, int _growth_rate, int _year) {
		this.city_name = _city_name;
		this.cur_population = _population;
		this.growth_rate = _growth_rate;
		this.after_year = _year;
		calc_after_population(this.after_year);
	}
	// 생성자
	
	
	// 도시명 설정
	// @author	:	Chocobe
	// @param	:	String _city_name : 도시명
	// @return	:	N/A
	public void set_city_name(String _city_name) {
		this.city_name = _city_name;
	}
	
	
	// 현재 인구 설정
	// @author	:	Chocobe
	// @param	:	int _population : 현재 인구수
	// @return	:	N/A
	public void set_population(int _population) {
		this.cur_population = _population;
	}
	
	
	// 향후 년 설정
	// author	:	Chocobe
	// param	:	Scanner _sc : Scanner 객체
	// return	:	N/A
	public void set_after_year(Scanner _sc) {
		this.after_year = _sc.nextInt();
	}
	
	
	// 인구 성장률 설정
	// @author	:	Chocobe
	// @param	:	int _growth_rate : 인구 성장률
	// @return	:	N/A
	public void set_growth_rate(int _growth_rate) {
		this.growth_rate = _growth_rate;
		this.calc_after_population(10);
	}
	
	// 10년 후, 인구 연산
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	N/A
	private void calc_after_population(int _year) {
		this.after_population =
				(int)(this.cur_population + 
				(((double)this.growth_rate / 100) * this.cur_population * _year));
	}
	
	// toString 오버라이딩 (전체 데이터 반환)
	// @author	:	Chocobe
	// @param	:	N/A
	// @return	:	(String) 전체 데이터의 문자열
	@Override
	public String toString() {
		return "도시 : " + this.city_name + 
			   "\n인구 : " + this.cur_population + 
			   "\n인구 증가율 : " + this.growth_rate + 
			   "\n10년 후 예상 인구 : " + this.after_population;
	}
	
	
	// 데이터 입력부 통합 메소드
	// @author	:	Chocobe
	// @param	:	Scanner _sc : Scanner 객체
	// @return	:	N/A
	public void input_sequence(Scanner _sc) {
		// 도시명 입력부
		System.out.print("도시 이름을 입력하세요 : ");
		this.set_city_name(_sc.nextLine());
		
		// 인구수 입력부
		while(true) {
			System.out.print("인구를 입력하세요 : ");
			this.set_population(_sc.nextInt());
			
			if(this.cur_population < 0) {
				System.out.println("인구수 입력이 잘못 되었습니다.");
				continue;
			}
			
			break;
		}
		
		_sc.nextLine();
		
		// 향후 년 수
		while(true) {
			System.out.print("향후 몇 년 : ");
			this.set_after_year(_sc);
			
			if(this.after_year < 1) {
				continue;
			}
			
			break;
		}
		
		
		// 인구 증가율 입력부
		while(true) {
			System.out.print("인구 증가율(%)를 입력하세요 : ");
			this.set_growth_rate(_sc.nextInt());
			
			if(this.growth_rate < 0) {
				System.out.println("인구 증가율 입력이 잘못 되었습니다.");
				continue;
			}
			
			break;
		}
	}
}
