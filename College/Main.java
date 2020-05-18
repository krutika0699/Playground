#include<iostream>
using namespace std;

int main()
{
struct College
{

char name[100];

char city[100];

int establishmentYear;

float passPercentage;

};

int n,i,j;

cout<<"Enter the number of colleges \n";

cin>>n;

struct College stud[n];

j=1;

for(i=0;i<n;i++)
{
cout<<"Enter the details of college "<<j;

cout<<"\nEnter name \n";

cin>>stud[i].name;

cout<<"Enter city \n";

cin>>stud[i].city;

cout<<"Enter year of establishment \n";

cin>>stud[i].establishmentYear;

cout<<"Enter pass percentage \n";

cin>>stud[i].passPercentage;
j++;
}

j=1;

cout<<"Details of colleges \n";

for(i=0;i<n;i++)
{
cout<<"College:"<<j<<"\n";

cout<<"Name:"<<stud[i].name;

cout<<"\nCity:"<<stud[i].city;

cout<<"\nYear of establishment:"<<stud[i].establishmentYear;

cout<<"\nPass percentage:"<<stud[i].passPercentage<<"\n";

j++;

}

return 0;

}
