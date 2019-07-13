package excpeiont;

public class MyException {
	public static void copyFile() { }
	public static void deleteFile() { }
	
	public static boolean enoughSpace() {
		// 설치 공간 확인 코드
		return false;
	}
	
	public static boolean enoughMemory() {
		// 메모리 확인 코드
		return false;
	}
	
	public static void startInstall() 
			throws SpaceException, MemoryException {
		// 설치 공간이 부족하면..
		if(!enoughSpace()) {
			throw new SpaceException("설치공간 부족!");
		}
		
		// 메모리가 부족하면..
		if(!enoughMemory()) {
			throw new MemoryException("메모리 부족!");
		}
	}
	
	public static void main(String[] args) {
		try {
			startInstall();
			copyFile();
			
		} catch(SpaceException e) {
			System.out.println("에러 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보해 주세요.");
			
		} catch(MemoryException e) {
			System.out.println("에러 : " + e.getMessage());
			e.printStackTrace();
			System.gc();
			System.out.println("다시 설치해 주세요.");
		}
	}
}

@SuppressWarnings("serial")
class SpaceException extends Exception {
	public SpaceException(String _message) {
		super(_message);
	}
}

@SuppressWarnings("serial")
class MemoryException extends Exception {
	public MemoryException(String _message) {
		super(_message);
	}
}