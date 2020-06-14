#include <iostream>
using namespace std;
int main() 
{
  int a,rem;
  cin>>a;
  while(a!=0)
  {
    rem=a%10;
    cout<<rem;
    a=a/10;
  }
}