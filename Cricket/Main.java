#include<iostream>

#include<iomanip>

using namespace std;

int main()

{

int tb,tr,r,b,rem;

float of,to,cr,trr;

cin>>tb>>tr>>r>>b;

to=tb/6;

rem=b%6;

of=(b/6)+(rem*0.1);

cr=r/of;

trr=tr/to;

cout<<to<<endl;

cout<<of<<endl;

cout<<fixed<<setprecision(1)<<cr<<endl;

cout<<trr<<endl;

if(cr>trr)

cout<<"Eligible to Win";

else 

cout<<"Not Eligible to Win";

return 0;

}



