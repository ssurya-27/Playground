#include<iostream>
#include<bits/stdc++.h>
using namespace std;
struct college
{
  char name[100];
  char city[100];
  int year;
  float pass;
};

int main()
{
  cout<<"Enter the number of colleges"<<endl;
  int n;
  cin>>n;
  college s[n];
  for(int i=1;i<=n;i++)
  {
    cout<<"Enter the details of college "<<i<<endl;
    cout<<"Enter name"<<endl;
    cin>>s[i].name;
    cout<<"Enter city"<<endl;
   	cin>>s[i].city;
    cout<<"Enter year of establishment"<<endl;
    cin>>s[i].year;
    cout<<"Enter pass percentage"<<endl;
    cin>>s[i].pass;
  }
   cout<<"Details of colleges"<<endl;
 
  for(int i=1;i<=n;i++)
  {
   
    cout<<"College:"<<i<<endl;
    cout<<"Name:"<<s[i].name<<endl;
    cout<<"City:"<<s[i].city<<endl;
    cout<<"Year of establishment:"<<s[i].year<<endl;
    cout<<"Pass percentage:"<<s[i].pass<<endl;
  }
  
}