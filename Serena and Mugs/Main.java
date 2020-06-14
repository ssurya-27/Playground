#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  int c[b];
  int sum=0;
  for(int i=0;i<a;i++)
  {
    cin>>c[i];
  	sum=sum+c[i];
  }
  if(sum<=a)
  {
    cout<<"YES";
  }
  else
  {
    cout<<"NO";
  }
  
  
}