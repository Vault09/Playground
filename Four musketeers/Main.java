#include<iostream>
using namespace std;
int main(){
float x[3], y[3], a, b;
for(int i=0; i<3; i++){
  cin >> x[i] >> y[i];
}
a=(x[0] + x[1] + x[2])/3;
b=(y[0] + y[1] + y[2])/3;
cout<<a<<"\n"<< b;
return 0;

}