#include <iostream>
#include <fstream>
#include <string>

class 3x3Matrix
{
  
}
int* Get3x3Matrix( )
{
  // Read 3x3 matrix
  int* matrix = new int(9);
  for (int i = 0; i < 9; ++i)
    {
      std::cin >> v[i];
      std::cout << v[i] << std::endl;
    }
  return matrix;
}

int** GetBoundary(int size)
{
  //Read boundary b
  int* b = new int(size*4);
    for (int j = 0; j < 4; ++j)
      {
        for (int i = 0; i < size; ++i)
          {
            std::cin >> b[i][j];
            std::cout << b[i][j] <<std::endl;
          }
      }
}

int main()
{
#ifndef ONLINE_JUDGE
    std::ifstream in("in.txt");
    std::streambuf *cinbuf = std::cin.rdbuf(); //save old buf
    std::cin.rdbuf(in.rdbuf()); //redirect std::cin to in.txt!

    std::ofstream out("out.txt");
    std::streambuf *coutbuf = std::cout.rdbuf(); //save old buf
    std::cout.rdbuf(out.rdbuf()); //redirect std::cout to out.txt!
#endif

    int testcase_num;
    std::cin >> testcase_num;

    for (int i = 0; i < testcase_num; ++i)
      {
        int n;
        std::cin >> n;

        int** v = Get3x3Matrix();
        int** g = Get3x3Matrix();
        int** boundary = GetBoundary(n+1);
   
        //Read f
        int* f = new int(size_n)
        
      }

     std::cout << "Test";
}
              
