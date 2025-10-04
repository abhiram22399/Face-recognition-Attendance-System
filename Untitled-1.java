import java.util.*;
class Main
{
public static void main(String[] args)
{
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=sc.nextInt();
        String arr[]={"mon","tue,","wed","thu","fri","sat","sun"};
        int i=0;
        for(i=0;i< arr.length;i++)
         if(arr[i].equals(str)) break;
         int res=1;
         int rem=6-i; 
         n=n-rem;
         if(n >0)
           res+=n/7;
        System.out.println(res);
      
}
}
TCS NQT Coding Question Day 1 Slot 2 – Question 2
Airport security officials have confiscated several item of the passengers at the security check point. All the items have been dumped into a huge box (array). Each item possesses a certain amount of risk[0,1,2]. Here, the risk severity of the items represent an array[] of N number of integer values. The task here is to sort the items based on their levels of risk in the array. The risk values range from 0 to 2.

Example :

Input :

7  -> Value of N

[1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new line.

Output :

0 0 0 1 1 2 2  -> Element after sorting based on risk severity 

Example 2:

input : 10  -> Value of N 

[2,1,0,2,1,0,0,1,2,0] -> Element of arr[0] to arr[N-1], while input each element is separated by a new line.

Output : 

0 0 0 0 1 1 1 2 2 2  ->Elements after sorting based on risk severity.

Explanation:

In the above example, the input is an array of size N consisting of only 0’s, 1’s and 2s. The output is a sorted array from 0 to 2 based on risk severity.

C	C++	Java	Python
Run
#include<stdio.h> 
void swap(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

void sortArray(int arr[], int size) {
    int low = 0, mid = 0, high = size - 1;
    while (mid <= high) {
        if (arr[mid] == 0) {
            swap(&arr[low], &arr[mid]);
            low++;
            mid++;
        } else if (arr[mid] == 1) {
            mid++;
        } else {
            swap(&arr[mid], &arr[high]);
            high--;
        }
    }
}

int main() {
    int n;
    scanf("%d", &n);
    int a[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }
    sortArray(a, n);
    for (int i = 0; i < n; i++) {
        printf("%d ", a[i]);
    }
    return 0;
}
TCS NQT Coding Question Day 2 Slot 1 – Question 1
Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.

Note : 1st element of the array should be considered in the count of the result.

For example,

Arr[]={7,4,8,2,9}

As 7 is the first element, it will consider in the result.

8 and 9 are also the elements that are greater than all of its previous elements.

Since total of  3 elements is present in the array that meets the condition.

Hence the output = 3.

 Example 1:

Input 

5 -> Value of N, represents size of Arr

7-> Value of Arr[0]

4 -> Value of Arr[1]

8-> Value of Arr[2]

2-> Value of Arr[3]

9-> Value of Arr[4]

Output :

3

Example 2:

5   -> Value of N, represents size of Arr

3  -> Value of Arr[0]

4 -> Value of Arr[1]

5 -> Value of Arr[2]

8 -> Value of Arr[3]

9 -> Value of Arr[4]

Output : 

5

Constraints

1<=N<=20

1<=Arr[i]<=10000

C	C++	java	Python
Run
#include<stdio.h> 
#include<limits.h> 

int main() {
    int n, c = 0, a, m = INT_MIN;
    scanf("%d", &n);
    while (n--) {
        scanf("%d", &a);
        if (a >= m) {
            m = a;
            c++;
        }
    }
    printf("%d", c);
    return 0;
}
 
TCS NQT Coding Question Day 2 Slot 1 – Question 2
A supermarket maintains a pricing format for all its products. A value N is printed on each product. When the scanner reads the value N on the item, the product of all the digits in the value N is the price of the item. The task here is to design the software such that given the code of any item N the product (multiplication) of all the digits of value should be computed(price).

Example 1:

Input :

5244 -> Value of N

Output :
160 -> Price 

Explanation:

From the input above 

Product of the digits 5,2,4,4

5*2*4*4= 160

Hence, output is 160.

C	C++	java	Python
Run
#include<stdio.h> 
#include<limits.h>

int main() {
    char s[100];
    scanf("%s", s);
    int p = 1;
    for (int i = 0; i < strlen(s); i++) {
        p *= (s[i] - '0');
    }
    printf("%d", p);
    return 0;
}
TCS NQT Coding Question Day 3 Slot 2 – Question 1
A furnishing company is manufacturing a new collection of curtains. The curtains are of two colors aqua(a) and black (b). The curtains color is represented as a string(str) consisting of a’s and b’s of length N. Then, they are packed (substring) into L number of curtains in each box. The box with the maximum number of ‘aqua’ (a) color curtains is labeled. The task here is to find the number of ‘aqua’ color curtains in the labeled box.

Note :

If ‘L’ is not a multiple of N, the remaining number of curtains should be considered as a substring too. In simple words, after dividing the curtains in sets of ‘L’, any curtains left will be another set(refer example 1)

Example 1:

Input :

bbbaaababa -> Value of str

3    -> Value of L

Output:

3   -> Maximum number of a’s

Explanation:

From the input given above.

Dividing the string into sets of 3 characters each 

Set 1: {b,b,b}

Set 2: {a,a,a}

Set 3: {b,a,b}

Set 4: {a} -> leftover characters also as taken as another set

Among all the sets, Set 2 has more number of a’s. The number of a’s in set 2 is 3.

Hence, the output is 3.

Example 2:

Input :

abbbaabbb -> Value of str

5   -> Value of L

Output:

2   -> Maximum number of a’s

Explanation:

From the input given above,

Dividing the string into sets of 5 characters each.

Set 1: {a,b,b,b,b}

Set 2: {a,a,b,b,b}

Among both the sets, set 2 has more number of a’s. The number of a’s in set 2 is 2.

Hence, the output is 2.

Constraints:

1<=L<=10

1<=N<=50

The input format for testing 

The candidate has to write the code to accept two inputs separated by a new line.

First input- Accept string that contains character a and b only

Second input- Accept value for N(Positive integer number)

The output  format for testing

The output should be a positive integer number of print the message(if any) given in the problem statement.(Check the output in Example 1, Example 2).

C	C++	Java	Python
Run

#include<stdio.h>
#include<string.h>

int main() {
    char str[100];
    scanf("%s", str);
    int n;
    scanf("%d", &n);
    int max = 0, count = 0;
    for (int i = 0; i < strlen(str); i++) {
      if (i % n == 0) {
        if (count > max)
                max = count;
            count = 0;
        }
        if (str[i] == 'a')
            count++;
    }
    if (count > max)
        max = count;
    printf("%d\n", max);
    return 0;
}
TCS NQT Coding Question Day 3 Slot 2 – Question 2
An international round table conference will be held in india. Presidents from all over the world representing their respective countries will be attending the conference. The task is to find the possible number of ways(P) to make the N members sit around the circular table such that.

The president and prime minister of India will always sit next to each other.

Example 1:

Input :

4   -> Value of N(No. of members)

Output : 

12  -> Possible ways of seating the members

Explanation:

2  members should always be next to each other. 

So, 2 members can be in 2!ways

Rest of the members can be arranged in (4-1)! ways.(1 is subtracted because the previously selected two members will be considered as single members now).

So total possible ways 4 members can be seated around the circular table 2*6= 12.

Hence, output is 12.

Example 2:

Input:

10  -> Value of N(No. of members)

Output :

725760 -> Possible ways of seating the members 

Explanation:

2 members should always be next to each other.

So, 2 members can be in 2! ways 

Rest of the members can be arranged in (10-1)! Ways. (1 is subtracted because the previously selected two members will be considered as a single member now).

So, total possible ways 10 members can be seated around a round table is 

2*362880 = 725760 ways.

Hence, output is 725760.

The input format for testing

The candidate has to write the code to accept one input 

First input – Accept value of number of N(Positive integer number)

The output format for testing 

The output should be a positive integer number or print the message(if any) given in the problem statement(Check the output in example 1, example2)

Constraints :

2<=N<=50

C	C++	Java	Python
Run
#include<stdio.h> 
int main() {
    int n;
    scanf("%d", &n);
    int fact[n + 1];
    fact[0] = 1;
    for (int i = 1; i <= n; i++) {
        fact[i] = fact[i - 1] * i;
    }
    printf("%d\n", fact[n - 1] * 2);
    return 0;
}
TCS NQT Coding Question Day 4 Slot 1 – Question 1
Problem Statement

An intelligence agency has received reports about some threats. The reports consist of numbers in a mysterious method. There is a number “N” and another number “R”. Those numbers are studied thoroughly and it is concluded that all digits of the number ‘N’ are summed up and this action is performed ‘R’ number of times. The resultant is also a single digit that is yet to be deciphered. The task here is to find the single-digit sum of the given number ‘N’ by repeating the action ‘R’ number of times.

If the value of ‘R’ is 0, print the output as ‘0’.

Example 1:

Input :

99 -> Value of N

3  -> Value of R

Output :

9  -> Possible ways to fill the cistern.

Explanation:

Here, the number N=99

Sum of the digits N: 9+9 = 18
Repeat step 2 ‘R’ times i.e. 3 tims  (9+9)+(9+9)+(9+9) = 18+18+18 =54
Add digits of 54 as we need a single digit 5+4
Hence , the output is 9.

Example 2:

Input :

1234   -> Value of N

2      -> Value of R

Output :

2  -> Possible ways to fill the cistern

Explanation:

Here, the number N=1234

Sum of the digits of N: 1+2+3+4 =10
Repeat step 2 ‘R’ times i.e. 2 times  (1+2+3+4)+(1+2+3+4)= 10+10=20
Add digits of 20 as we need a single digit. 2+0=2
Hence, the output is 2.

Constraints:

0<N<=1000

0<=R<=50

The Input format for testing 

The candidate has to write the code to accept 2 input(s)

First input- Accept value for N (positive integer number)

Second input: Accept value for R(Positive integer number)

The output format for testing 

The output should be a positive integer number or print the message (if any) given in the problem statement. (Check the output in Example 1, Example 2).

C	C++	Java	Python
Run

#include<stdio.h>
#include<string.h>
int main() {
    char s[100];
    scanf("%s", s);
    int n, sum = 0;
    scanf("%d", &n);
    for (int i = 0; i < strlen(s); i++) {
      sum += (s[i] - '0'); 
    } 
    sum *= n; 
    sprintf(s, "%d", sum);
    while (strlen(s) > 1) {
        sum = 0;
        for (int i = 0; i < strlen(s); i++) {
            sum += (s[i] - '0');
        }
        sprintf(s, "%d", sum);
    }
    printf("%s", s);
    return 0;
}
TCS NQT Coding Question Day 4 Slot 1 – Question 2
Problem Statement

Particulate matters are the biggest contributors to Delhi pollution. The main reason behind the increase in the concentration of PMs include vehicle emission by applying Odd Even concept for all types of vehicles. The vehicles with the odd last digit in the registration number will be allowed on roads on odd dates and those with even last digit will on even dates.

Given an integer array a[], contains the last digit of the registration number of N vehicles traveling on date D(a positive integer). The task is to calculate the total fine collected by the traffic police department from the vehicles violating the rules.

Note : For violating the rule, vehicles would be fined as X Rs.

Example 1:

Input :

4 -> Value of N

{5,2,3,7} -> a[], Elements a[0] to a[N-1], during input each element is separated by a new line

12 -> Value of D, i.e. date 

200 -> Value of x i.e. fine

Output :

600  -> total fine collected 

Explanation:

Date D=12 means , only an even number of vehicles are allowed. 

Find will be collected from 5,3 and 7 with an amount of 200 each.

Hence, the output = 600.

Example 2:

Input :

5   -> Value of N 

{2,5,1,6,8}  -> a[], elements a[0] to a[N-1], during input each element is separated by new line

3 -> Value of D i.e. date 

300 -> Value of X i.e. fine 

Output :

900  -> total fine collected 

Explanation:

Date D=3 means only odd number vehicles with are allowed.

Find will be collected from 2,6 and 8 with an amount of 300 each.

Hence, the output = 900 

Constraints:

0<N<=100
1<=a[i]<=9
1<=D <=30
100<=x<=5000 
The input format for testing 

The candidate has to write the code to accept 4 input(s).

First input – Accept for N(Positive integer) values (a[]), where each value is separated by a new line.

Third input – Accept value for D(Positive integer)

Fourth input – Accept value for X(Positive integer )

The output format for testing 

The output should be a positive integer number (Check the output in Example 1, Example e) if no fine is collected then print ”0”.

C	C++	Java	Python
Run
#include <stdio.h>
int main() {
    int n;
    scanf("%d", &n);
    int arr[n];
    for (int i = 0; i < n; i++)
        scanf("%d", &arr[i]);
    int d, x;
    scanf("%d %d", &d, &x);
    int countEven = 0, countOdd = 0;
    for (int i = 0; i < n; i++) {
        if (arr[i] % 2 == 0)
            countEven++;
        else
            countOdd++;
    }
    if (d % 2 != 0) {
        if (countEven == 0)
            printf("0\n");
        else
            printf("%d\n", countEven * x);
    } else {
        if (countOdd == 0)
            printf("0\n");
        else
            printf("%d\n", countOdd * x);
    }
    return 0;
}
Logged in as sabhiram069. Edit your profile. Log out? Required fields are marked *

Enter comment here...

sundareshwaran
import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int t=0;
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

int c=1;
int d=sc.nextInt();
int f=sc.nextInt();
for(int i=0;i<n;i++){
if(d%2==0){
if(arr[i]%2!=0){
t=f*c;
c++;
}
}
else{
if(arr[i]%2==0){
t=f*c;
c++;
}
}
}System.out.println(t);
}
}

