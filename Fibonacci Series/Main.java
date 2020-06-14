
#include<iostream>
using namespace std;
int fibo(int a)
{
  
  int t1=0,t2=1,t3;
  while(a-2>0)
  {
  t3=t1+t2;
  t1=t2;
  t2=t3;
  a--;
  }
  return t2 ;
}
  
  
int main()
{
  int a; 
  cin>>a;
  cout<<"The term "<<a<<" in the fibonacci series is "<<fibo(a);
}
