#include <iostream>
using namespace std;
void swap(int*, int*); //Swap function declaration

int main()
{
   int x, y;

   //printf("Enter the value of x and y\n");
   cin>>x>>y;

   cout<<"Before swapping a= "<<x<<" and b="<<y;

   swap(&x, &y);

   cout<<"\nAfter swapping a= "<<x<<" and b="<<y;

   return 0;
}
//Swap function definition
void swap(int *a, int *b)
{
   int t;

   t  = *b;
   *b = *a;
   *a = t;
}

