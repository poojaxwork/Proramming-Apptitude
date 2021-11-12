class RightSideTri
{
public static void main(String args[])
{
RightAngleTri array=new RightAngleTri();
array.printLeftTri();

}
void printLeftTri()
{
	for(int row=1;row<=5;++row){
	for(int column=1;column<=row;column++)
	{
	System.out.print("*"  + " " );	
		
	}
	System.out.println();
	}
	
}}

