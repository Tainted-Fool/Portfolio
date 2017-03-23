/*	Author's Name: Lazaro A Herrera
	Date: June 18, 2014
	Program: Assignment1
	College Name: Long Beach City College (LBCC)
*/

#include <iostream>
using namespace std;

int main()
{
	int Employee_ID = 12345;
	double Hours_Worked = 40;
	double Rate_per_Hour = 20;
	double taxRate = .2;
	double Gross_Salary;
	double Net_Salary;

	cout << "\t\tAuthor's Name: Lazaro A Herrera" << endl;
	cout << "\t\tDate: June 18, 2014" << endl;
	cout << "\t\tProgram : Assignment1" << endl;
	cout << "\t\tCollege Name : Long Beach City College (LBCC)" << endl;
	cout << "=================" << endl;

	//Processing Begins Here...
	Gross_Salary = Hours_Worked * Rate_per_Hour;
	Net_Salary = Gross_Salary * taxRate;

	cout << "Employee ID:" << Employee_ID << endl;
	cout << "Hours Worked:" << Hours_Worked << endl;
	cout << "Rates per Hour:" << Rate_per_Hour << endl;
	cout << "Gross Salary = $" << Gross_Salary << endl;
	cout << "Net Salary = $" << Net_Salary << endl;
	cout << "=================" << endl;

	return 0;
}