#include<iostream>
using namespace std;
int main()
{
    char str[150];
    int i, vowels, consonants, digits, spaces, symbols;
    //cout << "\nEnter the string : ";
    vowels = consonants = digits = spaces = symbols = 0;
    cin.getline(str, 153);
    for(i=0; str[i]!='\0'; ++i)
    {
        if(str[i]=='a' || str[i]=='e' || str[i]=='i' ||
           str[i]=='o' || str[i]=='u' || str[i]=='A' ||
           str[i]=='E' || str[i]=='I' || str[i]=='O' ||
           str[i]=='U')
        {
            ++vowels;
        }
        else if((str[i]>='a'&& str[i]<='z') || (str[i]>='A'&& str[i]<='Z'))
        {
            ++consonants;
        }
        else if(str[i]>='0' && str[i]<='9')
        {
            ++digits;
        }
        else if (str[i]==' ')
        {
            ++spaces;
        }
        else
        {
            ++symbols;
        }
    }
    cout << "Vowels:" << vowels << endl;
    cout << "Consonants:" << consonants << endl;
   cout << "White Spaces:" << spaces << endl;
    cout << "Digits:" << digits << endl;
    cout << "Symbols:" << symbols << endl;
    return 0;
}