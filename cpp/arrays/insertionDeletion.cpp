#include <iostream>
#include <conio.h>
using namespace std; 

int main()
{
    int n=5; 
    cout << "Enter the length of the array:"; 
    cin >> n; 
    int arr[5];
    int key, i, index = -1;
    cout << "Enter element to delete\n";
    cin >> key; 
  
   for(i = 0; i < 5; i++)
   {
       if(arr[i] == key)
       {
           index = i;
           break;
 }
   }
   if(index != -1)
   {
       //shift all the element from index+1 by one position to the left
       for(i = index; i < n - 1; i++)
           arr[i] = arr[i+1];
       cout << ("New Array : ");
       for(i = 0; i < n - 1; i++)
           printf("%d ",arr[i]);
   }
   else
       cout << ("Element Not Found\n");
   return 0;
  
 }