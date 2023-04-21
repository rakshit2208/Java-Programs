// java program to sort string using stringbuffer
public class StringSortUsingStringBuffer 
{
    public static void main(String[] args) 
    {
        StringBuffer s1 = new StringBuffer("ECABD");

		System.out.println("Original String is : " + s1);
		int n = s1.length();
		for(int i = 0; i < n; i++ ) 
		{
			for(int j = i+1; j < n; j++) 
			{
				char x = s1.charAt(i);
				char y = s1.charAt(j);

				if(s1.charAt(i)>s1.charAt(j))
				{
					s1.setCharAt(i, y);
					s1.setCharAt(j, x);
				}

			}
		}
         
		System.out.println("Sorted String is : " + s1); 
    }
}
