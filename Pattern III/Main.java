#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  int n=1;
  cout<<n<<"\n";
  int b=n+1;
  for(int i=1;i<a;i++)
  {
    for(int j=0;j<=i;j++)
    {
       if(j==0)
       {cout<<b;}
      else
        cout<<"*"<<b;
    }
    b++;
    cout<<"\n";
  }
  b--;
  for(int i=a;i>1;i--)
  {
    for(int j=0;j<i;j++)
    {
       if(j==0)
       {cout<<b;}
      else
        cout<<"*"<<b;
    }
    b--;
    cout<<"\n";
  }
  cout<<n;
  
}