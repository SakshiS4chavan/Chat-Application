package in.sp.main;

public class ChatMessagePojo { //clients send data or server send data is is map in this class then it is transfer client or server.
	private MessageType type;
	private String content;
	private String sender;
	
	public enum MessageType{
		CHAT,
		JOIN,
		LEAVE
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}
	

}
