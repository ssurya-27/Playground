#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int g=0;
  for(int j=0;j<n;j++)
  {
    if(a[j]>g)
      g=a[j];
  }
  cout<<g;
}