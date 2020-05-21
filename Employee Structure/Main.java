#include<iostream>
#include<iomanip>
using namespace std;
struct employee{
  char name[30];
  int id, age;
  char dest[30];
  int salary;
}emp;
int main()
{
  //Type your code here.
  cout <<"Enter name:\n";
  cin >> emp.name;
  cout <<"Enter ID:\n";
  cin >>emp.id;
  cout <<"Enter age:\n";
  cin >> emp.age;
  cout <<"Enter designation:\n";
  cin >> emp.dest;
  cout <<"Enter Salary:\n";
  cin >> emp.salary;
  cout <<"Employee Details\n";
  cout <<"Name of the Employee : "<< emp.name<<"\n";
  cout <<"ID of the Employee : "<< emp.id<<"\n";
  cout <<"Age of the Employee : "<< emp.age<<"\n";
  cout <<"Designation of the Employee : "<< emp.dest<<"\n";
  cout <<"Salary of the Employee : "<< emp.salary;
  return 0;
}