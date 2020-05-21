#include<iostream>
using namespace std;
int exp(int a, int b){
  int temp = a;
  for(int i=1; i<b; i++){
    a = a*temp;
  }
  return a;
}
int main(){
  int m, n, req;
  std::cin >> m >> n >> req;
  if(exp(m, n)>=req)
    cout <<"Doctor, you can proceed with your experiment.";
  else
    cout <<"Sorry Doctor! You need more bacteria.";
  return 0;
}