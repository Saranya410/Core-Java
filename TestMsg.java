
public class TestMsg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TwitterFeedReadeer tfr= new TwitterFeedReadeer();
message m1=tfr.pollForNewmessage();
System.out.println(m1.getMsgId());
System.out.println(m1.getMsg());
		System.out.println(m1.getMsgSrc());
				System.out.println(m1.getMsgType());
						

	}

}
