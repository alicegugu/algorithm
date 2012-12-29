#include <fstream>
#include <vector>

int MaximumElement(vector<int>& pArray, int start, int end)
{
  int len = end - start;

  if(len==0)
    return pArray

  int middleElement = len/2;
  
    {
      return pArray[middleElement];
    }
  else
    {
      
    }
}

void main()
{
  std::ifstream in("input.txt");
  vector<int> array;
  
  int element;
  while( !in.eof() )
    {
      in >> element;
      array.push_back(element)
    }

  int max = MaximumElement(array);

}
