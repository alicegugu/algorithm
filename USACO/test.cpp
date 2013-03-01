/*
ID: alicegugu
LANG: C++
TASK: test
*/
#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main() {
    ofstream fout ("test.out");
    ifstream fin ("test.in");
    int a, b;/*
               ID: alicegugu
               LANG: C++
               TASK: test
             */

    fin >> a >> b;
    fout << a+b << endl;
    return 0;
}

