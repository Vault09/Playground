#include<iostream>
using namespace std;
int array(int, int *);
int main()
{
  //Type your code here.
  int n;
  std::cout <<"Enter the number of elements in the array\n";
  std::cin >> n;
  int a[n];
  std::cout <<"Enter the elements in the array\n";
  for(int i=0; i<n; i++){
    std::cin >> a[i];
  }
  int x=array(n, a);
  if(x==0)
    std::cout <<"The array is Odd";
  else if(x==1)
    std::cout <<"The array is Even";
  else if(x==3)
    std::cout <<"The array is Mixed";
  
  return 0;
}
int array(int n, int *a){
  int even=0, odd=0;
  for(int i=0; i<n; i++){
    if(a[i]%2==0)
      even++;
    else
      odd++;
  }
  if(even>0 && odd==0)
    return 1;
  else if(even==0 && odd>0)
    return 0;
  else if(even>0 && odd>0)
    return 3;
}