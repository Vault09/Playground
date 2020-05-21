#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int num, x=2, y=2;
  std::cin >> num;
  if(num==1)
    cout <<"0";
  else if(num==2)
    cout <<"0 2";
  else{
    cout << "0 2 ";
    for(int i=2; i<num; i++){
      if(i%2==0)
        x=x+4;
      y=y+x;
      cout << y <<" ";
    }
  }
  return 0;
}