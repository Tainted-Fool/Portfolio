
/*	Author's Name: Lazaro A Herrera
Date: June 23, 2014
Program: Assignment 3
College Name: Long Beach City College (LBCC)
*/


//Libraries
#include <iostream>
#include <string>
#include <iomanip>
using namespace std;

int main()
{
	//Variables
	int id = int ();
	string fname = string ();
	string lname = string ();
	char grade = char ();
	double average = double ();
	double total = double ();
	double CS11 = double ();
	double CS12 = double ();
	double CS21 = double ();

	//Heading
	cout << "======================================" << endl;
	cout << "Student Grading System (SGS)" << endl;
	cout << "Long Beach City College" << endl;
	cout << "Author: Lazaro A Herrera" << endl;
	cout << "Date: June 23, 2014" << endl;
	cout << "======================================\n" << endl;

	//User input
	cout << "======================================" << endl;
	cout << "Please enter ID: ";
	cin >> id;
	cout << "Please enter First Name: ";
	cin >> fname;
	cout << "Please enter Last Name: ";
	cin >> lname;
	cout << "Please enter points for CS11: ";
	cin >> CS11;
	cout << "Please enter points for CS12: ";
	cin >> CS12;
	cout << "Please enter points for CS21: ";
	cin >> CS21;
	cout << "======================================\n" << endl;
		
	//Processing
	total = CS11 + CS12 + CS21;
	average = (CS11 + CS12 + CS21) / 3;
	if (average >= 90)
	{
		grade = 'A';
	}
	else if (average >= 80)
	{
		grade = 'B';
	}
	else if (average >= 70)
	{
		grade = 'C';
	}
	else if (average >= 60)
	{
		grade = 'D';
	}
	else if (average < 60)
	{
		grade = 'F';
	}

	//Output
	cout << fixed << setprecision(2);
	cout << "======================================" << endl;
	cout << "ID: " << id << endl;
	cout << "First Name: " << fname << endl;
	cout << "Last Name: " << lname << endl;
	cout << "Total: " << total << endl;
	cout << "Average: " << average << "%" << endl;
	cout << "Grade: " << grade << endl;
	if (average >= 90)
	{
		cout << "Comment: Congratulations!" << endl;
	}
	else if (average < 60)
	{
		cout << "Comment: Maybe this isn't your best subject" << endl;
	}
	cout << "======================================\n" << endl;

		return 0;
}