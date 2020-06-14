#include<iostream>
using namespace std;
int main()
{
  int a[3];
  float sum=0;
  for(int i=0;i<3;i++)
  {
    cin>>a[i];
  }
  for(int j=0;j<3;j++)
  {
    int c;
    if(a[j]>=0)
    {
      c=a[j]%2;
    }
    else
    {
      c=-a[j]%2;
    }
    if(c!=0 && c>0)
    { 
      sum=sum+1.0;
    }
    else if(a[j]<0)
    {
      sum=sum-1.5;
    }
 
  }
  cout<<sum;
  
}