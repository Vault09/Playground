#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num, even=0, odd= 0;
  std::cin >> num;
  int a[num];
  for(int i=0; i<num; i++)
    std::cin >> a[i];
  
  for(int i=0; i<num; i++){
    if(a[i]%2==0)
      even = even+a[i];
    else
      odd = odd+a[i];
  }
  std::cout <<"The sum of the even numbers in the array is "<< even;
  std::cout <<"\nThe sum of the odd numbers in the array is "<< odd;
  return 0;
}