package jsrlog;

public class JsrLog {
	
//	public static void logout(String agrString) {
//		System.out.println(agrString);
//	}
	
	public static void logout(String argv, Object... args) {
		System.out.printf(argv, args);
	}
}
