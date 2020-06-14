#include <cstring>
#include <iostream>
using namespace std;
int main()
{
  char c[100];
  int a=0;
  cin.getline(c,100);
  for(int i=0;i<100;i++)
  {
    if(c[i]==' ')
    {
      a++;
    }
    else
      continue;
  }
  if(a>10)
    cout<<"Caption not eligible for the contest";
  else
    cout<<"Caption eligible for the contest";
    
}