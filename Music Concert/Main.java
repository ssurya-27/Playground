#include<iostream> 
#include<cstdlib>
using namespace std;
int main() 
{ 
  int n;
  cin>>n;
  int m=0,f=0;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    if(a[i]%2==0)
      f++;
    else
      m++;
  }
  cout<<m<<"\n"<<f;
  
} 