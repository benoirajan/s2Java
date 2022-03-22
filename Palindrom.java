public class Palindrom{
	public static void main(String[] a){
		System.out.println(a[0] +" is palindrom?:"+isPal(a[0]));
		System.out.println(a[1]+" is palindrom?:"+isPal(a[1]));
		Palindrom p = new Palindrom();
		System.out.println(a[2]+"- sum of digit: "+p.sumD(a[2]));
	}

	static boolean isPal(String s){
		String k = "";
		for(int i=0; i<s.length();i++)
			k = s.charAt(i) + k;
		//System.out.println(k);
		return s.equals(k);
	}

	public int sumD(String s){
		int j=0;
		for(int i=0;i<s.length();i++)
			j+=(int)Integer.parseInt(""+s.charAt(i));
		String k = j+"";
		if(k.length()>1)
			return sumD(k);
		return j;
	}
}