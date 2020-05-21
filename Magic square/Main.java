#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin >> n;
  int a[n][n];
  for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
      a[i][j] = 0;
      std::cin >> a[i][j];
    }
  }
  int x=0, y=0;
  for(int i=0; i<n; i++){
    x = x+a[i][i];
  }
  for(int i=0; i<n; i++){
    for(int j=0; j<n; j++){
      if(i+j == ((n+1)-2)){
        y += a[i][j];
      }
    }
  }
  if(x==y)
    std::cout <<"Yes";
  else
    std::cout <<"No";
  return 0;
}