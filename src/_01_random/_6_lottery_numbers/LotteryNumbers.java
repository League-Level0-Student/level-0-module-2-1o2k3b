package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random ran = new Random();

int num = 0;
int n = 0;
int bmun = 0;
int nu = 0;
int numb = 0;
int number = 0;
number = ran.nextInt(1000);
numb = ran.nextInt(1000);
nu = ran.nextInt(1000);
bmun = ran.nextInt(1000);
n = ran.nextInt(1000);
num = ran.nextInt(1000);
String numbe = number  +" " + numb +" " + nu +" "+ bmun +" "+ n +" "+ num +" ";

JOptionPane.showMessageDialog(null, numbe);

	}
}
