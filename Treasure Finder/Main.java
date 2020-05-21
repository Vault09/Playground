#include <algorithm> 
#include <iostream> 
using namespace std;   
int main() 
{  
    int a[3], x;
    for (int i = 0; i < 3; i++)
      cin >> a[i];
    sort(a, a + 3);  
    cout <<"The treasure is in box which has number "<< a[1] << "\n";
  
  	for(int i=a[0]; i>0; i--){
      if((a[0]%i==0)&&(a[1]%i==0)&&(a[2]%i==0)){
        x = i;
        break;
      }
    }
  	cout <<"The code to open the box is "<<x;
    return 0; 
}