package sorum;

import java.util.Scanner;

class k�kbul {
	double a;
	double b;
	double c;
	double x1;
	double x2;
	double x;
	protected double delta;

	k�kbul(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double birincik�khesapla() {
		return x1 = (-b - Math.sqrt(delta)) / 2 * a;
	}

	public double ikincik�khesapla() {
		return x2 = (-b + Math.sqrt(delta)) / 2 * a;

	}

	public double cak�s�kk�khesapla() {
		return x = Math.sqrt(c / a);

	}

	public double delta(k�kbul d) {
		delta = d.b * d.b - 4 * d.a * d.c;
		if (delta < 0) {
			System.out.println("reel k�k yok ");
		} else if (delta > 0) {

			System.out.println("delta s�f�rdan b�y�k ve iki k�k var " + "\nbirinci k�k=" + birincik�khesapla()
					+ " \nikinci k�k=" + ikincik�khesapla());
		} else {
			System.out.println("delta s�f�ra e�it ve �ak���k iki k�k var \nk�kler = " + cak�s�kk�khesapla() + "-"
					+ cak�s�kk�khesapla());
		}
		return delta;

	}
}

class toplam extends k�kbul {

	toplam(double a, double b, double c) {
		super(a, b, c);

	}

	private void topla() {

		double toplam = birincik�khesapla() + ikincik�khesapla();
		System.out.println("K�kler toplam�= "+toplam);
	}

	void g�ster() {
		topla();
	}
}

class carp�m extends k�kbul {

	carp�m(double a, double b, double c) {
		super(a, b, c);

	}

	private void topla() {

		double carp = birincik�khesapla() * ikincik�khesapla();
		System.out.println("k�kler �arp�m� "+carp);
	}

	void g�ster() {
		topla();
	}
}

public class soru {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("L�tfen a de�erini girin");
		double a = input.nextDouble();
		System.out.println("L�tfen b de�erini girin");
		double b = input.nextDouble();
		System.out.println("L�tfen c de�erini girin");
		double c = input.nextDouble();
		k�kbul k�k = new k�kbul(a, b, c);
		k�k.delta(k�k);
		toplam top = new toplam(a, b, c);
		top.g�ster();
		carp�m carp = new carp�m(a, b, c);
		carp.g�ster();
	}
}
