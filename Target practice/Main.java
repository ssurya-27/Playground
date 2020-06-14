#include<iostream>
using namespace std;
int main()
{
    int num, sum=0, count, n;
    cin>>num;
    //printf("Enter the scores taken by Patrick in each turn:\n");
    for(count=0;sum<num;count++)
    {
        cin>>n;
        sum=sum+n; 
    }
    cout<<"The number of turns is "<<count;
    return 0;

}