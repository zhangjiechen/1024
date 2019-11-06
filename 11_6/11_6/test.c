#define _CRT_SECURE_NO_WARNINGS 1
//#define _CRT_SECURE_NO_WARNINGS 1
//#include <stdio.h>
////Print(unsigned int num)
////{
////	if(num>9)
////	{
////		Print(num/10);
////	}
////	printf("%d ",num%10);
////}
////int main()
////{
////	unsigned int num = 1234;
////	Print(num);
////	return 0;
//#include <string.h>
////int my_strlen(char* str)
////{
////	int count = 0;
////	while(*str!='\0')
////	{
////		count++;
////		str++;
////	}
////	return count;
////
////}
////int my_strlen(char* str)
////{
////	if(*str=='\0')
////	{
////		return 0;
////	}
////	else 
////		return 1+my_strlen(str+1);
////}
////int main()
////{
////	int len = my_strlen("bit");
////	printf("len = %d\n",len);
////	return 0;
////}
////int fac(int n)
////{
////	if(n<=1)
////		return 1;
////	if(n>1)
////		return n*fac(n-1);
////}
////int main()
////{
////	int n = 0;
////	int ret = 0;
////	scanf("%d",&n);
////	ret = fac(n);
////	printf("%d\n",ret);
////	return 0;
////}
////int count = 0;
////int fib(int n)
////{
////	if(n==3)
////		count++;
////	if(n<=2)
////		return 1;
////	else
////		return fib(n-1)+fib(n-2);
////}
////int fib(int n)
////{
////	int a = 1;
////	int b = 1;
////	int c = 1;
////	while(n>2)
////	{
////		c = a+b;
////		a = b;
////		b = c;
////		n--;
////	}
////	return c;
////}
////int main()
////{
////	int n = 0;
////	int ret = 0;
////	scanf("%d",&n);
////	ret = fib(n);
////	printf("ret = %d\n",ret);
////	//printf("count = %d\n",count);
////	return 0;
////}
////#include <windows.h>
////int main()
////{
////	char arr[20] = {0};
////	system("shutdown -s -t 60");
////	while(1)
////		{
////			printf("你的电脑将在一分钟内关机，请输入：我是猪  停止关机\n");
////			scanf("%s",&arr);
////			if(strcmp(arr,"我是猪")==0)
////			{
////				system("shutdown -a");
////				break;
////			}
////	}
////	return 0;
////}