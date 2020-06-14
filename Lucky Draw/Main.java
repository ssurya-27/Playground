#include<iostream>
using namespace std;
int main()
{
  int a;
  cin>>a;
  if(a>1)
  {
  for(int i=3;i<a;i++)
  {
    if(a%i==0)
    {
      cout<<"Not eligible";
      break;
    }
    else
    {
      cout<<"Eligible";
      break;
    }
  }
  }
  else
  {
    cout<<"Not eligible";
  }
 
}