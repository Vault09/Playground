#include<iostream>
#include<string.h>
#include<cstring>
using namespace std;

int main()
{
  //Type your code here.
  string S, revS;
  std::getline(std::cin, S);
  std::getline(std::cin, revS);
  int n = S.length();
  for (int i = 0; i < n / 2; i++) 
        swap(S[i], S[n - i - 1]); 
  if(S==revS)
    std::cout <<"It is correct";
  else
    std::cout <<"It is wrong";
  
  return 0;
}