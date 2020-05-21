#include<iostream>
using namespace std;
int main(){
  int num, x=1, y=1;
  std::cin >> num;
  for(int i=1; i<=num; i++){
    if(i%2==0){
      x=x+i-1;
      y=x+1;
      for(int j=1; j<=i; j++){
     	cout << x;
        x--;
        if(j!=i)
          cout <<"*";
      }
    }
    if(i%2==1){
      x=y;
      for(int k=1; k<=i; k++){
        cout << x;
        x++;
        if(k!=i)
          cout <<"*";
       }
    }
    cout <<"\n";
  }
  return 0;
}