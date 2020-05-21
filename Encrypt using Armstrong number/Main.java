#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
  //Your code goes here
  int digits = 0, a[7], i=0;
  int temp = n;
  while(n!=0){
    a[i] = n%10;
    n = n/10;
    digits++;
    i++;
  }
  int sum = 0;
  for(int j=0; j<digits; j++){
    sum = sum + power(a[j], digits);
  }
  
  if(sum==temp)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    return 0;
}