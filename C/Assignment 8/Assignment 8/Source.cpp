/*	Author's Name: Lazaro A Herrera
Date: July 15, 2014
Program: Assignment 8
College Name: Long Beach City College (LBCC)
*/

#include <iostream>
#include <iomanip>
#include <fstream>
#include <string>
using namespace std;

void readData(ifstream& in, string[], int[], double[]);

int main()
{
	string candidates[5] = { "" };
	int votes[5] = { 0 };
	double percentage[5] = { 0 };
	ifstream in;

	cout << setfill(' ');
	cout << left << setw(20) << "Candidate" << left
		 << setw(20) << "Votes Received" << left
		 << setw(20) << "% of Total Votes" << endl << endl;

	in.open("Votes.txt");

	if (!in)
	{
		cout << "Cannot open the input file" << endl;
		return 1;
	}

	readData(in, candidates, votes, percentage);



	return 0;
}

void readData(ifstream& in, string candidates[], int votes[], double percentage[])
{
	int i = 0;
	double total = double();
	double winnerValue = double();
	int winnerIndex = int();
	

	while (!in.eof())
	{
		in >> candidates[i] >> votes[i];
		total = total + votes[i];
		i++;
	}

	for (i = 0; i < 5; i++)
	{
		cout << fixed << setprecision(2);
		percentage[i] = (votes[i] / total) * 100;
		cout << left << setw(15) << candidates[i]
			 << right << setw(15) << votes[i]
			 << right << setw(20) << percentage[i] << endl;
		if (percentage[i] > winnerValue)
		{
			winnerValue = percentage[i];
			winnerIndex = i;
		}
	}

	cout << fixed << setprecision(0);
	cout << left << setw(15) << "Total"
		 << right << setw(15) << total << endl;
	
	cout << "\nThe Winner of the Election is " << candidates[winnerIndex] << endl;
	
}