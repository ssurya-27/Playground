#include<iostream>
using namespace std;
int sum(int a)
{
  if(a==0)
  {
    return 0;
  }
    do
    {
   a=(a%10)+sum(a/10);
    }while(a>9);
  return a;
}

int main()
{
  int a;
  cin>>a;
  cout<<sum(a);
}