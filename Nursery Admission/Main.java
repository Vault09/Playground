#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char name[50];
  std::cin >> name;
  std::cout <<"The number of letters in the name is "<< strlen(name);
  return 0;
}