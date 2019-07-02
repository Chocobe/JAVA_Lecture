package java_class.tv;

public class TV_Array_test {
	public static void main(String[] args) {
		TV_lg[] tv_arr = new TV_lg[3];
		
		for(int i = 0; i < tv_arr.length; i++) {
			tv_arr[i] = new TV_lg();
			tv_arr[i].set_channel(i + 10);
		}
		
		for(int i = 0; i < tv_arr.length; i++) {
			tv_arr[i].channel_up();
			System.out.println("tv_arr[" + i + "]의 현재 채널 : " + tv_arr[i].get_channel());
		}
	}
}
