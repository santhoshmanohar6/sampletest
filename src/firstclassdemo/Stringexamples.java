package firstclassdemo;

public class Stringexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="vcentry";
		String b="Vxcentry";
		String c="   selenium class  ";
				System.out.println(a+b);
				System.out.println(a.charAt(4));
				System.out.println(a.length());
				System.out.println(a.substring(4,7));
				System.out.println(a.indexOf('t'));
				System.out.println(b.isEmpty());
				System.out.println(a.toUpperCase());
				System.out.println(b.toLowerCase());
				System.out.println(c);
				System.out.println(c.trim());
				System.out.println(a.equals(b));
				System.out.println(a.equalsIgnoreCase(b));
				System.out.println(a.concat(b));
				System.out.println(a);
				
				StringBuffer d=new StringBuffer("vcentry");
				StringBuffer e=new StringBuffer("technology");
				System.out.println(d.append(e));
				System.out.println(d);

	}

}
