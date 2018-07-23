package firstproject;

interface SocialFeedReader{
	public Message pollForNewMessage();
}

class Message{
	int nessageId;
	String messageSource;
	String messageType;
	String message;
	String senderName;
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public int getNessageId() {
		return nessageId;
	}
	public void setNessageId(int nessageId) {
		this.nessageId = nessageId;
	}
	public String getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(String messageSource) {
		this.messageSource = messageSource;
	}
	public String getMessageType() {
		return messageType;
	}
	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}

class TwitterFeedReader implements SocialFeedReader{

	@Override
	public Message pollForNewMessage() {
		//create mes obj
		Message m1=new Message();
		m1.setNessageId(1);
		m1.setMessageSource("Twitter");
		m1.setMessageType("String");
		m1.setMessage("Hello all...from Twitter");
		m1.setSenderName("Priyam_tw");
		return m1;
	}
	
}

class FacebookFeedReader implements SocialFeedReader{

	@Override
	public Message pollForNewMessage() {
		//create mes obj
		Message m1=new Message();
		m1.setNessageId(2);
		m1.setMessageSource("Facebook");
		m1.setMessageType("String");
		m1.setMessage("Hello all...from Facebook");
		m1.setSenderName("Priyam_fb");
		return m1;
	}
}

public class InterfaceEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwitterFeedReader tw=new TwitterFeedReader();
		Message m=tw.pollForNewMessage();
		System.out.println(m.getMessage());
		System.out.println(m.getMessageSource());
		System.out.println(m.getMessageType());
		System.out.println(m.getNessageId());
		System.out.println(m.getSenderName());
		
		System.out.println();
		
		FacebookFeedReader fb=new FacebookFeedReader();
		Message m1=fb.pollForNewMessage();
		System.out.println(m1.getMessage());
		System.out.println(m1.getMessageSource());
		System.out.println(m1.getMessageType());
		System.out.println(m1.getNessageId());
		System.out.println(m1.getSenderName());
	}
}
