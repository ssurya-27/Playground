#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  string s1;
  getline(cin,s1);
  s1.replace(s1.find("the"),4,"");
  s1.replace(s1.find("the"),4,"");
  cout<<s1;
 	
}