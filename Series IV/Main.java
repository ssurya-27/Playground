#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a;
  cin>>a;
  int sum=1,s;
  for(int i=1;i<=a;i++)
  {
    s=sum*sum;
    if(s%2==0)
    {
      cout<<s-2<<" ";
    }
    else if(s%2!=0)
    {
      cout<<s-1<<" ";
    }
    sum=sum+1;
  }
      
}