#include <iostream>
#include <iomanip>
int main()
{
  float balance;
  int withdraw;
  std::cin>>withdraw>>balance;
  if(withdraw%5 || balance < (withdraw+0.5f) )
    {
      std::cout<<std::setprecision(2) <<std::fixed<<balance<<std::endl;
    }
  else
    {
      std::cout<<std::setprecision (2)<<std::fixed<<(balance - (float)withdraw - 0.5f)<<std::endl;
    }
}
