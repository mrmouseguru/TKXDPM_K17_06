
public class Nhan2So {
	private OutputInterface out;
	private InputInterface in;
	
	

	public Nhan2So(OutputInterface out, InputInterface in) {
		this.out = out;
		this.in = in;
	}



	void nhan2So() {
		out.show("[CHO EM XIN SỐ]:");
		int number1 = in.getNumber();
		out.show("[CHO EM XIN SỐ]:");
		int number2 = in.getNumber();
		double result = number1 * number2;
		
		out.show("Result: " + String.valueOf(result));
	}
}
