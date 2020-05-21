#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x, y, n;
  std::cin >> x >> y;
  if(x<y)
    n=x;
  else
    n=y;
  if(n%2==0)
    cout <<"Mani Iyer";
  else
    cout <<"Arun Gupta";
  
  return 0;
}