/*	Author's Name: Lazaro A Herrera
Date: July 21, 2014
Program: Assignment 7
College Name: Long Beach City College (LBCC)
*/

#include <string>
#include <iomanip>
#include <fstream>
#include <iostream>

using namespace std;

void greeting(ofstream&);
void getName(ifstream&, string&, string&);
void readScore(ifstream&, double&, double&, double&);
void reportNoScore(string&, string&);
double calculateAverage(double&, double&, double&);
char assignGrade(double&, char&);
void printData(string&, string&, double&, char&, ofstream&);
void farewell();
void header(ofstream&);

int main()
{
	ifstream in;
	ofstream out;
	string infile = string();
	string outfile = string();
	string fname = string();
	string lname = string();
	double testamount = double();
	double score = double();
	double totalscore = double();
	double averagescore = double();
	char grade = char();
	

	cout << "Enter input file name: ";
	cin >> infile;

	in.open((infile + ".txt").c_str());
	if (!in)
	{
		cout << "File does not exist" << endl;
		cout << "The program will now terminate" << endl;
	}

	else if (in)
	{
		cout << "Enter output file name: ";
		cin >> outfile;
		cout << endl;
	}

	out.open((outfile + ".txt").c_str());
	if (!out)
	{
		cout << "File does not exist" << endl;
		cout << "The program will now terminate" << endl;
	}
	
	else
	{
		greeting(out);
		header(out);
		getName(in, fname, lname);
		while (!in.eof())
		{
			totalscore = 0;
			testamount = 0;
			readScore(in, score, totalscore, testamount);
			if (totalscore == 0)
			{
				reportNoScore(fname, lname);
			}
			else
			{
				calculateAverage(totalscore, testamount, averagescore);
				assignGrade(averagescore, grade);
				printData(fname, lname, averagescore, grade, out);
			}
			getName(in, fname, lname);
		}
	}

	farewell();
	in.close();
	out.close();

	return 0;

}

void greeting(ofstream& outtext)
{
	outtext << "Data created from program" << endl;
	cout << "This program will read data based on input file and calculate\n"
		 << "the scores, then it will output your average score and give a\n"
		 << "letter grade based on average score\n" << endl;
}

void getName(ifstream& in, string& FirstName, string& LastName)
{
		in >> FirstName >> LastName;
}

void readScore(ifstream& in, double& Score, double& TotalScore, double& NumofTest)
{
	while (in.peek() != 10 && !in.eof())
	{
		in >> Score;
		if (in.fail())
		{
			in.clear();
			in.ignore(1, ' ');
		}
		else
		{
			TotalScore = TotalScore + Score;
			NumofTest++;
		}
	}
}

void reportNoScore(string& FirstName, string& LastName)
{
	cout << FirstName << " " << LastName << " has no valid score!" << endl;
}

double calculateAverage(double& TotalScore, double& NumofTest, double& AverageScore)
{
	AverageScore = TotalScore / NumofTest;
	return AverageScore;
}

char assignGrade(double& Average, char& Grade)
{
	if (Average >= 90)
		Grade = 'A';
	else if (Average >= 80)
		Grade = 'B';
	else if (Average >= 70)
		Grade = 'C';
	else if (Average >= 60)
		Grade = 'D';
	else if (Average <= 60)
		Grade = 'F';
	return Grade;
}

void printData(string& FirstName, string& LastName, double& AverageScore, char& Grade, ofstream& outext)
{
	string FullName = FirstName + " " + LastName;
	
	cout << fixed << setprecision(2);
	cout << left << setw(15) << FullName << right << setw(11) << AverageScore 
		 << right << setw(17) << Grade << endl;

	outext << fixed << setprecision(2);
	outext << left << setw(15) << FullName << right << setw(11) << AverageScore
		   << right << setw(17) << Grade << endl;
}

void farewell()
{
	cout << endl;
	cout << "Thank you for using this program! Goodbye!" << endl;
}

void header(ofstream& outext)
{
	char ch = 196;

	cout << left << setw(20) << "Name" << left << setw(20) << "Average"
		 << left << setw(20) << "Grade" << endl;

	for (int i = 0; i < 50; i++)
	{
		cout << ch;
	}
	cout << endl;	

	outext << left << setw(20) << "Name" << left << setw(20) << "Average"
		   << left << setw(20) << "Grade" << endl;
}