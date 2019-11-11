//#define _CRT_SECURE_NO_WARNINGS 1
//#include <stdio.h>
////int main()
////{	
////	int a = 0;
////	a--;
////	//-1
////	//10000000000000000000000000000001
////	//11111111111111111111111111111110
////	//11111111111111111111111111111111
////	if(a < sizeof(a))
////	{
////		printf("<\n");
////	}
////	else
////	{
////		printf(">\n");
////	}
////	return 0;
////}
////int fun()
////{
////	static int count = 1;
////	return ++count;
////}
////int main()
////{
////	int answer = 0;
////	answer = fun()-fun()*fun();
////	printf("%d\n",answer);
////	return 0;
////}
////int main()
////{
////	int i = 1;
////	int a = (++i)+(++i)+(++i);
////	printf("%d\n",a);
////	return 0;
////}
////int main()
////{
////	int a = 10;
////	int * p = &a;
////	* p = 20;
////	printf("%d\n",a);
////}
////int main()
////{
////	int a = 0x11223344;
////	int* pa = &a;
////	char* pc = &a;
////	int i = 0;
////	for(i=0; i<4;i++)
////		printf("%p\n",*(pc+i));
////	/*printf("%p\n",pa);
////	printf("%p\n",pa+1);
////	printf("%p\n",pc);
////	printf("%p\n",pc+1);*/
////	/*int* p = &a;
////	*p = 0;*/
////	/*char* pc = &a;
////	*pc = 0;*/
////	return 0;
////}
////int main()
////{
////	int a = 0x11223344;
////	char* pc = (char*)&a;
////	int i = 0;
////	for(i=0; i<4;i++)
////	{
////		*(pc+i) = 0;
////  	}
////	return 0;
////}
//#include <string.h>
////int my_strlen(char* str)
////{
////	int count = 0;
////	while(*str !='\0')
////	{
////		count++;
////		str++;
////	}
//// 	return count;
////}
////int my_strlen(char* str)
////	{
////		char* start = str;
////		while(*str != '\0')
////		{
////			str++;
////		}
////		return str-start;
////	}
////int main()
////{
////	char arr[] = "bit";
////	int len = my_strlen(arr);
////	printf("%d\n",len);
////	return 0;
////}
////int main()
////{
////	int arr[10]  = {1,2,3,4,5,6,7,8,9,10};
////	/*printf("%p\n",arr);
////	printf("%p\n",&arr[0]);*/
////	int* p = arr;
////	int i = 0;
////	int sz = sizeof(arr)/sizeof(arr[0]);
////	for(i=0; i<sz; i++)
////	{
////		printf("%d ",*(p+i));
////	}
////	return 0;
////}
////int main()
////{
////	int a = 10;
////	int* p = &a;
////	int** pp = &p;//二级指针存放一级指针的地址
////	**pp = 20;
////	printf("%d\n",a);
////	return 0;
////}
////int main()
////{
////	//整形数组
////	int arr[10] = {1,2,3};
////	//字符数组
////	char arr2[5] = {'b','i','t'};
////	int a = 10;
////	int b = 20;
////	int c = 30;
////	//指针数组
////	int* arr3[4] = {&a,&b,&c};
////	printf("%d\n",*arr3[0]);
////	printf("%d\n",*arr3[1]);
////	printf("%d\n",*arr3[2]);
////	return 0;
////}
////struct A
////{
////	int num;
////	char ch;
////};
////struct Stu
////{
////	char name[20];
////	short age;
////	char id[20];
////	struct A sa;
////};
////void Printf1(struct Stu tmp)
////{
////	printf("%s %d %s -- %d %c\n",tmp.name,tmp.age,tmp.id,tmp.sa.num,tmp.sa.ch);
////}
////void Printf2(struct Stu* ps)
////{
////	printf("%s %d %s -- %d %c\n",ps->name,ps->age,ps->id,ps->sa.num,ps->sa.ch);
////}
////int main()
////{
////	
////	struct Stu s1 = {"张洁晨",22,"10111602",{100,'w'}};
////	Printf1(s1);
////	Printf2(&s1);
////	/*printf("%c\n",s1.sa.ch);*/
////	/*struct Stu* ps = &s1;
////	printf("%d\n",ps->age);*/
////	return 0;
////}
//两数交换
//int main()
//{
//	int a = 3;
//	int b = 5;
//	/*a = a+b;
//	b = a-b;
//	a = a-b;
//	printf("%d %d\n",a,b);*/
//	a = a^b;
//	b = a^b;
//	a = a^b;
//	printf("%d %d\n",a,b);
//	return 0;
//}
//求最大公约数和最小公倍数
//int main()
//{
//	int a = 24;
//	int b = 18;
//	int c = 0;
//	int num1 = a;
//	int num2 = b;
//	while(c=a%b)
//	{
//		a = b;
//		b = c;
//	}
//	printf("%d\n",b);  
//	printf("%d\n",num1*num2/b);
//	return 0;
//}
//int main()
//{
//	int i = 0;
//	int arr[10] = {1,2,3,4,5,6,7,8,9,10};//局部变量是分配在栈区的，而栈区的使用先使用高地址，再使用低地址，又因为数组随着下标的增长地址是由低到高增长的。而如果数组越界，越界下标的地址刚好是变量i的地址的话，改变下标的值得话就会改变i的值
//	for(i=0; i<=11; i++)
//	{
//		arr[i] = 0;
//		printf("hehe\n");
//	}
//	return 0;
//}