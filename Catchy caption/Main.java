#include <cstring>
#include<string>
#include <iostream>
using namespace std;
int main()
{
   //Your code goes here
  string cap;
  int p=0, i=0;
  std::getline(std::cin, cap);
  while(cap[i]!='\0'){
    if(cap[i]==' ')
      p++;
    i++;
  }
  if(p<10)
    cout <<"Caption eligible for the contest";
  else
    cout <<"Caption not eligible for the contest";
  return 0;
}