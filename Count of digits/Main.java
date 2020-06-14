#include<iostream>
using namespace std;
int main()
{
	int a,c=1;
  cin>>a;
  do
  {
    a=a/10;
    if(a!=0)
      c++;
  }while(a!=0);
  cout<<c;
}