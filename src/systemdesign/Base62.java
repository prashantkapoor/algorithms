package systemdesign;

public class Base62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String encoded=new Base62().base62Encode(999L);
		System.out.println(encoded);
	}
	String base62Encode(Long value) {
		String[] s="0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
		//sArray=
		String hashVal="";
		
		while (value>0) {
			hashVal=s[(int) (value%62)]+hashVal;
			value=value/62;
		}
		return hashVal;
	}

}
