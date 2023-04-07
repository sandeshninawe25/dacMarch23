class Pattern10
{
	public static void main (String args[])
	{
		for (int i=69; i>=65;i--)
		{
			for(int k=65; k<=i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=i; j<=69;j++)
			{
				System.out.print((char)j+" ");
			}
			System.out.println();
		}
	}
}