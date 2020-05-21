#include<iostream>
using namespace std;
int main()
{
    // Type your code here
  int r, c;
  std::cin >> r >> c;
  int mat1[r][c], mat2[r][c], res[r][c];
  for(int i=0; i<r; i++){
    for(int j=0; j<c; j++){
      std::cin >> mat1[i][j];
    }
  }
  for(int i=0; i<r; i++){
    for(int j=0; j<c; j++){
      std::cin >> mat2[i][j];
    }
  }
  for(int i=0; i<r; i++){
    for(int j=0; j<c; j++){
      res[i][j] = mat1[i][j]+mat2[i][j];
    }
  }
  for(int i=0; i<r; i++){
    for(int j=0; j<c; j++){
      std::cout << res[i][j] <<" ";
    }
    std::cout <<"\n";
  }
  return 0;
}