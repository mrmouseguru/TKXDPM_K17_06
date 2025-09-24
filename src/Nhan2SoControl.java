
public class Nhan2SoControl {
	private InputInterface in;
	private OutputInterface out;
	private Nhan2So n2so;
	
	
	public Nhan2SoControl(InputInterface in, OutputInterface out, Nhan2So n2so) {
		this.in = in;
		this.out = out;
		this.n2so = n2so;
	}





	public void execute() {
		out.show("[CHO EM XIN SỐ]:");
		int number1 = in.getNumber();
		out.show("[CHO EM XIN SỐ]:");
		int number2 = in.getNumber();
		int result = n2so.nhan2So(number1, number2);
		out.show("Result: " + String.valueOf(result));
	}
	
	
}
