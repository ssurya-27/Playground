#include<iostream>
using namespace std;
int main()
{
  int n;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<endl;
  int e=0,o=0;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    if(a[i]%2==0)
    {
      e++;
    }
    else if(a[i]%2!=0)
    {
      o++;
    }
  }
  if(e==0 && o!=0)
  {
    cout<<"The array is Odd";
  }
  else if(e!=0 && o!=0)
  {
    cout<<"The array is Mixed";
  }
  else
  {
    cout<<"The array is Even";
  }
    
  

}