#include<iostream>
using namespace std;
int fibo(int);
int main()
{
  //Type your code here.
  int num;
  std::cin >> num;
  num = num-1;
  cout <<"The term "<< num+1<<" in the fibonacci series is "<<fibo(num);
  return 0;
}
int fibo(int num){
  if(num==0)
    return 0;
  else if(num==1)
    return 1;
  else if(num!=0 && num!=1)
  	return fibo(num-1)+fibo(num-2);
}