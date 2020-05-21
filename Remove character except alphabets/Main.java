#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  string s;
  std::getline(std::cin, s);
  for(int i=0; i<s.length(); i++){
    if((s[i]>='a' && s[i]<='z') || (s[i]>='A' && s[i]<='Z'))
      std::cout << s[i];
    else
      std::cout<<"\0";
  }
  return 0;
}