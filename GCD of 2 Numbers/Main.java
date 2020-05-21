#include<iostream>
using namespace std;
int gcd(int a, int b, int n){
  if(a%n==0 && b%n==0)
    return n;
  else{
    return gcd(a, b, n-1);
  }
  
}
int main()
{
  //Type your code here.
  int a, b, n;
  std:: cin >> a >> b;
  
  if(a<b)
    n = a;
  else
    n = b;
 
  cout <<"G.C.D of "<< a <<" and "<< b <<" = "<< gcd(a, b, n);
  return 0;
}