Reply ↓

mallasatish681
n=int(input())
ar=list(map(int,input().split()))
date=int(input())
fine=int(input())
e,o=0,0
for i in range(n):
if ar[i]%2==0:
e=e+1
else:
o=o+1
if date%2==0:
if o==0:
print(“0”)
else:
print(o*fine)
else:
if e==0:
print(“0”)
else:
print(e*fine)

Reply ↓

patilmayur4102002
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println(“ENter how many people cross road”);
int n = sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++) {
arr[i]=sc.nextInt();
}
System.out.println("Enter date");
int date= sc .nextInt();
System.out.println("Enter fine amount");
int fine= sc.nextInt();
int totalfine=0;
for(int i=0;i<arr.length;i++) {
if((date%2==0 && arr[i]%2!=0) ||(date%2!=0 && arr[i]%2==0)) {
totalfine +=fine;
}
}
System.out.println(totalfine);
}

Reply ↓

chetansmankar360
TCS NQT Coding Question Day 4 Slot 1 – Question 2

import java.util.Scanner;

public class TotalFine {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

int arr[] = new int[n];
for(int i=0; i<arr.length; i++) {
arr[i] = sc.nextInt();
}

int d = sc.nextInt();
int f = sc.nextInt();
sc.close();

boolean isEvenDate = d%2 == 0;
int totalFine = 0;
for(int x:arr) {
if(x%2 != 0 && isEvenDate || x%2 == 0 && !isEvenDate) {
totalFine += f;
}
}

System.out.println(totalFine);
}
}

