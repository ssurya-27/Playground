#include<iostream>
#include<math.h>
using namespace std;
int small(int a, int b, int c)
{
  if(a<b && a<c)
    return a;
  else if(b<a && b<c)
    return b;
  else if(c<a && c<b)
    return c;
}

int gcd(int a, int b, int c)
{
  int d=small(a,b,c);
  for(int i=d;a%i==0 && b%i==0 && c%i==0;i--)
  {
    return i;
  }
}

int main()
{
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  int x=gcd(a,b,c);
  if(x==d)
  	cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}

    
    