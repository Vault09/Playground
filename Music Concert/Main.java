#include<iostream>
using namespace std;
int main(){
  // Type your code here
  int n, m=0, f=0;
  std::cin >> n;
  int arr[n];
  for(int i=0; i<n; i++)
    std::cin >> arr[i];
  for(int i=0; i<n; i++){
    if(arr[i]%2==0)
      m++;
    else
      f++;
  }
  std::cout << f <<"\n" << m;
  return 0;
}