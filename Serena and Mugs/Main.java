#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, s, x=1, sum=0;
  std::cin >> n >> s;
  int a[n];
  for(int i=0; i<n; i++)
    std::cin >> a[i];
  
  for(int i=0; i<n; i++){
    sum = sum+a[i];
  }
  if(sum>s)
    cout <<"NO";
  else
    cout <<"YES";
  return 0;
}