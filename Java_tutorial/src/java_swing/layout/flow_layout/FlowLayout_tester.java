package java_swing.layout.flow_layout;

import java.awt.FlowLayout;

public class FlowLayout_tester {
	public static void main(String[] args) {
		// 실행하여 창 위치를 이동시키면 3개 창 모두 볼 수 있음		
		
		// 좌측 정렬
		new My_frame(FlowLayout.LEFT);
		// 중앙 정렬
		new My_frame(FlowLayout.CENTER);
		// 우측 정렬
		new My_frame(FlowLayout.RIGHT);
	}
}
