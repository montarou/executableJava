package executableJava;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		DashBoard dash = new DashBoard();

		String pwd = System.getProperty("user.dir");
		System.out.println("le repertoire courant est : "+pwd);
	}

}
