#include<stdio.h>
void main ()
{
	int lines = 3, count = 0;
	for (int i = 0; i < lines; i++) for (int j = lines - 1; j >= 0; j--)
	{
		printf("count = %d ", count++);
		printf("index = %d\n", lines * j + i);
	}
}
