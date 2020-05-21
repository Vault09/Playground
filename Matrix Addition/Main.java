#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, m;
  std::cin >> n >> m;
  int a[n][m], b[n][m];
  for(int i=0; i<m; i++){
    for(int j=0; j<n; j++){
      std::cin >> a[i][j];
    }
  }
  for(int i=0; i<m; i++){
    for(int j=0; j<n; j++){
      std::cin >> b[i][j];
    }
  }
  for(int i=0; i<m; i++){
    for(int j=0; j<n; j++){
      std::cout << a[i][j]+b[i][j] <<" ";
    }
    std::cout <<"\n";
  }
  return 0;
}