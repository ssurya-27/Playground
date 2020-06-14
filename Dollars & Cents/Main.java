#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,rem,dollor;
  cin>>a>>b>>c>>d;
  int cent=b+d;
  if(cent>100)
  {
    rem=cent/100;
    cent=cent%100;
    dollor=a+c+rem;
    cout<<dollor<<"\n"<<cent;
  }
  else
  {
    dollor=a+c;
    cent=b+d;
    cout
      <<dollor<<"\n"<<cent;
  }

}