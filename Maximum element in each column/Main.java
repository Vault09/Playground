#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, m;
  std::cin >> n >> m;
  int a[n][m];
  for(int i=0; i<n; i++){
    for(int j=0; j<m; j++){
      std::cin >> a[i][j];
    }
  }
  for(int j=0; j<m; j++){
    int max = a[0][j];
    for(int i=1; i<n; i++){
      if(a[i][j]>max)
        max = a[i][j];
    }
    std::cout << max <<"\n";
  }
}