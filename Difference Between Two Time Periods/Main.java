#include<iostream>
using namespace std;
struct t
{
  int hours;
  int minutes;
  int seconds;
};

int main()
{
   struct t t1, t2, difference;
    cin >> t1.hours >> t1.minutes >> t1.seconds;
    cin >> t2.hours >> t2.minutes >> t2.seconds;
  if(t2.seconds > t1.seconds)
    {
        --t1.minutes;
        t1.seconds += 60;
    }

    difference.seconds = t1.seconds - t2.seconds;
    if(t2.minutes > t1.minutes)
    {
        --t1.hours;
        t1.minutes += 60;
    }
    difference.minutes = t1.minutes-t2.minutes;
    difference.hours = t1.hours-t2.hours;
  cout<<difference.hours<<":"<<difference.minutes<<":"<<difference.seconds;
  
}