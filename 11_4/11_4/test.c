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
//	struct Stu zhangsan={"����",15,"��","10111602"};
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
//			printf("�±���:%d\n",mid);
//			break;
//		}
//	}
//	if(left>right)
//	{
//		printf("�Ҳ���!");
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
//		printf("�������������:");
//		scanf("%s",&password);
//		if(strcmp(password,"123456")==0)
//		{
//			printf("����������ȷ!!!");
//			break;
//		}
//		else
//		{
//			printf("��������������������룡");
//		}
//	}
//	if(i==3)
//	{
//		printf("���������������,�˳�����");
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
//		printf("��������µ�����:");
//		scanf("%d\n",&guess);
//		if(guess>set)
//		{
//			printf("���˴���!\n");
//		}
//		else if(guess<set)
//		{
//			printf("С��С��!\n");
//		}
//		else
//		{
//			printf("��ϲ�㣬�¶���!\n");
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
//		printf("��ѡ��->");
//		scanf("%d",&input);
//		switch(input)
//		{
//		case 1:
//			//����Ϸ
//			game();
//			break;
//		case 0:
//			printf("�˳���Ϸ��\n");
//			break;
//		default:
//			printf("ѡ���������������\n");
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
//	printf("��ע�⣬��ĵ��Խ���һ�����ڹػ����������:������ ��ȡ���ػ�\n");
//	scanf("%s",&input);
//	if(strcmp(input,"������")==0)
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
//			printf("��ע�⣬��ĵ��Խ���һ�����ڹػ����������:������ ��ȡ���ػ�\n");
//			scanf("%s",&input);
//			if(strcmp(input,"������")==0)
//			{
//			system("shutdown -a");
//			break;
//			}
//	}
//	return 0;
//}