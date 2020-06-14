#include<iostream>
using namespace std;
int main()
{
  string s1;
  getline(cin,s1);
  int v=0,c=0,w=0,d=0,s=0;
  for(int i=0;i<s1.length();i++)
  {
    if(s1.at(i)=='A' || s1.at(i)=='E' || s1.at(i)=='I' || s1.at(i)=='O' || s1.at(i)=='U' || s1.at(i)=='a' || s1.at(i)=='e' || s1.at(i)=='i' || s1.at(i)=='o' || s1.at(i)=='u')
    {
      v++;
    }
    else if(s1.at(i)==' ')
    {
      w++;
    }
    else if(s1.at(i)=='1' || s1.at(i)=='2' || s1.at(i)=='3' || s1.at(i)=='4' || s1.at(i)=='5' || s1.at(i)=='6' || s1.at(i)=='7' || s1.at(i)=='8' || s1.at(i)=='9' || s1.at(i)=='0')
    {
      d++;
    }
    else if(isalpha(s1.at(i)))
    {
      c++;
    }
    else
      s++;
  }
  cout<<"Vowels:"<< v<<endl;

cout<<"Consonants:"<<c<<endl;

cout<<"White Spaces:"<<w<<endl;

cout<<"Digits:"<<d<<endl;

cout<<"Symbols:"<<s<<endl;
  }