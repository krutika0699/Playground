#include<iostream>
using namespace std;
int main()
{
  int n,current;
  int prev=0,stock=2;
  std::cin>>n;
  for(int i=0;i<n;i++)
  {
    std::cin>>current;
    if(i==0)
    {
      std::cout<<"1"<<endl;
    }else if(prev>current){
      std::cout<<"1"<<endl;
    }else
    {
      std::cout<<stock<<endl;
      stock=stock+2;
    }
    prev = current;
  }
}
