#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char s1[50], s2[50];
  std::cin >> s1;
  std::cin >> s2;
  if(strcmp(s1, s2)==0)
    std::cout <<"It is correct";
  else
    std::cout <<"It is wrong";
  
  return 0;
}