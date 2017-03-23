/*	Author's Name: Lazaro A Herrera
Date: July 30, 2014
Program: Assignment 10
College Name: Long Beach City College (LBCC)
*/

#include <iostream>
#include <string>

using namespace std;
const unsigned char CH = 196;

class romanType
{
public:
	void setRoman(string&);
	void convertRoman();
	void printRoman();
	void printDecimal();
	void choice();
private:
	string roman;
	int decimal;
};

void line();

int main()
{
	romanType romanNum;
	string roman1 = string();
	char choice = char();
	bool flag = true;

	line();
	cout << "This program converts Roman Numerals into Decimals!" << endl;
	line();

	while (flag)
	{
		cout << "Please enter Roman Numeral: ";
		cin >> roman1;
		cout << endl;

		romanNum.setRoman(roman1);
		romanNum.convertRoman();
		romanNum.choice();
		
		cout << "Do you want to run this program again? Y or N" << endl;
		cin >> choice;

			if (choice == 'y' || choice == 'Y')
				flag = true;
			else
				flag = false;
	}

	return 0;
}

void romanType::setRoman(string& roman1)
{
	roman = roman1;
}

void romanType::convertRoman()
{
	decimal = 0;

	for (int i = 0; i < roman.length(); i++)
	{
		if (roman[i] == 'I' || roman[i] == 'i')
		{
			if (roman[i + 1] == 'X' || roman[i + 1] == 'x')
				decimal -= 1;
			else if (roman[i + 1] == 'V' || roman[i + 1] == 'v')
				decimal -= 1;
			else
				decimal += 1;
		}

		else if (roman[i] == 'V' || roman[i] == 'v')
				decimal += 5;

		else if (roman[i] == 'X' || roman[i] == 'x')
		{
			if (roman[i + 1] == 'C' || roman[i + 1] == 'c')
				decimal -= 10;
			else if (roman[i + 1] == 'L' || roman[i + 1] == 'l')
				decimal -= 10;
			else
				decimal += 10;
		}

		else if (roman[i] == 'L' || roman[i] == 'l')
			decimal += 50;

		else if (roman[i] == 'C' || roman[i] == 'c')
		{
			if (roman[i + 1] == 'M' || roman[i + 1] == 'm')
				decimal -= 100;
			else if (roman[i + 1] == 'D' || roman[i + 1] == 'd')
				decimal -= 100;
			else
			decimal += 100;
		}

		else if (roman[i] == 'D' || roman[i] == 'd')
			decimal += 500;

		else if (roman[i] == 'M' || roman[i] == 'm')
			decimal += 1000;
	}
}

void romanType::printRoman()
{
	cout << "The Roman Numeral is " << roman << endl;
	cout << endl;
}

void romanType::printDecimal()
{
	cout << "The Decimal Number is " << decimal << endl;
	cout << endl;
}

void romanType::choice()
{
	char choice = char();
	bool flag = true;

	cout << "Do you want the Roman Numeral or the Decimal?" << endl;
	cout << "1. for Decimal" << endl;
	cout << "2. for Roman Numeral" << endl;
	cin >> choice;
	cout << endl;

	while (flag)
	{
		if (choice == '1')
		{
			printDecimal();
			flag = false;
		}
		else if (choice == '2')
		{
			printRoman();
			flag = false;
		}
		else
		{
			cout << "Invalid choice!" << endl;
			cin >> choice;
		}
	}
}

void line()
{
	for (int i = 0; i < 55; i++)
		cout << CH;
	cout << endl;
}