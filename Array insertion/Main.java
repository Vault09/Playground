#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, loc, value;
  std::cout <<"Enter the number of elements in the array\n";
  std::cin >> n;
  int a[n];
  std::cout <<"Enter the elements in the array\n";
  for(int i=0; i<n; i++)
    std::cin >> a[i];
  std::cout <<"Enter the location where you wish to insert an element\n";
  std::cin >> loc;
  
  if(loc<=n){
    std::cout <<"Enter the value to insert\n";
  	std::cin >> value;
    std::cout <<"Array after insertion is\n";
    for(int i=0; i<n; i++){
      if(i==loc-1)
        std::cout << value <<"\n";
      std::cout << a[i] <<"\n";
    }
  }
  else
    std::cout <<"Invalid Input";
  return 0;
}