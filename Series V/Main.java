#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a;
  cin>>a;
  int sum=11;
  for(int i=0;i<a;i++)
  {
    cout<<sum*sum<<" ";
    sum=sum+4;
  }
  
}