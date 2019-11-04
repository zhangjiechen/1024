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
int main()
{
	int arr[] = {1,2,3,4,5,6,7,8,9,10};
	int left = 0;
	int right = 9;
	int i = 7;
	while(left<=right)
	{
		int mid = (left+right)/2;
		if(arr[mid]>i)
		{
			right=mid-1;
		}
		else if(arr[mid]<i)
		{
			left = mid+1;
		}
		else
		{
			printf("下标是:%d\n",mid);
			break;
		}
	}
	if(left>right)
	{
		printf("找不到!");
	}
	return 0;
}