Reply ↓

dharaneesh27112003
def count_sundays(start_day, n):
# Mapping of days to their respective indices
day_map = {
‘sun’: 0,
‘mon’: 1,
‘tue’: 2,
‘wed’: 3,
‘thu’: 4,
‘fri’: 5,
‘sat’: 6
}
startindex=day_map[start_day]

first_sunday=7-startindex
if first_sunday>n:
return 0
else:
rem=n-first_sunday
return (1+(rem//7))

start_day = ‘sat’ # Starting day of the month
n_days = 30 # Number of days from the start of the month
result = count_sundays(start_day, n_days)
print(result)

Reply ↓

Yashsvi Chawhan
n = int(input())
reg_num = []
for _ in range(n):
reg_num.append(int(input()))
d = int(input())
s = int(input())

total = 0
for num in reg_num:
if (d % 2 == 0 and num % 2 != 0) or (d % 2 != 0 and num % 2 == 0):
total += s
if total != 0 :
print(total)
else:
print(“0”)

Reply ↓

Niraimathi
import java.util.*;

public class main {

public static void main(String[] args) {
Scanner s= new Scanner(System.in);
System.out.print(“enter the number of arrays: “);
int n= s.nextInt();
int []arr=new int[n];
for(int i=0;i<arr.length;i++){
arr[i]=s.nextInt();
} int x=300;
int d=3;
int count=0;
if(d%2!=0){

for(int j=0;j<arr.length;j++){
if(j%2==0){
count++;
}
}
}else{
for(int j=0;j<arr.length;j++){
if(j%2!=0){
count++;
}
}
}

System.out.print(count*x);
}
}

Reply ↓

Sanjay.S
TCS NQT Coding Question Day 4 Slot 1 – Question 2

Initial=list(map(int,input().split()))
Date=int(input(“Enter the date:”))
fine1=int(input(“Enter the Fine Amount:”))
fine=0
if Date%2==0:
for i in Initial:
if i==1:
fine+=0
elif i%2!=0 :
fine+=fine1
else:
for i in Initial:
if i==1:
fine+=0
elif i%2==0 :
fine+=fine1
print(“The Total Fine amount will be:”,fine)

Reply ↓

Chandu
Day 2 slot 1-Question 2
n=int(input(“Enter number”))
a=[]
for i in range(n):
a.append(int(input()))
d=int(input(“Enter date”))
fine=int(input(“Enter fine”))
count=0
if d%2==0:
temp=1
else:
temp=0
for i in a:
if temp==1:
if i%2!=0:
count+=fine
else:
if i%2==0:
count+=fine
print(count)

Reply ↓

PrepInsta Support
Kindly refer to our discord community for all your technical doubts.

Reply ↓

Tri
Day 4 slot 1 question 1
N = int(input())
R = int(input())
def sum_of_digits(num):
sum_of_digits = 0

for i in str(num):
sum_of_digits += int(i)
return sum_of_digits
num_sum = sum_of_digits(N)
result = num_sum * R
result_sum = sum_of_digits(result)
final_result = result_sum if R!=0 else 0
print(final_result)

Reply ↓
« Previous 1 2

PrepInsta.com
No.1 and most visited website for Placements in India.

We help students to prepare for placements with the best study material, online classes, Sectional Statistics for better focus and Success stories & tips by Toppers on PrepInsta.

Prepinsta Powered by Metis Eduventures Private Limited

© 2025 Prep Insta
Support
Prepinsta Prime
Prepinsta Prime Max
Contact Us
About Us
Refund Policy
Privacy Policy
Services 
Disclaimer
Terms and Conditions

Companies
Accenture
Cognizant
MindTree
VMware
CapGemini
Deloitte
WiproMicrosoft
TCS
Infosys
Oracle
HCL
TCS Ninja
IBM
All Exams Dashboards
CoCubes Dashboard
eLitmus Dashboard
HirePro Dashboard
MeritTrac Dashboard
Mettl Dashboard
DevSquare Dashboard

Get In Touch
Instagram
Linkedin
Youtube
Telegram
Facebook
Twitter

Get In Touch
 support@prepinsta.com
+91-8448440710
Text us on Whatsapp/Instagram

Partner Companies
Career247

Privacy Policy | Copyright © 2025 Prep Insta
 ×

30+ Companies are Hiring
Get Hiring Updates right in your inbox from PrepInsta

Enter your Mobile Number
 
Select your Passing out Year
Get Hiring Updates
import java.util.*;
class Main
{
public static void main(String[] args)
{
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=sc.nextInt();
        String arr[]={"mon","tue,","wed","thu","fri","sat","sun"};
        int i=0;
        for(i=0;i< arr.length;i++)
         if(arr[i].equals(str)) break;
         int res=1;
         int rem=6-i; 
         n=n-rem;
         if(n >0)
           res+=n/7;
        System.out.println(res);
      
}
}
TCS NQT Coding Question Day 1 Slot 2 – Question 2
Airport security officials have confiscated several item of the passengers at the security check point. All the items have been dumped into a huge box (array). Each item possesses a certain amount of risk[0,1,2]. Here, the risk severity of the items represent an array[] of N number of integer values. The task here is to sort the items based on their levels of risk in the array. The risk values range from 0 to 2.

Example :

Input :

7  -> Value of N

[1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new line.

Output :

0 0 0 1 1 2 2  -> Element after sorting based on risk severity 

Example 2:

input : 10  -> Value of N 

[2,1,0,2,1,0,0,1,2,0] -> Element of arr[0] to arr[N-1], while input each element is separated by a new line.

Output : 

0 0 0 0 1 1 1 2 2 2  ->Elements after sorting based on risk severity.

Explanation:

In the above example, the input is an array of size N consisting of only 0’s, 1’s and 2s. The output is a sorted array from 0 to 2 based on risk severity.

C	C++	Java	Python
Run
#include<stdio.h> 
void swap(int* a, int* b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}

void sortArray(int arr[], int size) {
    int low = 0, mid = 0, high = size - 1;
    while (mid <= high) {
        if (arr[mid] == 0) {
            swap(&arr[low], &arr[mid]);
            low++;
            mid++;
        } else if (arr[mid] == 1) {
            mid++;
        } else {
            swap(&arr[mid], &arr[high]);
            high--;
        }
    }
}

int main() {
    int n;
    scanf("%d", &n);
    int a[n];
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }
    sortArray(a, n);
    for (int i = 0; i < n; i++) {
        printf("%d ", a[i]);
    }
    return 0;
}
TCS NQT Coding Question Day 2 Slot 1 – Question 1
Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.

Note : 1st element of the array should be considered in the count of the result.

For example,

Arr[]={7,4,8,2,9}

As 7 is the first element, it will consider in the result.

8 and 9 are also the elements that are greater than all of its previous elements.

Since total of  3 elements is present in the array that meets the condition.

Hence the output = 3.

 Example 1:

Input 

5 -> Value of N, represents size of Arr

7-> Value of Arr[0]

4 -> Value of Arr[1]

8-> Value of Arr[2]

2-> Value of Arr[3]

9-> Value of Arr[4]

Output :

3

Example 2:

5   -> Value of N, represents size of Arr

3  -> Value of Arr[0]

4 -> Value of Arr[1]

5 -> Value of Arr[2]

8 -> Value of Arr[3]

9 -> Value of Arr[4]

Output : 

5

Constraints

1<=N<=20

1<=Arr[i]<=10000

C	C++	java	Python
Run
#include<stdio.h> 
#include<limits.h> 

int main() {
    int n, c = 0, a, m = INT_MIN;
    scanf("%d", &n);
    while (n--) {
        scanf("%d", &a);
        if (a >= m) {
            m = a;
            c++;
        }
    }
    printf("%d", c);
    return 0;
}
 
TCS NQT Coding Question Day 2 Slot 1 – Question 2
A supermarket maintains a pricing format for all its products. A value N is printed on each product. When the scanner reads the value N on the item, the product of all the digits in the value N is the price of the item. The task here is to design the software such that given the code of any item N the product (multiplication) of all the digits of value should be computed(price).

Example 1:

Input :

5244 -> Value of N

Output :
160 -> Price 

Explanation:

From the input above 

Product of the digits 5,2,4,4

5*2*4*4= 160

Hence, output is 160.

C	C++	java	Python
Run
#include<stdio.h> 
#include<limits.h>

int main() {
    char s[100];
    scanf("%s", s);
    int p = 1;
    for (int i = 0; i < strlen(s); i++) {
        p *= (s[i] - '0');
    }
    printf("%d", p);
    return 0;
}
TCS NQT Coding Question Day 3 Slot 2 – Question 1
A furnishing company is manufacturing a new collection of curtains. The curtains are of two colors aqua(a) and black (b). The curtains color is represented as a string(str) consisting of a’s and b’s of length N. Then, they are packed (substring) into L number of curtains in each box. The box with the maximum number of ‘aqua’ (a) color curtains is labeled. The task here is to find the number of ‘aqua’ color curtains in the labeled box.

Note :

If ‘L’ is not a multiple of N, the remaining number of curtains should be considered as a substring too. In simple words, after dividing the curtains in sets of ‘L’, any curtains left will be another set(refer example 1)

Example 1:

Input :

bbbaaababa -> Value of str

3    -> Value of L

Output:

3   -> Maximum number of a’s

Explanation:

From the input given above.

Dividing the string into sets of 3 characters each 

Set 1: {b,b,b}

Set 2: {a,a,a}

Set 3: {b,a,b}

Set 4: {a} -> leftover characters also as taken as another set

Among all the sets, Set 2 has more number of a’s. The number of a’s in set 2 is 3.

Hence, the output is 3.

Example 2:

Input :

abbbaabbb -> Value of str

5   -> Value of L

Output:

2   -> Maximum number of a’s

Explanation:

From the input given above,

Dividing the string into sets of 5 characters each.

Set 1: {a,b,b,b,b}

Set 2: {a,a,b,b,b}

Among both the sets, set 2 has more number of a’s. The number of a’s in set 2 is 2.

Hence, the output is 2.

Constraints:

1<=L<=10

1<=N<=50

The input format for testing 

The candidate has to write the code to accept two inputs separated by a new line.

First input- Accept string that contains character a and b only

Second input- Accept value for N(Positive integer number)

The output  format for testing

The output should be a positive integer number of print the message(if any) given in the problem statement.(Check the output in Example 1, Example 2).

C	C++	Java	Python
Run

#include<stdio.h>
#include<string.h>

int main() {
    char str[100];
    scanf("%s", str);
    int n;
    scanf("%d", &n);
    int max = 0, count = 0;
    for (int i = 0; i < strlen(str); i++) {
      if (i % n == 0) {
        if (count > max)
                max = count;
            count = 0;
        }
        if (str[i] == 'a')
            count++;
    }
    if (count > max)
        max = count;
    printf("%d\n", max);
    return 0;
}
TCS NQT Coding Question Day 3 Slot 2 – Question 2
An international round table conference will be held in india. Presidents from all over the world representing their respective countries will be attending the conference. The task is to find the possible number of ways(P) to make the N members sit around the circular table such that.

The president and prime minister of India will always sit next to each other.

Example 1:

Input :

4   -> Value of N(No. of members)

Output : 

12  -> Possible ways of seating the members

Explanation:

2  members should always be next to each other. 

So, 2 members can be in 2!ways

Rest of the members can be arranged in (4-1)! ways.(1 is subtracted because the previously selected two members will be considered as single members now).

So total possible ways 4 members can be seated around the circular table 2*6= 12.

Hence, output is 12.

Example 2:

Input:

10  -> Value of N(No. of members)

Output :

725760 -> Possible ways of seating the members 

Explanation:

2 members should always be next to each other.

So, 2 members can be in 2! ways 

Rest of the members can be arranged in (10-1)! Ways. (1 is subtracted because the previously selected two members will be considered as a single member now).

So, total possible ways 10 members can be seated around a round table is 

2*362880 = 725760 ways.

Hence, output is 725760.

The input format for testing

The candidate has to write the code to accept one input 

First input – Accept value of number of N(Positive integer number)

The output format for testing 

The output should be a positive integer number or print the message(if any) given in the problem statement(Check the output in example 1, example2)

Constraints :

2<=N<=50

C	C++	Java	Python
Run
#include<stdio.h> 
int main() {
    int n;
    scanf("%d", &n);
    int fact[n + 1];
    fact[0] = 1;
    for (int i = 1; i <= n; i++) {
        fact[i] = fact[i - 1] * i;
    }
    printf("%d\n", fact[n - 1] * 2);
    return 0;
}
TCS NQT Coding Question Day 4 Slot 1 – Question 1
Problem Statement

An intelligence agency has received reports about some threats. The reports consist of numbers in a mysterious method. There is a number “N” and another number “R”. Those numbers are studied thoroughly and it is concluded that all digits of the number ‘N’ are summed up and this action is performed ‘R’ number of times. The resultant is also a single digit that is yet to be deciphered. The task here is to find the single-digit sum of the given number ‘N’ by repeating the action ‘R’ number of times.

If the value of ‘R’ is 0, print the output as ‘0’.

Example 1:

Input :

99 -> Value of N

3  -> Value of R

Output :

9  -> Possible ways to fill the cistern.

Explanation:

Here, the number N=99

Sum of the digits N: 9+9 = 18
Repeat step 2 ‘R’ times i.e. 3 tims  (9+9)+(9+9)+(9+9) = 18+18+18 =54
Add digits of 54 as we need a single digit 5+4
Hence , the output is 9.

Example 2:

Input :

1234   -> Value of N

2      -> Value of R

Output :

2  -> Possible ways to fill the cistern

Explanation:

Here, the number N=1234

Sum of the digits of N: 1+2+3+4 =10
Repeat step 2 ‘R’ times i.e. 2 times  (1+2+3+4)+(1+2+3+4)= 10+10=20
Add digits of 20 as we need a single digit. 2+0=2
Hence, the output is 2.

Constraints:

0<N<=1000

0<=R<=50

The Input format for testing 

The candidate has to write the code to accept 2 input(s)

First input- Accept value for N (positive integer number)

Second input: Accept value for R(Positive integer number)

The output format for testing 

The output should be a positive integer number or print the message (if any) given in the problem statement. (Check the output in Example 1, Example 2).

C	C++	Java	Python
Run

#include<stdio.h>
#include<string.h>
int main() {
    char s[100];
    scanf("%s", s);
    int n, sum = 0;
    scanf("%d", &n);
    for (int i = 0; i < strlen(s); i++) {
      sum += (s[i] - '0'); 
    } 
    sum *= n; 
    sprintf(s, "%d", sum);
    while (strlen(s) > 1) {
        sum = 0;
        for (int i = 0; i < strlen(s); i++) {
            sum += (s[i] - '0');
        }
        sprintf(s, "%d", sum);
    }
    printf("%s", s);
    return 0;
}
TCS NQT Coding Question Day 4 Slot 1 – Question 2
Problem Statement

Particulate matters are the biggest contributors to Delhi pollution. The main reason behind the increase in the concentration of PMs include vehicle emission by applying Odd Even concept for all types of vehicles. The vehicles with the odd last digit in the registration number will be allowed on roads on odd dates and those with even last digit will on even dates.

Given an integer array a[], contains the last digit of the registration number of N vehicles traveling on date D(a positive integer). The task is to calculate the total fine collected by the traffic police department from the vehicles violating the rules.

Note : For violating the rule, vehicles would be fined as X Rs.

Example 1:

Input :

4 -> Value of N

{5,2,3,7} -> a[], Elements a[0] to a[N-1], during input each element is separated by a new line

12 -> Value of D, i.e. date 

200 -> Value of x i.e. fine

Output :

600  -> total fine collected 

Explanation:

Date D=12 means , only an even number of vehicles are allowed. 

Find will be collected from 5,3 and 7 with an amount of 200 each.

Hence, the output = 600.

Example 2:

Input :

5   -> Value of N 

{2,5,1,6,8}  -> a[], elements a[0] to a[N-1], during input each element is separated by new line

3 -> Value of D i.e. date 

300 -> Value of X i.e. fine 

Output :

900  -> total fine collected 

Explanation:

Date D=3 means only odd number vehicles with are allowed.

Find will be collected from 2,6 and 8 with an amount of 300 each.

Hence, the output = 900 

Constraints:

0<N<=100
1<=a[i]<=9
1<=D <=30
100<=x<=5000 
The input format for testing 

The candidate has to write the code to accept 4 input(s).

First input – Accept for N(Positive integer) values (a[]), where each value is separated by a new line.

Third input – Accept value for D(Positive integer)

Fourth input – Accept value for X(Positive integer )

The output format for testing 

The output should be a positive integer number (Check the output in Example 1, Example e) if no fine is collected then print ”0”.

C	C++	Java	Python
Run
#include <stdio.h>
int main() {
    int n;
    scanf("%d", &n);
    int arr[n];
    for (int i = 0; i < n; i++)
        scanf("%d", &arr[i]);
    int d, x;
    scanf("%d %d", &d, &x);
    int countEven = 0, countOdd = 0;
    for (int i = 0; i < n; i++) {
        if (arr[i] % 2 == 0)
            countEven++;
        else
            countOdd++;
    }
    if (d % 2 != 0) {
        if (countEven == 0)
            printf("0\n");
        else
            printf("%d\n", countEven * x);
    } else {
        if (countOdd == 0)
            printf("0\n");
        else
            printf("%d\n", countOdd * x);
    }
    return 0;
}
Logged in as sabhiram069. Edit your profile. Log out? Required fields are marked *

Enter comment here...

sundareshwaran
import java.util.*;
class Main{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int t=0;
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

int c=1;
int d=sc.nextInt();
int f=sc.nextInt();
for(int i=0;i<n;i++){
if(d%2==0){
if(arr[i]%2!=0){
t=f*c;
c++;
}
}
else{
if(arr[i]%2==0){
t=f*c;
c++;
}
}
}System.out.println(t);
}
}

Reply ↓

mallasatish681
n=int(input())
ar=list(map(int,input().split()))
date=int(input())
fine=int(input())
e,o=0,0
for i in range(n):
if ar[i]%2==0:
e=e+1
else:
o=o+1
if date%2==0:
if o==0:
print(“0”)
else:
print(o*fine)
else:
if e==0:
print(“0”)
else:
print(e*fine)

Reply ↓

patilmayur4102002
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println(“ENter how many people cross road”);
int n = sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++) {
arr[i]=sc.nextInt();
}
System.out.println("Enter date");
int date= sc .nextInt();
System.out.println("Enter fine amount");
int fine= sc.nextInt();
int totalfine=0;
for(int i=0;i<arr.length;i++) {
if((date%2==0 && arr[i]%2!=0) ||(date%2!=0 && arr[i]%2==0)) {
totalfine +=fine;
}
}
System.out.println(totalfine);
}

