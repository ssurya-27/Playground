#include<iostream>
using namespace std;
int main()
{
  int a,c=0;
  cin>>a;
  cout<<a<<"\n";
  for(int i=1;a!=1;i++)
  {
    if(a%2==0)
    {
      a=a/2;
      cout<<a<<"\n";
      c=c+1;
    }
    else
    {
      a=3*a+1;
      cout<<a<<"\n";
      c=c+1;
    }
  }
  cout<<c<<"\n";
}