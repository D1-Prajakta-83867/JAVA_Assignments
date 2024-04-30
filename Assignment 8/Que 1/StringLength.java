package p8;
import p8.exceptions.ExceptionLineTooLong;
public class StringLength {


	public void checkLen(String str2) {

		if(str2.length()>80)
			throw new ExceptionLineTooLong("The string is too long");
		
	}
}
 