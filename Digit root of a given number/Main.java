#include<bits/stdc++.h>
using namespace std;
int sum_digits(int n) {
   if (n == 0)
      return 0;
   else if (n%9 == 0)
      return 9;
   else
      return (n%9);
}
int main() {
   int x;
   std::cin >> x;
   cout<<sum_digits(x)<<endl;
   return 0;
}