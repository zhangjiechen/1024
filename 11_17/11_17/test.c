#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
//void Swap(int a,int b)
//{
//	/*a = a^b;
//	b = a^b;
//	a = a^b;*/
//	a = a+b;
//	b = a-b;
//	a = a-b;
//	printf("a=%d b=%d\n",a,b);
//}
//int main()
//{
//	int a = 3;
//	int b = 5;
//	Swap(a,b);
//	
//	return 0;
//#include <assert.h>
//int my_strlen(const char* str)
//{
//	/*int count = 0;*/
//	/*while(*str != '\0')
//	{
//	count++;
//	str++;
//	}*/
//	assert(str != NULL);
//	if(*str != '\0')
//	{
//		return 1+my_strlen(str+1);
//	}
//	else
//		return 0;
//}
//int main()
//{
//	char arr[] = "bit";
//	int len = my_strlen(arr);
//	printf("len = %d\n",len);
//	return 0;
//}
//double Pow(int n,int k)
//{
//	if(k>0)
//		return n*Pow(n,k-1);
//	else if(k==0)
//		return 1;
//	else
//		return 1.0/Pow(n,-k);
//	
//}
//int main()
//{
//	int n = 0;
//	int k = 0;
//	double ret = 0.0;
//	scanf("%d%d",&n,&k);
//	ret = Pow(n,k);
//	printf("ret = %lf\n",ret);
//	return 0;
//}
//void PrintTable(int n)
//{
//	int i = 0 ;
//	int j = 0;
//	for(i=1; i<=n;i++)
//	{
//		for(j=1;j<=i;j++)
//		{
//			printf("%d*%d=%-2d ",i,j,i*j);
//		}
//		printf("\n");
//	}
//}
//int main()
//{
//	int line = 0;
//	scanf("%d",&line);
//	PrintTable(line);
//	return ;
//}
//int main()
//{
//	
//	int ch = 0;
//	while((ch= getchar()) != EOF)
//	{
//		if(ch>='a' && ch<='z')
//			putchar(ch-32);
//		else if(ch>='A' && ch<='Z')
//			putchar(ch+32);
//		else if(ch>='0' && ch<='9')
//			continue;
//		else 
//			putchar(ch);
//	}
//	return 0;
//}
//#include <ctype.h>
//int main()
//{
//
//	int ch = 0;
//	while((ch= getchar()) != EOF)//获取字符不会空的时候
//	{
//		if(islower(ch))//判断是不是小写
//			putchar(toupper(ch));
//		else if(isupper(ch))//判断是不是大写
//			putchar(tolower(ch));
//		else if(isdigit(ch))
//			continue;
//		else 
//			putchar(ch);
//	}
//	return 0;
//}
//int main()
//{
//	int line = 0;
//	int i = 0;
//	scanf("%d",&line);
//	//上半区
//	for(i=0; i<line; i++)
//	{
//		//打印一行
//		//打印空格
//		int j = 0;
//		for(j=0; j<line-i-1; j++)
//		{
//			printf(" ");
//		}
//		//打印*
//		for(j=0; j<2*i+1; j++)
//		{
//			printf("*");
//		}
//		printf("\n");
//
//	}
//	//下半区
//	for(i=0; i<line-1; i++)
//	{
//		int j = 0;
//		for(j=0; j<=i;j++)
//		{
//			printf(" ");
//		}
//		for(j=0; j<2*(line-1-i)-1; j++)
//		{
//			printf("*");
//		}
//		printf("\n");
//	}
//	return 0;
//}
int main()
{
	int arr1[] = {1,3,5,7,9};
	int arr2[] = {2,4,6,8,10};
	int sz = sizeof(arr1)/sizeof(arr1[0]);
	int tmp = 0;
	int i = 0;
	for(i=0; i<sz; i++)
	{
		tmp = arr1[i];
		arr1[i] = arr2[i];
		arr2[i] = tmp;
	}
	printf("arr1= ");
	for(i=0; i<sz; i++)
	{
		printf("%d ",arr1[i]);
	}
	printf("\n");
	printf("arr2= ");
	for(i=0; i<sz; i++)
	{
		printf("%d ",arr2[i]);
	}
	return 0;
}