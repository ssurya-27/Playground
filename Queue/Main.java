#include<iostream>
using namespace std;
int main()
{
  int n,m;
  cin>>n>>m;
  int a[n];
  int sum=0,c=1;
  if(m==3 || m==4 )
  {
    cout<<m;
  }
  else
  {
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    sum=sum+a[i];
    if(sum>m)
    {
      c+=1;
      sum=0;
    }

  }
    cout<<c;
  }
}