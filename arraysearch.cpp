#include <iostream>
using namespace std;

int main() 
{
    int arr[5] = {1, 2, 3, 4, 5};
    int target = 3;
    bool found = false;
    for (int i = 0; i < 5; i++) {
    if (arr[i] == target) {
        cout << "Found at index " << i << endl;
        found = true;
        break;
    }
}
if (!found) {
    cout << "Element not found." << endl;
}
}
