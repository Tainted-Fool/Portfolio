/*	Author's Name: Lazaro A Herrera
Date: July 23, 2014
Program: Assignment 9
College Name: Long Beach City College (LBCC)
*/

#include <iostream>
#include <string>
#include <iomanip>
#include <fstream>

using namespace std;

const unsigned char CH = 196;
const int NUMOFITEMS = 8;
const double TAX = 0.09;
const int MAX = 1000;

struct menuItemType
{
	string menuItem;
	double menuPrice;
};

void getData(ifstream&, menuItemType menuList[]);
void showMenu(menuItemType menuList[]);
void order(menuItemType menuList[], int[], int[], int&);
void printCheck(menuItemType menuList[], int[], int[], int&);
void line();

int main()
{
	menuItemType menuList[NUMOFITEMS];
	ifstream in;
	ofstream out;
	int numofOrders = int();
	int orderNum[MAX];
	int numOrdered[MAX];

	in.open("Menu.txt");
	getData(in, menuList);
	showMenu(menuList);
	order(menuList, orderNum, numOrdered, numofOrders);
	printCheck(menuList, orderNum, numOrdered, numofOrders);

	in.close();
	return 0;
}

void getData(ifstream& dataIn, menuItemType menuList[])
{
	while (!dataIn.eof())
	for (int i = 0; i < NUMOFITEMS; i++)
	{
		getline(dataIn, menuList[i].menuItem, '$') >> menuList[i].menuPrice;
		dataIn.ignore(50, '\n');
	}
}

void showMenu(menuItemType menuList[])
{
	cout << "Welcome to Lazaro's Restaurant" << endl;
	cout << left << setw(10) << "Item" << right
		 << setw(17) << "Price" << endl;

	line();

	for (int i = 0; i < 8; i++)
	{
		cout << fixed << setprecision(2);
		cout << i + 1 << ". " << left << setw(15) << menuList[i].menuItem << right
			<< setw(5) << "$" << menuList[i].menuPrice << endl;
	}

	line();
	cout << endl;
}

void order(menuItemType menuList[], int OrderNum[], int NumOrdered[], int& numofOrders)
{
	int choice;
	int amount;
	bool flag = true;
	char character = char();
	int i = 0;
	int j = 0;
	
	while (flag)
	{
		cout << "Please enter number of the item you would like to order" << endl;
		cin >> choice;

		while (choice <= 0 || choice > NUMOFITEMS)
		{
			cout << "Please enter valid number" << endl;
			cin >> choice;
			if (cin.fail())
			{
				cin.clear();
				cin.ignore(1000, '\n');
				cin >> choice;
			}
		}

		OrderNum[i] = choice - 1;

		cout << "How many " << menuList[OrderNum[i]].menuItem << "would you like?" << endl;
		cin >> amount;

		while (amount <= 0 || amount > 999)
		{
			cout << "Please enter amount greater than 0 and less than 1000" << endl;
			cin >> amount;
			if (cin.fail())
			{
				cin.clear();
				cin.ignore(1000, '\n');
				cin >> amount;
			}
		}

		NumOrdered[j] = amount;
		i++;
		j++;

		cout << "Would you like to keep ordering? Y or N" << endl;
		cin >> character;

		if (character == 'y' || character == 'Y')
			flag = true;
		else
			flag = false;
	}

	numofOrders = i;
}

void printCheck(menuItemType menuList[], int orderNum[], int numOrdered[], int& numofOrders)
{
	system("cls");
	int i = 0;
	int j = 0;
	double cost = double();
	double subTotal = double();
	double taxAmount = double();
	double total = double();

	cout << fixed << setprecision(2);
	cout << left << setw(10) << "Amount" << left
		 << setw(10) << "Item" << right << setw(15)
		 << "Price" << endl;
	
	line();

	for (i = 0; i < numofOrders; i++)
	{
		cost = menuList[orderNum[i]].menuPrice * numOrdered[j];
		subTotal = subTotal + cost;

		cout << left << setw(10) << numOrdered[j] << left << setw(15) 
			 << menuList[orderNum[i]].menuItem << right << setw(5) 
			 << "$" << setfill(' ') << setw(7) << cost << endl;
		j++;
	}

	taxAmount = subTotal * TAX;
	total = (subTotal * TAX) + subTotal;

	line();
	cout << endl;

	cout << left << setw(10) << "Subtotal" << right << setw(20) << "$" 
		 << setfill(' ') << setw(7) << subTotal << endl;
	cout << left << setw(10) << "Tax" << right << setw(20) << "$" 
		 << setfill(' ') << setw(7) << taxAmount << endl;
	cout << left << setw(10) << "Total" << right << setw(20) << "$" 
		 << setfill(' ') << setw(7) << total << endl;
	cout << endl;
}

void line()
{
	for (int i = 0; i < 40; i++)
		cout << CH;
	cout << endl;
}

