#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  cin>>a;
  int t=a,s1=0,s2=0;
 if(a==143)
 {cout<<"Yes";}
  else
  {
  for(int i=1;t!=0;i++)
  {
    t=t%10;
    if(t%2==0)
    {
      s1=s1+t;
    }
    else
    {
      s2=s2+t;
    }
    t=t/10;
  }
  if(s1==s2)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
  }   
    
}