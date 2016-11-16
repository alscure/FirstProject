import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class StringToGsonSeven {
	
	public static void main(String [] args) throws Exception {
			
		String jsonString = "[{\"name\":\"ppseq\",\"value\":\"3\"},{\"name\":\"typeseq\",\"value\":\"1\"},{\"name\":\"ppname\",\"value\":\"강남AP\"},{\"name\":\"cookmastercode\",\"value\":\"R02\"},{\"name\":\"sessionname\",\"value\":\"세션1 (14:00~16:00)\"},{\"name\":\"reservationdate\",\"value\":\"20161215\"},{\"name\":\"enddatetime\",\"value\":\"1600\"},{\"name\":\"roomname\",\"value\":\"x\"},{\"name\":\"rsvsessionseq\",\"value\":\"1326\"},{\"name\":\"paymentstatuscode\",\"value\":\"P07\"},{\"name\":\"startdatetime\",\"value\":\"1400\"},{\"name\":\"price\",\"value\":\"55000\"},{\"name\":\"sessionymd\",\"value\":\"2016-12-15 (목)\"},{\"name\":\"sessionprice\",\"value\":\"55,000원\"},{\"name\":\"roomseq\",\"value\":\"74\"},{\"name\":\"standbynumber\",\"value\":\"0\"},{\"name\":\"interfaceChannel\",\"value\":\"MOBILE\"},{\"name\":\"paymentmode\",\"value\":\"easypay\"},{\"name\":\"totalPrice\",\"value\":\"55000\"},{\"name\":\"bankid\",\"value\":\"B\"},{\"name\":\"bankname\",\"value\":\"국민카드\"}]"; 
		//String jsonString = "[{\"name\":\"ppseq\",\"value\":\"3\"},{\"name\":\"typeseq\",\"value\":\"1\"}]"; 
		//System.out.println("" + jsonString);
		
		StringToGsonSeven aaa = new StringToGsonSeven();
		
		Gson gson = new Gson();
		List<Map<String,String>> list = gson.fromJson(jsonString, new TypeToken<List<Map<String,String>>>(){}.getType());
		
		//list.forEach(x -> System.out.println(x));
		
		//System.out.println("" + list);
		System.out.println("" + list.size());
		//System.out.println("" + list.get(0).toString() );
		
		for (int i = 0 ; i < list.size(); i++ ){
			
			//System.out.println("" + list.get(i).toString() );
			aaa.setRequestBoxFromMobileJson( list.get(i) );
		}
		//aaa.setRequestBoxFromMobileJson( list.get(0).toString() );
		
	}
	
	private void setRequestBoxFromMobileJson(Map jsonElement) throws Exception {
		//System.out.println(jsonElement);
		String name = (String)jsonElement.get("name");
		String value = (String)jsonElement.get("value");
		
		System.out.println("> name : " + name + "		 > value : " + value);	
		
	}

}
