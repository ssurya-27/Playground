#include<iostream>
using namespace std;
int main()
{
  string s1;
  cin>>s1;
  for(int i=0;i<s1.length();i++)
  {
    if((s1.at(i)>='A' && s1.at(i)<='Z') ||( s1.at(i)>='a' && s1.at(i)<='z'))
    {
      cout<<s1.at(i);
    }
  
  }
}