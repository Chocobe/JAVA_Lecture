# Window Builder

Window Builder 사용하기

Window Builder는 swing을 이용한 GUI환경을 만드는 자동 코딩 프로그램이다.

코드만을 이용한 GUI제작에서, 제작시에도 GUI를 제공하여 개발의 편의성과 빠른 제작이 가능하다.

---

* [Install](#install)


* [Option setting](#option-setting)

---
---

### Install

1. 다운로드 링크 가져오기

	1. Eclipse 홈페이지 (www.eclipse.org)
	
	1. 상단 메뉴에서 ``Projects`` 클릭
	
	1. ``Search`` 클릭
	
	1. ``window`` 검색
	
	1. ``Eclipse WindowBuilder`` 선택
	
	1. ``Downloads`` 선택
	
	1. ``Update Sites``의 ``Latest`` 링크 선택
	
	1. 해당 페이지의 주소를 복사 (https://download.eclipse.org/windowbuilder/latest/)
	
1. Eclipse에서 설치하기

	1. 메인 메뉴 중 ``Help`` -> ``Install New Software`` 선택
	
	1. 우측의 ``ADD`` 선택
	
	1. ``Name``부분에 원하는 이름을 입력 (Window_Builder 로 작성함)
	
	1. ``Location``에 복사한 링크 주소를 붙여넣고 ``ADD``
	
	1. 검색된 결과 중, ``Window Builder``만 선택하고 ``Next`` 및 설치
	
	1. 설치 완료 후, Eclipse 재실행
	
:camel:[Top](#window-builder)
	
---
---

### Option setting

* Window Builder의 자동 코드 생성 설정하기

	1. 메인 메뉴 중 ``Window`` -> ``Preference`` 선택

	1. ``Window Builder`` -> ``Swing`` -> ``Code Generation`` 선택
	
	1. ``Method name for new Statements`` 를 ``initGUI``로 선택
	
	1. ``Variable generation``을 ``Field``로 선택
	
:camel:[Top](#window-builder)