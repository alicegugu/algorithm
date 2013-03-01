/*
ID: Alice Gu
LANG: C++
PROG: ride
*/

#include <iostream>
#include <string>
#include <fstream>


using namespace std;


int main(int argc, char *argv[])
{
ofstream fout ("ride.out");
ifstream fin ("ride.in");

string comet;
string group;
fin>>comet>>group;



int comet_multi = 1;
for (int i = 0; i < comet.length(); ++i)
	{
int comet_i = (int)comet[i] - (int)'A';
comet_multi = comet_multi*comet_i % 47;
}

int group_multi = 1;
for (int i = 0; i < group.length(); ++i)
	{
int group_i = (int)group[i] - (int)'A';
group_multi = (group_multi*group_i) %47;
}

if( comet_multi == group_multi )
	fout << "GO";
else
	fout<< "STAY";
return 0;
}
