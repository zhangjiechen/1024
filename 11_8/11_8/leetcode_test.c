#define _CRT_SECURE_NO_WARNINGS 1
//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
//	你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
//
//示例:
//
//给定 nums = [2, 7, 11, 15], target = 9
//
//	因为 nums[0] + nums[1] = 2 + 7 = 9
//	所以返回 [0, 1]
//#include <stdio.h>
//int main()
//{
//	int nums[] = { 2, 9, 11, 15 };
//	int target = 13;
//	int j = 0;
//	int n = sizeof(nums) / sizeof(nums[0]);
//	int i = 0;
//	for (i = 0; i<n; i++)
//	{
//
//		if (nums[i] < target)
//		{
//			int temp = nums[i];
//			for (j = i+1; j < n; j++)
//			{
//				if (temp + nums[j] == target)
//				{
//					printf("i=%d j=%d\n", i, j);
//					break;
//				}	
//			}
//		}
//	}
//	return 0;
//}
//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
#include<stdio.h>
//#include<math.h>
//int main( )
//{
//	int n , temp , result = 0 ;
//	scanf( "%d" , &n ) ;
//	temp = abs(n) ;
//	while( temp % 10 == 0 && temp != 0 )
//		temp /= 10 ;
//
//	do{
//		result = result * 10 + temp % 10 ;
//		temp /= 10 ;
//	} while( temp != 0 ) ;
//
//	if( n < 0 )
//		result *= -1 ;
//	printf( "%d\n" , result ) ;
//}
//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
//#include <stdio.h>
//int main()
//{
//	int x = 0 ;
//	int i = 0;
//	scanf("%d",&x);  // 12321
//	if(x < 0 || (x % 10 == 0 && x != 0)) {
//		printf("false\n");
//	}
//	
//	while(x > i) {
//		i = i * 10 + x % 10; // 1 12 123
//		x /= 10; // 1232 123 12
//	}
//	 if(x == i || x == i/10)
//	 {
//		 printf("true\n");
//	 }
//	 else
//		 printf("false\n");
//	return 0;
//}

