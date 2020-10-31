package ua.academy.lgs1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		int arrSize = getRandomValue(1, 10);
		ArrayList<Car> arrayCarsToPutInArray = new ArrayList<>(arrSize);
		ArrayList<ArrayList<Car>> arrayCars = new ArrayList<>(arrSize);
		for (int i = 0; i < arrSize; i++) {
			arrayCars.add(i, arrayCarsToPutInArray);

			for (int j = 0; j < arrSize; j++) {
				arrayCarsToPutInArray.add(j, new Car((getRandomValue(10, 100)), (getRandomValue(2000, 2020))));
			}

		}
		System.out.println(arrayCars);
		while (true) {
			Menu.menu();
			Scanner sc = new Scanner(System.in);

			switch (sc.next()) {
			case "1": {
				System.out.println(arrayCars);
				break;
			}
			case "2": {
				Car car = new Car(getRandomValue(10, 100), getRandomValue(2000, 2020));
				arrayCarsToPutInArray.clear();
				for (int i = 0; i < arrSize; i++) {
					arrayCarsToPutInArray.add(i, car);
				}

				System.out.println(arrayCars);
				break;
			}

			default: {
				System.out.println("Sorry, wrong input");

			}
			}
		}
	}

	private static int getRandomValue(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("min value can't be bigger than max value");
		}
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;

	}

}
