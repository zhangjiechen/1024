////////#include <stdio.h>
////////int get_max(int x,int y)
////////{
////////	if(x>y)
////////	{
////////		return x;
////////	}
////////	else
////////		return y;
////////
////////}
////////
////////int main()
////////{
////////	int a = 10;
////////	int b = 20;
////////	int max = get_max(a,b);
////////	printf("%d\n",max);
////////	return 0;
////////}
////////void swap1(int x,int y)//形式参数
////////{
////////	int c=0;
////////	c=x;
////////	x=y;
////////	y=c; 
////////
////////}
////////int main()
////////{
////////	int a = 10;
////////	int b = 20;
////////	printf("%d %d\n",a,b);
////////	当实参传给形参的时候，形参是实参的一份拷贝
////////	当形参修改的时候，不会影响实参
////////	swap1(a,b);//实参
////////	printf("%d %d\n",a,b);
////////	return 0;
////////
////////
////////}
//////#include <stdio.h>
////////void swap2(int* pa,int* pb)
////////{
////////	int c=0;
////////	c=* pa;
////////	* pa=* pb;
////////	* pb=c; 
////////}
////////int main()
////////{
////////	int a = 10;
////////	int b = 20;
////////	swap2(&a,&b);
////////	printf("%d %d\n",a,b);
////////	return 0;
////////}
////////int is_prime(int i)
////////{
////////	int j = 0;
////////	for(j=2;j<i;j++)
////////	{
////////		if(i%j==0)
////////			return 0;
////////	}
////////	return 1;
////////}
////////int main()
////////{
////////	int i = 0;
////////	for(i=100; i<=200; i++)
////////	{
////////		if(is_prime(i)==1)
////////		{
////////			 printf("%d ",i); 
////////		}
////////			
////////	}
////////	return 0;
////////}
////////int is_leap_year(year)
////////{
////////	return(((year%4==0)&&(year%100!=0))||(year%400==0));
////////}
////////int main()
////////{
////////	int year = 0;
////////	for(year=1000;year<=2000;year++)
////////	{
////////		if(is_leap_year(year))
////////		{
////////			printf("%d ",year);
////////		}
////////	}
////////	return 0;
////////}
//////#include <string.h>
//////int binary_search(int arr[],int k,int sz) 
//////{
//////	int left = 0;
//////	int right = sz-1;
//////	while(left<=right)
//////	{
//////		int mid = (left+right)/2;
//////		if(arr[mid]>k)
//////		{
//////			right = mid-1;
//////		}
//////		else if(arr[mid]<k)
//////		{
//////			left = mid+1;
//////		}
//////		else 
//////		{
//////			return mid;//找到了
//////		}
//////
//////	}
//////	return -1;//没找打
//////}
//////
//////
//////int main()
//////{
//////	int arr[] = {1,2,3,4,5,6,7,8,9,10};
//////	
//////	int k = 7;
//////	int sz = sizeof(arr)/sizeof(arr[0]);
//////	int ret = binary_search(arr,k,sz);
//////	//char arr1[] = "abcd";
//////	/*printf("%d\n",sz);*/
//////	if(ret==-1)
//////	{
//////		printf("没找到!\n");
//////	}
//////	else
//////	{
//////		printf("找到了，下标是:%d",ret);
//////	}
//////	/*	printf("%d\n",sz);*/
//////	/*printf("%d\n",strlen(arr1));*/
//////	return 0;
//////}
////#include <stdio.h>
////void Add(int *p)
////{
////	(*p)++;
////}
////int main()
////{
////	int num = 0;
////	printf("%d\n",num);
////	Add(&num);
////	printf("%d\n",num);
////	return 0;
////}
////#include <stdio.h>
////void new_line()
////{
////	printf("zjc\n");
////}
////void three_line()
////{	
////	int i = 0;
////	for(i=0;i<3;i++)
////	{
////		new_line();
////	}
////}
////int main()
////{
////	three_line();
////	return 0;
////}	
////#include <stdio.h>
////int main()
////{
////	printf("%d",printf("%d",printf("%d",432)));
////	return 0;
////}
//#include <stdio.h>
//#include "add.h"
//#include "sub.h"
//int main()
//{
//	int a = 10;
//	int b = 20;
//	int ret = Add(a,b);
//	printf("%d\n",ret);
//	ret = Sub(a,b);
//	printf("%d\n",ret);
//
//	return 0;
//}
