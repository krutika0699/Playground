#include<iostream>
using namespace std;

int fib (int);

int main ()

{

int n, result;

cin>>n;

result = fib (n - 1);
cout<<"The term "<<n<<" in the fibonacci series is "<<result;
//printf ("The term %d in the fibonacci series is %d\n", n, result);

return 0;

}



/* function for recursive fibonocci call */

int fib (int n)

{

if (n == 0)

{

return 0;

}

else if (n == 1)

{

return 1;

}

else

{

return (fib (n - 1) + fib (n - 2));

}

}

