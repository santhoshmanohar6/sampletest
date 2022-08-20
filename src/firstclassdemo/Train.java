package firstclassdemo;

public class Train {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="santhosh";
		String b="aeiou";
		for(int i=0;i<a.length();i++)
		{
			for (int j=0;j<b.charAt(i);j++)
			{
				if((args[i].equals(b.charAt(j)))
				{
					System.out.println("vowels presents");
				}
			}
		}
	}
}


eq