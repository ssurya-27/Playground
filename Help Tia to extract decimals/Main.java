#include<iostream>
#include<string>
using namespace std;
int main()
{
    string n;
cin>>n;int i;
  int f=0;
  cout<<"Floating part is : ";
  for(i=0;i<n.length();i++)
  {
    if(f==1)
      cout<<n.at(i);
    else if(n.at(i)=='.')
      f=1;
  }
}
