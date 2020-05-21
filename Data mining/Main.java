#include<iostream>
using namespace std;  
int main()
{
  //Type your code here.
  int num, sum1=0, sum2=0, d=0;
  std::cin >> num;
  while(num!=0){
    d = num%10;
    if(d%2==0)
      sum1 = sum1+d;
    else if(d%2==1)
      sum2 = sum2+d;
    num = num/10;
  }
  if(sum1==sum2)
    cout <<"Yes";
  else
    cout <<"No";
  return 0;
}