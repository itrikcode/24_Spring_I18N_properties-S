import org.springframework.context.MessageSource;
public class BeanI18N{
	
	private MessageSource messagesource;
	public void setMessageSource(MessageSource messagesource){
		this.messagesource=messagesource;
	}
	
	public void displayMessage(){
		System.out.println("Message : "+messagesource.getMessage("welcome", new Object[] {"it" ,"IT"}.					Locale.IT));
		System.out.println("Message : "+messagesource.getMessage("welcome",new Object[]{"en","US"}.Locale.US));
		
		System.out.println("message : "+messagesource.getMessage("welcome",new Object[]{"in","IN"}.Locale.IN));
	}
	
	
	
}