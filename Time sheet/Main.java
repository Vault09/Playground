#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[7], salary=0, sum=0, count=0;
  for(int i=0; i<7; i++)
    std::cin >> a[i];
  
  for(int j=1; j<6; j++){
  	salary = salary + a[j];
  }
  int sat = a[6]*100;
  sat = sat+sat/4;
  int sun = a[0]*100;
  sun = sun+sun/2;
  salary = salary*100 + sat + sun;
  
  for(int k=1; k<6; k++)
    sum = sum+a[k];
  if(sat==0 && sun==0 && sum>40)
    salary = salary + (sum-40)*25;
  
  for(int k=0; k<7; k++){
    if(a[k]>8)
      count+=a[k]-8;
  }
  std::cout << salary+count*15;
  return 0;
}