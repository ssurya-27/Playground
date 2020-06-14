#include<iostream>
#include<math.h>



int count(int n)
{
  int c=0;
  for(int i=0;n!=0;i++)
  {
    n=n/10;
    c++;
  }
  return c;
}

int arm(int n)
{
  int m,o=n,sum=0;
  int z=count(n);
  for(int j=0;n!=0;j++)
  {
    m=n%10;
    sum=sum+pow(m,z);
    n=n/10;
  }
  if(sum==o)
  	return 1;
  else 
    return 0;
}

       
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}