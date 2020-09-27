import org.springframework.context.MessageSource;
import java.util.Locale;
public class BeanI18N{
	/*
	private message message;
	public void setmessage(message message){
		this.message=message;
	}
	*/
	
	private MessageSource message; 
 
    public void setMessage(MessageSource message) { 
        this.message = message; 
    } 
     

public void displayMessage(){
 
		
System.out.println("Message :"+message.getMessage("welcome",new Object[]{"fr","FRANCE"},Locale.FRANCE)); 		
		
System.out.println("Message : "+message.getMessage("welcome",new Object[]{"en","US"},Locale.US));
		
 	}
	
	
	
}