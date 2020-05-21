#include<iostream>
using namespace std;

int main()
{
  // Type your code here
  int num, find, flag=0;
  std::cin >> num;
  int reg[num];
  for(int i=0; i<num; i++)
    std::cin >> reg[i];
  std::cin >> find;
  
  for(int i=0; i<num; i++){
    if(reg[i]==find){
      flag=1;
      break;
    }
  }
  if(flag==1)
    cout <<"She passed her exam";
  else
    cout <<"She failed";
  
  return 0;
}