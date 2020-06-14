#include<iostream>
using namespace std;
int gcd(int a, int b)
{	
  int small;
  if(a<b)
  {
    small=a;
  }
  else
  {
    small=b;
  }
  while(small!=0)
  {
    if(a%small==0 && b%small==0)
    {
      return small;
    }
    small--;
  }
}

int main()
{
  int a,b;
  cin>>a>>b;
  int c= gcd(a,b);
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<< c;
}