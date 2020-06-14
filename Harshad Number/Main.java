#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  int t=a;
  int sum,r;
  for(int i=0;t!=0;i++)
  {
    r=t%10;
    sum=sum+r;
    t=t/10;
  }
  if(a%sum==0)
  {
  	cout<<"Harshad Number";
  }
  else
  {
    cout<<"Not Harshad Number";
  }
}
