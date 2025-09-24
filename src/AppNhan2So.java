import java.io.PrintWriter;
import java.util.Scanner;

public class AppNhan2So {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutputInterface out = null;
		InputInterface in = null;
		Scanner sc = new Scanner(System.in);
		PrintWriter pwt = new PrintWriter(System.out);
		
		out = new OutputWrapperImpl(pwt);//sai
		in = new InputWrapperImpl(sc);
		
		Nhan2So n2So = new Nhan2So();
		
		Nhan2SoControl n2soControl = new Nhan2SoControl(in, out, n2So);
		n2soControl.execute();
	}

}
