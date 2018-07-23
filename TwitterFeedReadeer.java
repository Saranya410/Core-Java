
public class TwitterFeedReadeer implements SocialFeedReadeer {

	@Override
	public message pollForNewmessage() {
		// TODO Auto-generated method stub
		message m1=new message();
		m1.setMsgId(1);
	m1.setMsg("hi");
	m1.setMsgSrc("Twitter");
	m1.setMsgType("String");
		return m1;
	}

}
