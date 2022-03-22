public class avgsum
{
public static void main(String args[]){
	int num[]=new int[5];
	num[0]=10;
	num[1]=20;
	num[2]=30;
	num[3]=40;
	num[4]=50;
	int add=0;
	for(int i=0;i<=4;i++)
	{
	add=add+num[i];
	}
	int avg=(add/5);
	System.out.println(""+add);
	System.out.println(""+avg);

}
}