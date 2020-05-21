#include<iostream>
#include<cmath>
using namespace std;

long prime(long n){
  long lim = sqrt(n), x=0;
  
  for(int i=2; i<=ceil(lim)+1; i++){
    if(n%i==0)
      x = x+1;
    if(x>0){
      return 1;
      break;
    }
  }
  if(x=0)
    return 0;
}

int main(){
  long num;
  std::cin >> num;
  if(num<=1)
    cout <<"Not eligible";
  else if(prime(num)==1)
    cout << "Not eligible";
    
  else
    cout << "Eligible";
  return 0;
}