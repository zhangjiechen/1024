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
//	//ԭ��  10000000000000000000000000000001 ������ԭ�뷴�벹��һ����������洢�Ǵ洢����
//	//����  11111111111111111111111111111110 ������Դ����˷���λ��ȫ��ȡ��
//	//����  11111111111111111111111111111111 �����Ƿ����1
//	int b = a>>1;
//	printf("%d\n",b);
//	return 0;
//}
 //int main()
 //{
	// int a = 10;
	// int b = 5;
	// int c = a&b;//��λ�� ���������㣩
	// //00000000000000000000000000001010
	// //00000000000000000000000000000101
	// //00000000000000000000000000000000��0��
	// printf("%d\n",c);
	// c = a|b;//��λ����һ��һ��
	// //00000000000000000000000000001010
	// //00000000000000000000000000000101
	// //00000000000000000000000000001111��15��
	// printf("%d\n",c);
	// c = a^b;//��λ����෴ȡ1����ͬȡ0��
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
//	printf("����������Ҫ��С���������10������:\n");
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