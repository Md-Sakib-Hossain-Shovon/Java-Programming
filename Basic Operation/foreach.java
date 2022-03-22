public class foreach
{
public static void main(String args[]){
	int num[]=new int[5];
	num[0]=10;
	num[1]=20;
	num[2]=30;
	num[3]=40;
	num[4]=50;
	int sum=0;
	int avg=0;
	for(int value:num)
	{
	sum=sum+value;
	avg=sum/5;}
	System.out.println(sum);
	System.out.println(avg);
}
}