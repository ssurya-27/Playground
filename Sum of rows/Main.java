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
  
  for(int j=0;j<m;j++)
  {
    int large=0;
    for(int i=0;i<n;i++)
    {
        large += a[j][i];
    }
    cout<<large<<"\n";
  }
  

}