#define _CRT_SECURE_NO_WARNINGS 1
//#define X 1
//#include <stdio.h>
//int main()
//{
//	const int i = 4;
//	char arr1[3];
//	char arr2[4+4];
//	int arr3[5];
//	int arr4[X];
//	return 0;
//}
//#include <stdio.h>
//int main()
//{
//	int i = 0;
//	int arr1[]={1,2,3,4,5,6,7,8,9,10};
//	int sz = sizeof(arr1)/sizeof(arr1[0]);
//	int* p = &arr1[0];
//	printf("%p\n",arr1);
//	for(i=0; i<sz; i++)
//	{
//		printf("&arr1[%d]=%p <==> %p\n",i,&arr1[i],p+i);
//		/*printf("%d\n",*(p+i));*/
//	}
//	
//	/*char arr1[] = "bit";
//	char arr2[] = {'b','i','t'};
//	printf("%s\n",arr1);
//	printf("%s\n",arr2);*/
//	return 0;
//}
//#include <stdio.h>
//int main()
//{
//	/*int arr[3][4]={{1,2},{3,4},5};*/
//	int arr[3][4] = {{1,2},{3,4}};
//	int i = 0;
//	int j =0;
	/*for(i=0; i<3; i++)
	{
	for(j=0; j<4; j++)
	{
	printf("%d ",arr[i][j]);
	}
	printf("\n");
	}*/
	/*for(i=0; i<4; i++)
	{
	for(j=0; j<3; j++)
	{
	printf("%d ",arr[j][i]);
	}
	printf("\n");
	}*/
	/*for(i=0; i<3; i++)
	{
		for(j=0; j<4; j++)
		{
			printf("&arr[%d][%d]=%p\n", i, j, &arr[i][j]);
		}
	
	}
	return 0;
}*/
//void bubble_sort(int arr[],int sz)
//{
//	
//	int i = 0;
//	
//	for(i=0;i<sz-1; i++)
//	{
//		int j = 0;
//		int flag = 1;
//		for(j=0; j<sz-1-i ; j++)
//		{
//			if(arr[j]<arr[j+1])
//			{
//				flag = 0;
//				int tmp = arr[j];
//				arr[j] = arr[j+1];
//				arr[j+1] =tmp;
//			}
//		}
//		if(flag == 1)
//			break;
//	}
//}
//int main()
//{
//	int i = 0;
//	int arr[]={0,1,2,3,4,5,6,7,8,9};
//	int sz = sizeof(arr)/sizeof(arr[0]);
//	
//	bubble_sort(arr,sz);
//	for(i=0; i<10 ;i++)
//	{
//		printf("arr[%d]=%d\n",i,arr[i]);
//	}
//	return 0;
//}
//int main()
//{
//	int a = -1;
//	//原码  10000000000000000000000000000001 正数的原码反码补码一样，计算机存储是存储补码
//	//反码  11111111111111111111111111111110 反码是源码除了符号位，全部取反
//	//补码  11111111111111111111111111111111 补码是反码加1
//	int b = a>>1;
//	printf("%d\n",b);
//	return 0;
//}
 //int main()
 //{
	// int a = 10;
	// int b = 5;
	// int c = a&b;//按位与 （有零则零）
	// //00000000000000000000000000001010
	// //00000000000000000000000000000101
	// //00000000000000000000000000000000（0）
	// printf("%d\n",c);
	// c = a|b;//按位或（有一则一）
	// //00000000000000000000000000001010
	// //00000000000000000000000000000101
	// //00000000000000000000000000001111（15）
	// printf("%d\n",c);
	// c = a^b;//按位异或（相反取1，相同取0）
	// //00000000000000000000000000001010
	// //00000000000000000000000000000101
	// //00000000000000000000000000001111(15)
	// printf("%d\n",c);
	// return 0;
 //}
//#include <stdio.h>
//void my_sort(int arr[],int sz)
//{
//	int i = 0;
//	for(i=0; i<sz-1;i++)
//	{
//		int j = 0;
//		int flag = 1;
//		for(j=0; j<sz-1-i; j++)
//		{
//			if(arr[j]>arr[j+1])
//			{
//				int tmp =arr[j];
//				flag = 0;
//				
//				arr[j] = arr[j+1];
//				arr[j+1] = tmp;
//			}
//		}
//		if(flag = 1)
//			break;
//	}
//	
//}
//int main()
//{
//	int i = 0;
//	int arr[10]={0};
//	int sz = sizeof(arr)/sizeof(arr[0]);
//	printf("请输入你需要从小到大排序的10个数字:\n");
//	for(i=0; i<10;i++)
//	{
//		scanf("%d",&arr[i]);
//	}
//	
//	my_sort(arr,sz);
//	for(i=0; i<10; i++)
//	{
//		printf("arr[%d]=%d 
//			",i,arr[i]);
//	}
//	
//	return 0;
//}