#include<iostream>
using namespace std;
int main()

{
    int n;
    cin>>n;
  	for(int i=0;i<=3;i++)
    {
      for(int j=0;j<i+1;j++)
      {
        cout<<n;
      }
      cout<<"\n";
      n++;
    }
  n--;
   for(int i=0;i<=3;i++)
  {
    for(int j=3;j>=i;j--)
    {
      cout<<n;
    }
    cout<<"\n";
    n--;
  }
      
    
}
