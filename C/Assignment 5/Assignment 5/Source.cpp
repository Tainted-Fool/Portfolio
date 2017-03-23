//Libraries
#include <iostream>
#include <iomanip>
#include <fstream>
#include <string>
using namespace std;

int main()
{
	//Variables
	ifstream in;
	ofstream out;
	string item = string();
	int amount = int();
	double price = double();
	double total = double();
	double grandTotal = double();
	char ch1 = 220;
	char ch2 = 196;



	//Header
	for (int i = 0; i < 80; i++)
	{
		cout << ch1;
	}
	cout << endl;
		
	cout << "\t\tInventory Report for Jane Doe International Hardware" << endl;
	for (int i = 0; i < 80; i++)
	{
		cout << ch1;
	}
	cout << endl;



	//Table
	cout << setfill(' ');
	cout << left << setw(10) << "ITEM" << left << setw(20) << "NUMBER OF UNITS"
		 << left << setw(20) << "UNIT COST ($)" << left << setw(20)
		 << "TOTAL VALUE ($)" << endl;
	for (int i = 0; i < 80; i++)
	{
		cout << ch2;
	}



	//Processing Text/Table In
	in.open("items.txt");
	while (!in.eof())
	{
		in >> item >> amount >> price;
		total = amount * price;
		cout << fixed << showpoint << setprecision(2);
		cout << left << setw(8) << item << right << setw(10) << amount
			 << right << setw(20) << price << right << setw(22) << total
			 << right << setw(0) << endl << endl;
		grandTotal = grandTotal + total;
	}



	//Bottom part of Table
	for (int i = 0; i < 80; i++)
	{
		cout << ch2;
	}
	cout << left << setw(20) << "Inventory Total ($)" << right
		 << setw(40) << grandTotal << endl;
	in.close();
	


	//==============================================================
	//Processing Text/Table Out
	out.open("itemsout.txt");
	for (int i = 0; i < 80; i++)
	{
		out << "*";
	}
	out << endl;

	out << "\t\tInventory Report for Jane Doe International Hardware" << endl;
	for (int i = 0; i < 80; i++)
	{
		out << "*";
	}
	out << endl;



	//Table
	out << setfill(' ');
	out << left << setw(10) << "ITEM" << left << setw(20) << "NUMBER OF UNITS"
		<< left << setw(20) << "UNIT COST ($)" << left << setw(20)
		<< "TOTAL VALUE ($)" << endl;
	for (int i = 0; i < 80; i++)
	{
		out << "_";
	}
	out << endl;


	//Processing Text/Table Out
	in.open("items.txt");		
	while (!in.eof())
	{
		in >> item >> amount >> price;
		total = amount * price;
		out << fixed << showpoint << setprecision(2);
		out << left << setw(8) << item << right << setw(10) << amount
			<< right << setw(20) << price << right << setw(22) << total
			<< right << setw(0) << endl << endl;
	}



	//Bottom part of Table
	for (int i = 0; i < 80; i++)
	{
		out << "_";
	}
	out << endl;
	out << left << setw(20) << "Inventory Total ($)" << right
		<< setw(40) << grandTotal << endl;






	return 0;
}