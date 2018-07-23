
public interface SocialFeedReadeer {
 public message pollForNewmessage();
// return message;
 }
class message
{
	int msgId;
	String msgSrc,msgType,msg;
	public String getMsgType() {
		return msgType;
	}
	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}
	public int getMsgId() {
		return msgId;
	}
	public void setMsgId(int msgId) {
		this.msgId = msgId;
	}
	public String getMsgSrc() {
		return msgSrc;
	}
	public void setMsgSrc(String msgSrc) {
		this.msgSrc = msgSrc;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}