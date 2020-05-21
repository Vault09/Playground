#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, m;
  std::cin >> m >> n;
  int a[n][m];
  for(int i=0; i<m; i++){
    for(int j=0; j<n; j++){
      std::cin >> a[i][j];
    }
  }
  for(int i=0; i<m; i++){
    int sum=0;
    for(int j=0; j<n; j++){
      sum = sum+a[i][j];
    }
    std::cout << sum <<"\n";
  }
  return 0;
}