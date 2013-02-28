//in STL map:
/* template < class Key, class T, class Compare = less<Key>,
           class Allocator = allocator<pair<const Key,T> > > class map;
*/

//direct addressing hashtable
class LinkedList;
template<class Key, class T> HashTable
{
 private:
  typedef LinkedList<T> list;
  vector<list> m_table;
 public:
  bool insert(T);
  int  search(T) ;
  bool delete(T);
 
};


