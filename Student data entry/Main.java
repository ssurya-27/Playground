#include <iostream>
#include<bits/stdc++.h>
using namespace std;
struct s
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
  struct s s1;
  cin.getline(s1.name,50); 
  cin>>s1.roll>>s1.marks;  
  cout<<"\n"<<"Student Details "<<"\n";
  cout<<"Name: "<<s1.name<<"\n"<<"Roll: "<<s1.roll<<"\n"<<"Marks: "<<s1.marks;
}