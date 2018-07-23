
public class FBReadeer implements SocialFeedReadeer{

	@Override
	public message pollForNewmessage() {
		// TODO Auto-generated method stub
		message m1=new message();
		m1.setMsgId(2);
	m1.setMsg("hello");
	m1.setMsgSrc("FB");
	m1.setMsgType("String");
	m1.setMsgSender("unknown");
	return m1;
	}
       
}
