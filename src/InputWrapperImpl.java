import java.util.Scanner;

public class InputWrapperImpl implements InputInterface {
	private Scanner sc;
	
	public InputWrapperImpl(Scanner sc) {
		this.sc = sc;
	}

	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		return sc.nextInt();
	}
	
}
