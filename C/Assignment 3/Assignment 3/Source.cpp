
/*	Author's Name: Lazaro A Herrera
Date: June 24, 2014
Program: Assignment 3
College Name: Long Beach City College (LBCC)
*/


//Libraries
#include <iostream>
#include <string>
#include <iomanip>
#include <fstream>
using namespace std;

int main()
{
	//Variables
	string fullname = string();
	double gross = double();
	double federal = double();
	double state = double();
	double social = double();
	double medicare = double();
	double pension = double();
	double health = double();
	double net = double();
	ofstream out;

	//Header
	cout << "===========================================================" << endl;
	cout << "\tAuthor's Name: Lazaro A Herrera" << endl;
	cout << "\tDate: June 24, 2014" << endl;
	cout << "\tProgram: Assignment 3" << endl;
	cout << "\tCollege Name : Long Beach City College (LBCC)" << endl;
	cout << "===========================================================" << endl << endl;

	//Input
	cout << "===========================================================" << endl;
	cout << "Please enter Full Name: ";
	getline(cin, fullname);
	cout << "Please enter Gross Amount: ";
	cin >> gross;
	cout << "===========================================================" << endl << endl;


	//Processing
	federal = gross * .15;
	state = gross * .035;
	social = gross * .0575;
	medicare = gross * .0275;
	pension = gross * .05;
	health = 75;
	net = (gross - federal - state - social - medicare - pension - health);


	//Output
	cout << "===========================================================" << endl;
	cout << fixed << showpoint << setprecision(2);
	cout << fullname << endl;
	cout << setfill ('.') << left << setw(30) <<  "Gross Amount:"
		 << setfill (' ') << right << "$" << setw(8) << gross << endl;
	cout << setfill ('.') << left << setw(30) << "Federal Tax:"
		 << setfill (' ') << right << "$" << setw(8) << federal << endl;
	cout << setfill ('.') << left << setw(30) << "State Tax:"
		 << setfill (' ') << right << "$" << setw(8) << state << endl;
	cout << setfill ('.') << left << setw(30) << "Social Security Tax:"
		 << setfill (' ') << right << "$" << setw(8) << social << endl;
	cout << setfill ('.') << left << setw(30) << "Medicare/Medicaid Tax:"
		 << setfill (' ') << right << "$" << setw(8) << medicare << endl;
	cout << setfill ('.') << left << setw(30) << "Pension Plan:"
		 << setfill (' ') << right << "$" << setw(8) << pension << endl;
	cout << setfill ('.') << left << setw(30) << "Health Insurance:"
		 << setfill (' ') << right << "$" << setw(8) << health << endl;
	cout << setfill ('.') << left << setw(30) << "Net Pay:"
		 << setfill (' ') << right << "$" << setw(8) << net << endl;
	cout << "===========================================================" << endl << endl;


	//Output Text File
	out.open("Report.txt");
	out << "===========================================================" << endl;
	out << fixed << showpoint << setprecision(2);
	out << fullname << endl;
	out << setfill('.') << left << setw(30) << "Gross Amount:"
		<< setfill(' ') << right << "$" << setw(8) << gross << endl;
	out << setfill('.') << left << setw(30) << "Federal Tax:"
		<< setfill(' ') << right << "$" << setw(8) << federal << endl;
	out << setfill('.') << left << setw(30) << "State Tax:"
		<< setfill(' ') << right << "$" << setw(8) << state << endl;
	out << setfill('.') << left << setw(30) << "Social Security Tax:"
		<< setfill(' ') << right << "$" << setw(8) << social << endl;
	out << setfill('.') << left << setw(30) << "Medicare/Medicaid Tax:"
		<< setfill(' ') << right << "$" << setw(8) << medicare << endl;
	out << setfill('.') << left << setw(30) << "Pension Plan:"
		<< setfill(' ') << right << "$" << setw(8) << pension << endl;
	out << setfill('.') << left << setw(30) << "Health Insurance:"
		<< setfill(' ') << right << "$" << setw(8) << health << endl;
	out << setfill('.') << left << setw(30) << "Net Pay:"
		<< setfill(' ') << right << "$" << setw(8) << net << endl;
	out << "===========================================================" << endl;
	out.close();


	return 0;
}