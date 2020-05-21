#include<iostream>
using namespace std;
int expo(int, int);
int main()
{
  //Type your code here.
  int a, num;
  std::cout <<"Enter the value of a\n";
  std::cin >> a;
  std::cout <<"Enter the value of n\n";
  std::cin >> num;
  std::cout <<"The value of "<< a <<" power "<< num <<" is "<< expo(a, num);
}
int expo(int a, int n){
  if(n==1)
    return a;
  while(n!=0)
    return a*expo(a, n-1);
}