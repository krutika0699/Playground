#include<iostream>
using namespace std;
//#include<conio.h>
//#include<process.h>
int main()
{ 
  //clrscr(); 
char y,n,choice,name[100],deg[20]; 
int age,id;
 float sal; 
cout<<"Enter name:"<<endl; 
cin>>name; 
cout<<"Enter ID:"<<endl; 
cin>>id;
cout<<"Enter age:"<<endl; 
cin>>age; 
 cout<<"Enter designation:"<<endl; 
cin>>deg; 
 cout<<"Enter Salary:"<<endl; 
cin>>sal;
 cout<<"Employee Details\n"; 
cout<<"Name of the Employee : "<<name<<endl; 
 cout<<"ID of the Employee : "<<id<<endl;
cout<<"Age of the Employee : "<<age<<endl; 
 cout<<"Designation of the Employee : "<<deg<<endl;
 cout<<"Salary of the Employee : "<<sal<<endl;
}
//cout<<"Do you want to enter a new entry (y/n) ?"<<endl; 
/*cin>>choice; 
if(choice=='y') 
{ 
    goto A; 
    
} 
if(choice=='n') 
{ exit(0); 
    
}  
return 0;
    
}*/

