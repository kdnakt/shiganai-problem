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

string shiganai() {
  string sample[6] = {"し", "く", "て", "が", "な", "い"};
  shuffle(sample, 6);
  string test = "";
  for (int i = 0; i < 4; i++) {
    test += sample[i];
  }
  return test;
}

int main() {
  string res;
  for (int i = 0; i < 100; i++) {
    res = shiganai();
    if (res == "しがない") {
      cout << "第" << (i + 1) << "回SIerからWEB系のエンジニアに転職したが楽しくて仕方がないラジオ、略して「しがないラジオ」\n";
      return 0;
    }
  }
  cout << "「" << res << "ラジオ」ちゃうやん\n";
  return 0;
}
