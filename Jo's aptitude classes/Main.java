//#include <conio.h>
#include <iostream>
using namespace std;
int main()
{
int x,y,z,ans;
int d,i;
cin>>x;
cin>>y;
cin>>z;
cin>>ans;
d=1;
i=1;
while(i<=x&&i<=y&&i<=z){
if(x%i==0&&y%i==0&&x%i==0)
d=i;
i++;
}

if(d==ans)
{
  cout<<"Answer is correct.";
}
  else
  {
    cout<<"Answer is wrong.";
  }
//cout<<"GCD to -"<<x<<" "<<y<<" "<<z<<" is "<<d<<" ";

return 0;
}