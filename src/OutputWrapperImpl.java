import java.io.PrintWriter;

public class OutputWrapperImpl implements OutputInterface{
	private PrintWriter pwt;
	
	
	
	public OutputWrapperImpl(PrintWriter pwt) {
		this.pwt = pwt;
	}



	@Override
	public void show(String str) {
		// TODO Auto-generated method stub
		pwt.println(str);
		pwt.flush();
		
	}

}
