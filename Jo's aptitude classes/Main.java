#include<iostream>
using namespace std;
int main(){
  int a, b, c, ans;
  std::cin >> a >> b >> c >> ans;
  if(a%ans==0 && b%ans==0 && c%ans==0)
    cout <<"Answer is correct.";
  else
    cout <<"Answer is wrong.";
  return 0;
}