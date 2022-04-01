package consumemessages;

public class ConsumeMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("main method starts");
		
		SenderEX.sendMsgs();
		System.out.println("sending done");
		Reciever.recive();
		
		System.out.println("main method ends");

	}

}
