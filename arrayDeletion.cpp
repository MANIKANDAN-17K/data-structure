#include <iostream>
using namespace std;

int main() 
{
    int arr[5] = {1, 2, 3, 4, 5};
    for (int i = 2; i < 4; i++) {
    arr[i] = arr[i + 1];  // Shift elements to the left
}
arr[4] = 0; // Optional: Reset the last element
  for (int i = 0 ;i<4;i++){
    std::cout << arr[i] << std::endl;
  }

}
