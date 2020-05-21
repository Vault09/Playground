#include<iostream>
using namespace std;
struct complex{
  float real, img;
}c1, c2, c3;
  
int main(){
  int n;
  cin >> n;
  cin >> c1.real >> c1.img;
  cin >> c2.real >> c2.img;
  switch(n){
    case 1:
      c3.real = c1.real+c2.real;
      c3.img = c1.img+c2.img;
      if(c3.img<0)
      	cout<< c3.real << c3.img <<"i";
      else
        cout<< c3.real <<"+"<< c3.img <<"i";
      break;
    case 2:
      c3.real = c1.real-c2.real;
      c3.img = c1.img-c2.img;
      if(c3.img<0)
      	cout<< c3.real << c3.img <<"i";
      else
        cout<< c3.real <<"+"<< c3.img <<"i";
      break;
    case 3:
      c3.real = (c1.real*c2.real)-(c1.img*c2.img);
      c3.img = (c1.real*c2.img)+(c2.real*c1.img);
      if(c3.img<0)
      	cout<< c3.real << c3.img <<"i";
      else
        cout<< c3.real <<"+"<< c3.img <<"i";
      break;
    default:
      cout <<"Invalid choice";
      break;
  }
  
  return 0;
}