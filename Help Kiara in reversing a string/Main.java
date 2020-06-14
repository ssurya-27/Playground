// A quickly written program for reversing a string 
// using reverse() 
#include<iostream>
#include <bits/stdc++.h> 
using namespace std; 
int main() 
{ 
	string str; 
	getline(cin,str);
	// Reverse str[beign..end] 
	reverse(str.begin(), str.end()); 

	cout << str; 
	return 0; 
} 
