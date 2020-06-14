#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  int b[a],e=0,o=0;
  for(int i=0;i<a;i++)
  {
    cin>>b[i];
    if(b[i]%2==0)
      e=e+b[i];
    else
      o=o+b[i];
  }
  cout<<"The sum of the even numbers in the array is "<<e<<"\n"<<"The sum of the odd numbers in the array is "<<o;
}