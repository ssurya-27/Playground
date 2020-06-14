#include<iostream>
using namespace std;
int main()
{
  int m,n;
  cin>>m>>n;
  int a[m][n];
  for(int i=0;i<m;i++)
  {
   for(int j=0;j<n;j++)
     cin>>a[i][j];
  }
  int large=0;
  for(int j=0;j<n;j++)
  {
    
    for(int i=0;i<m;i++)
    {
      if(a[i][j]>large)
        large = a[i][j];
    }

  }
      cout<<"The maximum element is "<<large<<"\n";

}