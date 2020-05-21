#include<iostream>
int main()
{
    // Type your code here
  int r, c;
  std::cin >> r >> c;
  int puz[r][c];
  for(int i=0; i<r; i++){
    for(int j=0; j<c; j++){
      std::cin >> puz[i][j];
    }
  }
  
  for(int j=0; j<c; j++){
    for(int i=0; i<r; i++){
      std::cout << puz[i][j] <<" ";
    }
    std::cout <<"\n";
  }
  return 0;
}