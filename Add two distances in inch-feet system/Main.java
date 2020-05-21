#include<iostream>
using namespace std;
struct dist{
  int feet;
  float inch;
}d1, d2, d;
int main()
{
  //Type your code here.
  std::cin >> d1.feet >> d1.inch;
  std::cin >> d2.feet >> d2.inch;
  d.feet = d1.feet+d2.feet;
  if((d1.inch+d2.inch)>=12){
    d.feet+=1;
    d.inch = (d1.inch+d2.inch)-12;
  }
  else
    d.inch = d1.inch+d2.inch;
  
  std::cout << d.feet <<"\'-"<< d.inch <<"\"";  
}