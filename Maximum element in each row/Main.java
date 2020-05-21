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
    int max = a[i][0];
    for(int j=1; j<n; j++){
      if(a[i][j]>max)
        max = a[i][j];
    }
    std::cout << max <<"\n";
  }
  return 0;
}