/*	Author's Name: Lazaro A Herrera
Date: July 9, 2014
Program: Assignment 6
College Name: Long Beach City College (LBCC)
*/


#include <iostream>
#include <iomanip>

using namespace std;

void barcode(int);

int main()
{
	//Variables
	int zip = int();
	int sum = int();
	int d1 = int();
	int d2 = int();
	int d3 = int();
	int d4 = int();
	int d5 = int();
	int correctionDigit = int();

	//Processing
	cout << "Please Enter Zipcode: ";
	cin >> zip;

	d5 = zip % 10;
	d4 = zip % 100/10;
	d3 = zip % 1000/100;
	d2 = zip % 10000/1000;
	d1 = zip % 100000/10000;
	sum = d1 + d2 + d3 + d4 + d5;
	correctionDigit = 10 - sum % 10;
	if (correctionDigit == 10)
		correctionDigit = 0;

	//Output
	cout << "The sum is: " << sum << endl;
	cout << "The correction digit is: " << correctionDigit << endl;
	cout << "The barcode with correction digit is: |";
	barcode(d1);
	barcode(d2);
	barcode(d3);
	barcode(d4);
	barcode(d5);
	barcode(correctionDigit);
	cout << "|" << endl;
	cout << right << setw(39) << "|" << setw(3) << d1 << setw(5) 
		 << d2 << setw(5) << d3 << setw(5) << d4 << setw(5) << d5 
		 << setw(5) << correctionDigit << setw(3) << "|" << endl;

	return 0;
}

//Barcode
void barcode(int digit)
{
	if (digit == 0)
		cout << "||:::";
	else if (digit == 1)
		cout << ":::||";
	else if (digit == 2)
		cout << "::|:|";
	else if (digit == 3)
		cout << "::||:";
	else if (digit == 4)
		cout << ":|::|";
	else if (digit == 5)
		cout << ":|:|:";
	else if (digit == 6)
		cout << ":||::";
	else if (digit == 7)
		cout << "|:::|";
	else if (digit == 8)
		cout << "|::|:";
	else if (digit == 9)
		cout << "|:|::";
}