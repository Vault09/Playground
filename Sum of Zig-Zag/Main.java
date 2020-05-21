#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, m, sum=0;
  std::cin >> m >> n;
  int a[n][m];
  for(int i=0; i<m; i++){
    for(int j=0; j<n; j++){
      std::cin >> a[i][j];
    }
  }
  for(int i=0; i<m; i++){
    for(int j=0; j<n; j++){
      if(i+j == ((n+1)-2))
        sum += a[i][j];
    }
  }
  
  for(int i=0; i<n; i++){
    sum = sum+a[0][i];
  }
  for(int i=0; i<n; i++)
    sum = sum+a[m-1][i];
  sum = sum-a[0][n-1]-a[m-1][0];
  std::cout <<"Sum of Zig-Zag pattern is "<< sum;
  return 0;
}