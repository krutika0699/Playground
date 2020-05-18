#include<iostream>
using namespace std;
int main()
{

  int age;
  float time;
   cin>>age;
   cin>>time;

  if(age>13)
  {
    if(time>10.15)
      cout<<"$5.00";
    else
      cout<<"$8.00";
  }
  else
  {
    if(time>10.15)
    {
        cout<<"$2.00";
    }
    else
    {
       cout<<"$4.00";
    }


  }
  return 0;
}
