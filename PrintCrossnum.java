class PrintCrossnum
{
public static void main(String[] index)
	{
		PrintCrossnum primary=new PrintCrossnum();
		String num1=index[0];
		int row=Integer.parseInt(num1);
		String num2=index[1];
		int col=Integer.parseInt(num2);
		primary.printDiagonal(row,col);
	}
	
	void printDiagonal(int r,int c)
	{
		for(int row=1;row<=r;row++)
		{
		for(int col=1;col<=c;col++)
		{
			if(row==col||row==row+col )
			{			
		System.out.print(row+""+col+"\t");
			}
			else
			{
				System.out.print("\t");
			}
		}
		
		System.out.println();		
			
		}
}




}