Reply ↓

chetansmankar360
TCS NQT Coding Question Day 4 Slot 1 – Question 2

import java.util.Scanner;

public class TotalFine {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

int arr[] = new int[n];
for(int i=0; i<arr.length; i++) {
arr[i] = sc.nextInt();
}

int d = sc.nextInt();
int f = sc.nextInt();
sc.close();

boolean isEvenDate = d%2 == 0;
int totalFine = 0;
for(int x:arr) {
if(x%2 != 0 && isEvenDate || x%2 == 0 && !isEvenDate) {
totalFine += f;
}
}

System.out.println(totalFine);
}
}

Reply ↓

dharaneesh27112003
def count_sundays(start_day, n):
# Mapping of days to their respective indices
day_map = {
‘sun’: 0,
‘mon’: 1,
‘tue’: 2,
‘wed’: 3,
‘thu’: 4,
‘fri’: 5,
‘sat’: 6
}
startindex=day_map[start_day]

first_sunday=7-startindex
if first_sunday>n:
return 0
else:
rem=n-first_sunday
return (1+(rem//7))

start_day = ‘sat’ # Starting day of the month
n_days = 30 # Number of days from the start of the month
result = count_sundays(start_day, n_days)
print(result)

Reply ↓

Yashsvi Chawhan
n = int(input())
reg_num = []
for _ in range(n):
reg_num.append(int(input()))
d = int(input())
s = int(input())

total = 0
for num in reg_num:
if (d % 2 == 0 and num % 2 != 0) or (d % 2 != 0 and num % 2 == 0):
total += s
if total != 0 :
print(total)
else:
print(“0”)

Reply ↓

Niraimathi
import java.util.*;

public class main {

public static void main(String[] args) {
Scanner s= new Scanner(System.in);
System.out.print(“enter the number of arrays: “);
int n= s.nextInt();
int []arr=new int[n];
for(int i=0;i<arr.length;i++){
arr[i]=s.nextInt();
} int x=300;
int d=3;
int count=0;
if(d%2!=0){

for(int j=0;j<arr.length;j++){
if(j%2==0){
count++;
}
}
}else{
for(int j=0;j<arr.length;j++){
if(j%2!=0){
count++;
}
}
}

System.out.print(count*x);
}
}

Reply ↓

Sanjay.S
TCS NQT Coding Question Day 4 Slot 1 – Question 2

Initial=list(map(int,input().split()))
Date=int(input(“Enter the date:”))
fine1=int(input(“Enter the Fine Amount:”))
fine=0
if Date%2==0:
for i in Initial:
if i==1:
fine+=0
elif i%2!=0 :
fine+=fine1
else:
for i in Initial:
if i==1:
fine+=0
elif i%2==0 :
fine+=fine1
print(“The Total Fine amount will be:”,fine)

Reply ↓

Chandu
Day 2 slot 1-Question 2
n=int(input(“Enter number”))
a=[]
for i in range(n):
a.append(int(input()))
d=int(input(“Enter date”))
fine=int(input(“Enter fine”))
count=0
if d%2==0:
temp=1
else:
temp=0
for i in a:
if temp==1:
if i%2!=0:
count+=fine
else:
if i%2==0:
count+=fine
print(count)

Reply ↓

PrepInsta Support
Kindly refer to our discord community for all your technical doubts.

Reply ↓

Tri
Day 4 slot 1 question 1
N = int(input())
R = int(input())
def sum_of_digits(num):
sum_of_digits = 0

for i in str(num):
sum_of_digits += int(i)
return sum_of_digits
num_sum = sum_of_digits(N)
result = num_sum * R
result_sum = sum_of_digits(result)
final_result = result_sum if R!=0 else 0
print(final_result)

Reply ↓
« Previous 1 2

PrepInsta.com
No.1 and most visited website for Placements in India.

We help students to prepare for placements with the best study material, online classes, Sectional Statistics for better focus and Success stories & tips by Toppers on PrepInsta.

Prepinsta Powered by Metis Eduventures Private Limited

© 2025 Prep Insta
Support
Prepinsta Prime
Prepinsta Prime Max
Contact Us
About Us
Refund Policy
Privacy Policy
Services 
Disclaimer
Terms and Conditions

Companies
Accenture
Cognizant
MindTree
VMware
CapGemini
Deloitte
WiproMicrosoft
TCS
Infosys
Oracle
HCL
TCS Ninja
IBM
All Exams Dashboards
CoCubes Dashboard
eLitmus Dashboard
HirePro Dashboard
MeritTrac Dashboard
Mettl Dashboard
DevSquare Dashboard

Get In Touch
Instagram
Linkedin
Youtube
Telegram
Facebook
Twitter

Get In Touch
 support@prepinsta.com
+91-8448440710
Text us on Whatsapp/Instagram

Partner Companies
Career247

Privacy Policy | Copyright © 2025 Prep Insta
 ×

30+ Companies are Hiring
Get Hiring Updates right in your inbox from PrepInsta

Enter your Mobile Number
 
Select your Passing out Year
Get Hiring Updates
