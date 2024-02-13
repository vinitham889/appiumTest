package mobile_hybrid;

public class ConvertStrToOppositeCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "VinIthA";
		String x = "";
		for(int i =0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch))
				x += Character.toLowerCase(ch);
			else
				x += Character.toUpperCase(ch);
		}
		System.out.println(x);

	}

}
