#include <iostream>
#include <string>
#include <random>

using namespace std;

void shuffle(string array[], int size) {
  random_device rnd;
  for (int i = 0; i < size; i++) {
    int j = rnd() % size;
    string temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}

int main() {
  string sample[6] = {"し", "く", "て", "が", "な", "い"};
  shuffle(sample, 6);
  cout << sample[0] << sample[1] << sample[2] << sample[3] << "\n";
  return 0;
}
