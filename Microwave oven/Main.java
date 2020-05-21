#include<bits/stdc++.h>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int num;
  float time;
  std::cin >> num >> time;
  if(num == 2){
    time+=time/2;
    std::cout << std::fixed;
  	std::cout << std::setprecision(2);
  	cout << time;
  }
  else if(num == 3){
    time*=2;
    std::cout << std::fixed;
  	std::cout << std::setprecision(2);
  	cout << time;
  }
  else if(num>3)
    cout <<"Number of items is more";
 
return 0;
}