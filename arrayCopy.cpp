#include <iostream>
using namespace std;

int main() 
{
   int arr[5] = {1, 2, 3, 4, 5};
int copy[5];
for (int i = 0; i < 5; i++) {
    copy[i] = arr[i]; 
}
for (int i = 0;i<5;i++){
    std::cout << copy[i] << std::endl;
}
}

