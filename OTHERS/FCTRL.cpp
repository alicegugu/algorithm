#include <iostream>

int getzero(int N);

int main()
{
  int line;
  std::cin<<line;
  for(int i =0; i<line; ++i)
    {
      int N;
      cin>>N;
      cout<<getzero(N);
    }
  return 1;
}

int getTrailingZero(int N)
{
  int zeroNum=0;
  int residence = 0;
  residence=N%10;
  while(residece == 0 )
    {
      zeroNum++;
      residence=residence%10;
    }
  return zeroNum;
}

int getzero(int N)
{
  int zeroNum = 0;
  int result = 1;
  for(in i = N; i > 0; --i)
    {
      int resultZero = getTrailingZero(result);
      int trailingZeroNum = getTrailingZero(N);
      zerNum += trailingZeroNum;
      result = result*N;
    }
  return zeroNum;
}
