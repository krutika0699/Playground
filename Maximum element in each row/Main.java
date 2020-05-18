#include<iostream>
using namespace std;
#include<stdio.h>

int main()
{
int i , j, r , c , n , a[100][100],max[100];
//printf("Enter the number of rows: ");
cin>>r;
//printf("Enter the number of columns: ");
cin>>c;
//printf("Enter the elements of the array- \n");
for(i = 0; i < r; i=i+1)
{
for(j = 0; j < c; j=j+1)
{
//cout<<i+1,j+1;
cin>>a[i][j];
}
}
//printf("The input matrix is:- \n");
/*for(i = 0; i < r; i++)
{
for(j = 0; j < c; j++)
{
cout<<a[i][j];
}
cout<<"\n";
}*/
for(i = 0; i < r; i++)
{
max[i] = a[i][j];
for(j = 0; j < c ; j++)
{
if(a[i][j]>max[i])
{
max[i]=a[i][j];
}
}

}
for(i = 0; i < r; i++)
{
cout<<max[i]<<"\n";
}
return 0;
}