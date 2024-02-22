#include <iostream>
using namespace std;

int main() {


// static array 
   int intArray[4] = {5,6,7,8};
   cout << "Array Elements: ";
   for (int j = 0; j < 4; j++) {
       cout << intArray[j];
       cout << " ";
   }
   
//    dynamic array 
   int* intArrayDynamic = new int[4];
   intArrayDynamic[0] = 5;
   intArrayDynamic[1] = 6;
   intArrayDynamic[2] = 7;
   intArrayDynamic[3] = 8;
   cout << "Array Elements: ";
   for (int j = 0; j < 4; j++) {
       cout << intArray[j];
       cout << " ";
   }
   delete[] intArray;
  
   return 0;
}
