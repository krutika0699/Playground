#include<iostream>
using namespace std;
struct Distance {
    int feet;
    float inch;
} d1, d2, sumOfDistances;

int main() {
    
    cin>>d1.feet;
    
    cin>>d1.inch;
   
    cin>>d2.feet;
    
    cin>>d2.inch;

    sumOfDistances.feet=d1.feet+d2.feet;
    sumOfDistances.inch=d1.inch+d2.inch;
   
    // If inch is greater than 12, changing it to feet.
    if (sumOfDistances.inch>12.0) {
        sumOfDistances.inch = sumOfDistances.inch-12.0;
        ++sumOfDistances.feet;
    }
    //printf("\nSum of distances = %d\'-%.1f\"", sumOfDistances.feet, sumOfDistances.inch);
  cout<<sumOfDistances.feet<<"\'-"<<sumOfDistances.inch<<"\"";
    return 0;
}