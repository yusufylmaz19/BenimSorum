package sorum;

import java.util.Scanner;

class kökbul {
	double a;
	double b;
	double c;
	double x1;
	double x2;
	double x;
	protected double delta;

	kökbul(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double birincikökhesapla() {
		return x1 = (-b - Math.sqrt(delta)) / 2 * a;
	}

	public double ikincikökhesapla() {
		return x2 = (-b + Math.sqrt(delta)) / 2 * a;

	}

	public double cakýsýkkökhesapla() {
		return x = Math.sqrt(c / a);

	}

	public double delta(kökbul d) {
		delta = d.b * d.b - 4 * d.a * d.c;
		if (delta < 0) {
			System.out.println("reel kök yok ");
		} else if (delta > 0) {

			System.out.println("delta sýfýrdan büyük ve iki kök var " + "\nbirinci kök=" + birincikökhesapla()
					+ " \nikinci kök=" + ikincikökhesapla());
		} else {
			System.out.println("delta sýfýra eþit ve çakýþýk iki kök var \nkökler = " + cakýsýkkökhesapla() + "-"
					+ cakýsýkkökhesapla());
		}
		return delta;

	}
}

class toplam extends kökbul {

	toplam(double a, double b, double c) {
		super(a, b, c);

	}

	private void topla() {

		double toplam = birincikökhesapla() + ikincikökhesapla();
		System.out.println("Kökler toplamý= "+toplam);
	}

	void göster() {
		topla();
	}
}

class carpým extends kökbul {

	carpým(double a, double b, double c) {
		super(a, b, c);

	}

	private void topla() {

		double carp = birincikökhesapla() * ikincikökhesapla();
		System.out.println("kökler Çarpýmý "+carp);
	}

	void göster() {
		topla();
	}
}

public class soru {
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Lütfen a deðerini girin");
		double a = input.nextDouble();
		System.out.println("Lütfen b deðerini girin");
		double b = input.nextDouble();
		System.out.println("Lütfen c deðerini girin");
		double c = input.nextDouble();
		kökbul kök = new kökbul(a, b, c);
		kök.delta(kök);
		toplam top = new toplam(a, b, c);
		top.göster();
		carpým carp = new carpým(a, b, c);
		carp.göster();
	}
}
