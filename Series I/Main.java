#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a;
  cin>>a;
  float sum=0.5;
  for(int i=0;i<a;i++)
  {
    cout<<sum<<" ";
    sum=sum*2+sum;
  }
  
}