/*	Author's Name: Lazaro A Herrera
Date: June 25, 2014
Program: Assignment 4
College Name: Long Beach City College (LBCC)
*/

//Libraries
#include <iostream>
#include <cmath>
using namespace std;

int main()
{
	//Variables
	double a = double();
	double b = double();
	double c = double();
	double x = double();
	double x1 = double();
	double x2 = double();
	const char ch = 241;

	//Input
	cout << "This program will provide solutions"
		 << " for an equation of the form" << endl
		 << "\t\t\tA*x^2 " << ch << " B*X " << ch
		 << " C = 0" << endl;
	cout << "Where A, B and C are integers"
		 << " and A is not equal to zero" << endl;
	cout << "Enter A: ";
	cin  >> a;
	cout << "Enter B: ";
	cin  >> b;
	cout << "enter C: ";
	cin  >> c;
	

	//Processing and Output
	x = (b * b - 4 * a * c);
	if (a == 0)
		cout << "Variable A cannot be zero" << endl;
	else if (x > 0)
	{
		x1 = (-b + sqrt(x)) / (2 * a);
		x2 = (-b - sqrt(x)) / (2 * a);
		cout << "The two real solutions are " << x1 << " and " << x2 << endl;
	}
	else if (x == 0)
	{
		x1 = (-b + sqrt(x)) / (2 * a);
		cout << "The one real solution is " << x1 << endl;
	}
	else if (x < 0)
	{
		x1 = (-b) / (2 * a);
		x2 = sqrt(abs(x)) / (2 * a);
		cout << "The roots are imaginary" << endl;
		cout << "They are " << x1 << " + " << x2 << " * i " << endl;
		cout << "     and " << x1 << " - " << x2 << " * i " << endl;
	}

		
	return (0);
}