#include <cmath>
#include <iostream>

using namespace std;

int main() {
   int num, originalNum, remainder, n = 0, result = 0, power;
  // printf("Enter an integer: ");
   cin>>num;

   originalNum = num;

   while (originalNum != 0) {
      originalNum /= 10;
      ++n;
   }
   originalNum = num;

   while (originalNum != 0) {
      remainder = originalNum % 10;

      // pow() returns a double value
      // round() returns the equivalent int
      power = round(pow(remainder, n));
      result += power;
      originalNum /= 10;
   }

   if (result == num)
      cout<<"Kindly proceed with encrypting";
   else
      cout<<"It is not an Armstrong number";
   return 0;
}


