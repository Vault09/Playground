#include<iostream>
using namespace std;

int main()
{
  // Type your code here
  int size;
  std::cin >> size;
  int arr[size];
  for(int i=0; i<size; i++)
    std::cin >> arr[i];
  
  int max = arr[0];
  for(int i=1; i<size; i++){
    if(arr[i]>max)
      max = arr[i];
  }
  cout << max;
  return 0;
}