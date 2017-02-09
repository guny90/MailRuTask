package test.task.v3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C {
	public final static String msg_addresse_xpath = "html/body/div[2]/div/div[5]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[6]/div[2]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div[1]/div/div/div[2]/div/div/div/textarea[2]";
	public final static String msg_subject_xpath = "html/body/div[2]/div/div[5]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[6]/div[2]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div[4]/div/div/div[2]/div/input";
	public final static String msg_unformatted_text_xpath = "html/body/div[2]/div/div[5]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[6]/div[2]/div[2]/div[2]/div/div/form/div[5]/div[1]/div/table/tbody/tr/td/table[1]/tbody/tr/td[20]/a/span[1]/span[2]";
	public final static String msg_text_area_xpath = "html/body/div[2]/div/div[5]/div/div/div/div/div/div/div/div/div/div/div/div/div/div[6]/div[2]/div[2]/div[2]/div/div/form/div[5]/div[2]/table/tbody/tr/td[1]/div[3]/div[1]/table/tbody/tr[2]/td/table/tbody/tr/td/table/tbody/tr[2]/td/textarea";
	
	public final static String site_name = "https://mail.ru/";
	public final static String email = "gunel_test@bk.ru";
	public final static String password = "Guny159357";
	
	public final static String addressee = "samadovagunel@gmail.com";
	public final static String subject = "test subj";
	public final static String text = "test text";
	
	@SuppressWarnings("null")
	protected static String[] separator(String username) {
		String[] result = null;
		Matcher m = null;
		String userPattern = "^[A-Za-z0-9\\.\\-\\_]*";
		String domainPattern = "@[A-Za-z0-9\\.\\-\\_]*$";
		
		Pattern user = Pattern.compile(userPattern);
		Pattern domain = Pattern.compile(domainPattern);
		
		result[0] = matching(m, user, username);
		result[1] = matching(m, domain, username);
		
		return result;
	}

	protected static String matching(Matcher matcher, Pattern pattern, String string) {
		matcher = pattern.matcher(string);
		if(matcher.find())	{
			return matcher.group(0);
		} else {
			return "not found";
		}
	}

}
