#include<iostream>
#include<math.h>
using namespace std;
void fun(int , int , int);
int main()
{
  int m,n,r;
  cin>>m>>n>>r;
  fun(m,n,r);
  return 0;
}

void fun(int a, int b, int c)
{
  int z=pow(a,b);
  if(c>z)
    cout<<"Sorry Doctor! You need more bacteria.";
  else
    cout<<"Doctor, you can proceed with your experiment.";
}
  