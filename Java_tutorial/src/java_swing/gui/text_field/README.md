# Text_field_test

텍스트를 입력할 수 있는 상자를 만드는 방법이다.

``JTextField text_field = new JTextField(10);``

의 형식으로 만드는데, 생성자의 인자값은 텍스트 상자의 글자 개수(크기)이다.

컴포넌트이기 떄문에, 컨테이너에 ``add()``메소드를 통해 등록하여 사용한다.