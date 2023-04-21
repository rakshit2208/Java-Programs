// java program to sort string using new string variable
public class SortingString 
{
    public static void main(String[] args)
    {
        String os = "HELLO"; 

		//converting string to character array
		char tempS[] = os.toCharArray();
         
		int n = tempS.length;
		for(int i = 0; i < n; i++ ) 
		{
			for(int j = i+1; j < n; j++) 
			{
				if(tempS[i]>tempS[j]) 
                {
					char temp = tempS[i];
					tempS[i] = tempS[j];
					tempS[j] = temp;
				}
			}
		}

		//storing sorted character array back to string
		String s = new String(tempS); 

		System.out.println("Original String is : " + os); 
		System.out.println("Sorted String is : " + s); 
    }
}
