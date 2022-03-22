public class arrmax
{
public static void main(String args[]){
	int num[]=new int[5];
	num[0]=15;
	num[1]=19;
	num[2]=10;
	num[3]=99;
	num[4]=1;
	int max;
	int index=0;
	max=num[0];
	for(int i=0;i<=4;i++)
	{
		if (num[i]>max){
		max=num[i];
		index=i;
		}
		}
		
		System.out.println(""+max);
		System.out.println(""+index);
	}
}
