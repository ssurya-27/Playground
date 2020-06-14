a,b,c=int(input()),int(input()),int(input())
m=a*b-a
n=m-a+1
o=a+1
p=o+a-1
if((c>=o and c<=p) or (c>=n and c<=m)):
   {
     print("It is a mango tree")
   }
else:
   {
     print("It is not a mango tree")
   }