#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a;
  cin>>a;
  int sum=6,s=5;
  for(int i=0;i<a;i++)
  {
    cout<<sum<<" ";
    sum=sum+s;
    s=s+5;
  }
  
}