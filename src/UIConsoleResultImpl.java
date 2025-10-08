
import java.io.PrintWriter;

public class UIConsoleResultImpl implements OutputInterface{
	private PrintWriter pwt;
	
	
	
	public UIConsoleResultImpl(PrintWriter pwt) {
		this.pwt = pwt;
	}



	@Override
	public void show(OutputData outData) {
		// TODO Auto-generated method stub
		pwt.println("Result: " + outData.result);
		pwt.flush();
		
	}

}
