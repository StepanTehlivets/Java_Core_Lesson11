package ua.academy.lgs;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
			public static void main(String[] args) throws WrongInputException {
				
				ArrayList<Months> mons = new ArrayList<Months>();
				mons.add(Months.JANUARY);
				mons.add(Months.FEBRUARY);
				mons.add(Months.MARCH);
				mons.add(Months.APRIL);
				mons.add(Months.MAY);
				mons.add(Months.JUNE);
				mons.add(Months.JULY);
				mons.add(Months.AUGUST);
				mons.add(Months.SEPTEMBER);
				mons.add(Months.OCTOBER);
				mons.add(Months.NOVEMBER);
				mons.add(Months.DECEMBER);
				Scanner sc = new Scanner(System.in);

				while (true) {
					
					
					Menu.menu();
					
					
					switch (sc.next()) {
					
					
					case "1": {
						System.out.println("Enter month");
						sc = new Scanner(System.in);
						
						
						String monthSc = sc.next().toUpperCase();

						boolean flag = false;

						
						for (Months m : mons) {
							if (m.name().equals(monthSc)) {
								flag = true;
							}

						}
						if (flag) {
							System.out.println("Month is present");
						} else if(!flag){
							System.out.println("There is no such month");
						}

						break;
					}
					
					
					case "2": {
						System.out.println("Enter season");
						sc = new Scanner(System.in);
						
						
						String seasonSc = sc.next().toUpperCase();
						boolean flag = false;

						
						for (Months m : mons) {
							if (m.getSeason().name().equals(seasonSc)) {
								flag = true;
								System.out.println(m);
							}
						}
						
						
						if (!flag) {
							throw new WrongInputException("Sorry, input is wrong");
						}

						break;
					}
					
					
					case "3": {
						System.out.println("Enter month");
						sc = new Scanner(System.in);
						
						
						String monthSc = sc.next().toUpperCase();
						boolean flag = false;
						
						
						for (Months m : mons) {
							if (m.name().equals(monthSc)) {
								flag = true;
								
							
								int days = m.getDays();
								
								
								for (Months months : mons) {
									if (days == months.days) {
										System.out.println(months);
									}
								}
							}
						}
						
						
						if (!flag) {
							throw new WrongInputException("Sorry, input is wrong");
						}

						break;
					}
					
					
					case "4": {
						System.out.println("Enter month");
						
						sc = new Scanner(System.in);
						String monthSc = sc.next().toUpperCase();
						boolean flag = false;
						
						
						for (Months m : mons) {
							if (m.name().equals(monthSc)) {
								flag = true;
								
							
								int days = m.getDays();
								
								
								for (Months months : mons) {
									if (days > months.days) {
										System.out.println(months);
									}
								}

							}

						}
						
						
						if (!flag) {
							throw new WrongInputException("Sorry input is wrong");
						}
						break;
					}
					
					
					case "5": {
						System.out.println("Enter month");
						sc = new Scanner(System.in);
						
						
						String monthSc = sc.next().toUpperCase();
						boolean flag = false;
						
						
						for (Months m : mons) {
							if (m.name().equals(monthSc)) {
								flag = true;
								
								
								int days = m.getDays();
								
							
								for (Months months : mons) {
									if (days < months.days) {
										System.out.println(months);
									}

								}
							}
						}
						
						
						if (!flag) {
							throw new WrongInputException("Sorry input is wrong");
						}
						break;
					}
					
					
					case "6": {
						System.out.println("Enter season");
						sc = new Scanner(System.in);
						
						
						String seasonSc = sc.next().toUpperCase();
						boolean flag = false;
						
						
						for (Months m : mons) {
							if (m.getSeason().name().equals(seasonSc)) {
								flag = true;
							}
						}
						
						
						if (flag) {
							if (seasonSc.equals("WINTER")) {
								System.out.println("SPRING");
							} else if (seasonSc.equals("SPRING")) {
								System.out.println("SUMMER");
							} else if (seasonSc.equals("SUMMER")) {
								System.out.println("AUTUMN");
							} else if (seasonSc.equals("AUTUMN")) {
								System.out.println("WINTER");
							}

						}
						
						
						else {
							throw new WrongInputException("Sorry input is wrong");
						}

						break;
					}
					
					
					case "7": {
						System.out.println("Enter season");
						sc = new Scanner(System.in);
						
						
						String seasonSc = sc.next().toUpperCase();
						boolean flag = false;
						
						
						for (Months m : mons) {
							if (m.getSeason().name().equals(seasonSc)) {
								flag = true;
							}
						}
						
						
						if (flag) {
							if (seasonSc.equals("WINTER")) {
								System.out.println("AUTUMN");
							} else if (seasonSc.equals("SPRING")) {
								System.out.println("WINTER");
							} else if (seasonSc.equals("SUMMER")) {
								System.out.println("SPRING");
							} else if (seasonSc.equals("AUTUMN")) {
								System.out.println("SUMMER");
							}

						}
						
						else {
							throw new WrongInputException("Sorry input is wrong");
						}

						break;
					}

					
					case "8": {

					
						for (Months m : mons) {

							
							if (m.getDays() % 2 == 0) {
								System.out.println(m.name());
							}
						}

						break;
					}

					
					case "9": {

						
						for (Months m : mons) {

							
							if (m.getDays() % 2 == 1) {
								System.out.println(m.name());
							}
						}

						break;
					}

				
					case "10": {
						System.out.println("Enter month");
						sc = new Scanner(System.in);

						
						String monthSc = sc.next().toUpperCase();
						boolean flag = false;
					
						for (Months months : mons) {

							
							if (months.name().equals(monthSc) & months.getDays() % 2 == 0) {
								System.out.println("Month has even number of days");
								flag = true;
							}

							
							else if (months.name().equals(monthSc) & months.getDays() % 2 == 1) {
								System.out.println("Month has odd number of days");
								flag = true;
							}
						}

				
						if (!flag) {
							throw new WrongInputException("Sorry input is wrong");
						}

						break;
					}
					}

				}

			}
		}
