//#include <stdio.h>
//int main()
//{
//	int a=10;
//	int *p=&a;
//	printf("%d\n",sizeof(p));
//	*p=20;
//	printf("%p\n",&a);
//	printf("%d",*p);
//	return 0;
//
//}
//#include <stdio.h>
//int main()
//{
//	printf("%d\n",sizeof(char*));
//	printf("%d\n",sizeof(short*));
//	printf("%d\n",sizeof(int*));
//	printf("%d\n",sizeof(long*));
//	printf("%d\n",sizeof(float*));
//
//
//	return 0;
//}
//struct Stu
//{
//	char name[20];
//	short age;
//	char sex[5];
//	char id[10];
//};
//int main()
//{
//	struct Stu zhangsan={"张三",15,"男","10111602"};
//	struct Stu *pzs=NULL;
//	pzs=&zhangsan;
//	printf("%s %d %s %s\n",zhangsan.name,zhangsan.age,zhangsan.sex,zhangsan.id);
//	printf("%s %d %s %s\n",*pzs->name,(*pzs).age,zhangsan.sex,zhangsan.id);
//	return 0;
//
//}
//int main()
//{
//	int a = 5;
//	if(1 == a)
//	{
//		printf("bingo!\n");
//	}
//	else
//	{
//		printf("budui\n");
//	}
//	return 0;
//
//}
//int main()
//{
//	**int ch = getchar();
//	putchar(ch);
//	printf("\n");
//	ch = getchar();
//	putchar(ch);*/*/
//	/*int ch = 0;*/
//	/*while((ch = getchar())!=EOF)
//	{
//		if('0'<ch&&ch<'9')
//		printf("%c\n",ch);
//	}*/
//	/*while((ch=getchar())!=EOF)
//	{
//		if(ch<'0'||ch>'9')
//			continue;
//		putchar(ch);
//	}*/
#include <stdio.h>
//int main()
//{
//	int i = 0;
//	for(i=1; i<=10; i++)
//	{
//		if(i==5)
//			continue;
//		printf("%d ",i);
//	}
//	return 0;
//}
//int main()
//{
//	int i = 0;
//	int k = 0;
//	for(i=0,k=0;k=0;i++,k++)
//		k++;
//	return 0;
//}
//int main()
//{
//	int arr[] = {1,2,3,4,5,6,7,8,9,10};
//	int left = 0;
//	int right = 9;
//	int i = 7;
//	while(left<=right)
//	{
//		int mid = (left+right)/2;
//		if(arr[mid]>i)
//		{
//			right=mid-1;
//		}
//		else if(arr[mid]<i)
//		{
//			left = mid+1;
//		}
//		else
//		{
//			printf("下标是:%d\n",mid);
//			break;
//		}
//	}
//	if(left>right)
//	{
//		printf("找不到!");
//	}
//	return 0;
//}
//#include <string.h>
//#include <windows.h>
//int main()
//{
//	char arr1[]="Welcome to bit!!!!!";
//	char arr2[]="###################";
//	int left = 0;
//	int right = strlen(arr2)-1;
//	while(left<=right)
//	{
//		arr2[left] = arr1[left];
//		arr2[right] = arr1[right];
//		printf("%s\n",arr2);
//		Sleep(1000);
//		system("cls");
//		left++;
//		right--;
//	}
//	return 0;
//}
//#include <string.h>
//int main()
//{
//	int i = 0 ;
//	char password[] = {0};
//	for(i;i<3;i++)
//	{
//		printf("请输入你的密码:");
//		scanf("%s",&password);
//		if(strcmp(password,"123456")==0)
//		{
//			printf("密码输入正确!!!");
//			break;
//		}
//		else
//		{
//			printf("密码输入错误，请重新输入！");
//		}
//	}
//	if(i==3)
//	{
//		printf("三次输入密码错误,退出程序！");
//	}
//	return 0;
//}
//#include <stdlib.h>
//#include <time.h>
//void menu()
//	{
//		printf("##################\n");
//		printf("######1: play!####\n");
//		printf("######0: exit!####\n");
//		printf("##################\n");
//	}
//void game()
//{
//	int set = rand()%100+1;
//	int guess = 0;
//	while(1)
//	{
//		printf("请输入你猜的数字:");
//		scanf("%d\n",&guess);
//		if(guess>set)
//		{
//			printf("大了大了!\n");
//		}
//		else if(guess<set)
//		{
//			printf("小了小了!\n");
//		}
//		else
//		{
//			printf("恭喜你，猜对了!\n");
//			break;
//		}
//		
//	
//	}
//	
//}
//int main()
//{
//	
//	int input=0;
//	srand((unsigned int)time(NULL));
//	do{
//		menu();
//		printf("请选择->");
//		scanf("%d",&input);
//		switch(input)
//		{
//		case 1:
//			//玩游戏
//			game();
//			break;
//		case 0:
//			printf("退出游戏！\n");
//			break;
//		default:
//			printf("选择错误，请重新输入\n");
//			break;
//		}
//	}while(input);
//	return 0;
//}
//#include <windows.h>
//int main()
//{
//	char input[20]={0};
//	system("shutdown -s -t 60");
//again:
//	printf("请注意，你的电脑将在一分钟内关机，如果输入:我是猪 就取消关机\n");
//	scanf("%s",&input);
//	if(strcmp(input,"我是猪")==0)
//	{
//		system("shutdown -a");
//	}
//	else 
//	{
//		goto again;
//	}
//	return 0;
////}
//#include <windows.h>
//int main()
//{
//	char input[20]={0};
//	system("shutdown -s -t 60");
//	while(1)
//		{
//			printf("请注意，你的电脑将在一分钟内关机，如果输入:我是猪 就取消关机\n");
//			scanf("%s",&input);
//			if(strcmp(input,"我是猪")==0)
//			{
//			system("shutdown -a");
//			break;
//			}
//	}
//	return 0;
//}