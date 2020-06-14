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
  int m;
  cin>>m;
  for(int j=0;j<n;j++)
  {
    if(a[j]==m)
    {
      cout<<"She passed her exam";
      break;
    }
  	else if(j>=n-1)
    {
      cout<<"She failed";
    }
    
  }
 

    
}
