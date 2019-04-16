import java.util.Arrays;

public class test3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String a = "ABf";
		System.out.println(a);
		
        char[] b = a.toCharArray();
        System.out.println(Arrays.toString(b));
        
        
        for (char c : b) {
        	System.out.print(Integer.valueOf(c)+ " "); 
		}
        System.out.println();
        
        String e = "";
        for(int i = 0;i < b.length;i++) {
        	Integer g =Integer.valueOf(b[i]);
        	char d = (char) g.intValue();
        	System.out.print(d +" ");
        	e = e + d;
        }
        System.out.println();
        
        System.out.println(e);
	}

}
