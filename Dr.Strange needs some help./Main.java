#include<iostream>
#include<math.h>
int fun(int,int,int);
using namespace std;
int main(){
  int m,n,req;
  cin>>m>>n>>req;
fun(m,n,req);
}

int fun(int x,int y,int z)
{
  int ans;
  ans=pow(x,y);
    if(ans>=z)
    {
    cout<<"Doctor, you can proceed with your experiment.";}
    else{
     cout<<"Sorry Doctor! You need more bacteria.";}
      
}