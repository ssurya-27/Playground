#include <iostream>
using namespace std;
int main() 
{
  int a;
  cin>>a;
  int b=1;
  for(int i=0;i<a;i++)
  {
    if(b%2!=0)
    {
      for(int j=1;j<=a;j++)
    {
    if(j<a)
    {cout<<b;}
    else
    {cout<<b+1;}
    }
    }
    else if(b%2==0)
    {
      for(int j=1;j<=a;j++)
    {
    if(j==1)
    {cout<<b+1;}
    else
    {cout<<b;}
    }
    } 
    cout<<"\n";
    b++;
  }
    return 0;
}