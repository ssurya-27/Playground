#include<iostream>
using namespace std;
int main()
{
  int a,m=0,n=1,o;
  cin>>a;
  for(int i=2;i<a;i++)
  {
    o=m+n;
    m=n;
    n=o;
    
  } 
  cout<<n;  
}