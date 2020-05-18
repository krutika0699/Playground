#include<iostream>

using namespace std;

int main()

{

 int rows, cols, m1[10][10], m2[10][10], sum[10][10];

 //cout<<"Enter the number of rows(should be >1 and <10): ";

 cin>>rows;

 //cout<<"Enter the number of columns(should be >1 and <10): ";

 cin>>cols;

// cout << "Enter the elements of first matrix: ";

 for (int i = 0;i<rows;i++ ) {

 for (int j = 0;j < cols;j++ ) {

 cin>>m1[i][j];

 }

 }

 //cout << "Enter the elements of first matrix: ";

 for (int i = 0;i<rows;i++ ) {

 for (int j = 0;j<cols;j++ ) {

 cin>>m2[i][j];

 }

 }

 //cout<<"Output: ";

 for (int i = 0;i<rows;i++ ) {

for (int j = 0;j<cols;j++ ) {

sum[i][j]=m1[i][j]+m2[i][j];

cout<<sum[i][j]<<" ";
}
cout<<"\n";
 }

 return 0;

}

