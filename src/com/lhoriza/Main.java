package com.lhoriza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userInput = "";
        double userMoney;
        double userChangeMoney;
        boolean toContinue = false;
        int resourceWater = 200;
        int resourceMilk = 200;
        int resourceCoffee = 100;
        double resourceMoney = 500;
        double espressoPrice = 99;
        double lattePrice = 199;
        double cappuccinoPrice = 149;
        Scanner appScanner = new Scanner(System.in);

        while (!toContinue) {
            System.out.println("💚💚💚💚💚💚💚💚💚💚💚💚💚");
            System.out.println("WELCOME TO COFFEE MACHINE ☕");
            System.out.println("============MENU============");
            System.out.println("Espresso     --      ₱" + espressoPrice + "0");
            System.out.println("Latte        --      ₱" + lattePrice + "0");
            System.out.println("Cappuccino   --      ₱" + cappuccinoPrice + "0");
            System.out.println("===========GUIDE============");
            System.out.println("1. To order just type espresso or latte or cappuccino.");
            System.out.println("2. To see the coffee machine's current resource values just type report.");
            System.out.println("3. To turn off the coffee machine just type off.");
            System.out.println("========================================================================");
            System.out.println("What would you like? (espresso/latte/cappuccino):");
            userInput = appScanner.nextLine().toLowerCase();
            if (!userInput.equals("espresso") && !userInput.equals("latte") && !userInput.equals("cappuccino") && !userInput.equals("off") && !userInput.equals("report")) {
                System.out.println("Sorry I don't understand that. Please read the guide.");
            // ESPRESSO
            } else if (userInput.equals("espresso")) {
                if (resourceWater < 100 && resourceCoffee < 25) {
                    System.out.println("Sorry, unable to make espresso. Coffee machine does not have enough ingredients.");
                    System.out.println("--------------------------------------------");
                    System.out.println("COFFEE MACHINE CURRENT RESOURCE VALUES");
                    System.out.println("Water: " + resourceWater + "ml");
                    System.out.println("Milk: " + resourceMilk + "ml");
                    System.out.println("Coffee: " + resourceCoffee + "g");
                    System.out.println("Money: ₱" + resourceMoney + "0");
                    System.out.println("--------------------------------------------");
                } else if (resourceWater < 100) {
                    System.out.println("Sorry, unable to make espresso. Coffee machine does not have enough water.");
                    System.out.println("--------------------------------------------");
                    System.out.println("COFFEE MACHINE CURRENT RESOURCE VALUES");
                    System.out.println("Water: " + resourceWater + "ml");
                    System.out.println("Milk: " + resourceMilk + "ml");
                    System.out.println("Coffee: " + resourceCoffee + "g");
                    System.out.println("Money: ₱" + resourceMoney + "0");
                    System.out.println("--------------------------------------------");
                } else if (resourceCoffee < 25) {
                    System.out.println("Sorry, unable to make espresso. Coffee machine does not have enough coffee.");
                    System.out.println("--------------------------------------------");
                    System.out.println("COFFEE MACHINE CURRENT RESOURCE VALUES");
                    System.out.println("Water: " + resourceWater + "ml");
                    System.out.println("Milk: " + resourceMilk + "ml");
                    System.out.println("Coffee: " + resourceCoffee + "g");
                    System.out.println("Money: ₱" + resourceMoney + "0");
                    System.out.println("--------------------------------------------");
                } else {
                        System.out.println("Please insert money:");
                        if (appScanner.hasNextDouble()) {
                            userMoney = appScanner.nextDouble();
                            double roundedUserMoney = Math.round(userMoney * 100.0) / 100.0;
                            appScanner.nextLine();
                            if (userMoney == espressoPrice) {
                                resourceWater -= 100;
                                resourceCoffee -= 25;
                                resourceMoney += espressoPrice;
                                System.out.println("=================RECEIPT====================");
                                System.out.println("ESPRESSO           --               ₱" + espressoPrice + "0");
                                System.out.println("PAYMENT            --               ₱" + userMoney + "0");
                                System.out.println("CHANGE DUE         --               ₱0.00" );
                                System.out.println("============================================");
                                System.out.println("COFFEE MACHINE CURRENT RESOURCE VALUES");
                                System.out.println("Water: " + resourceWater + "ml");
                                System.out.println("Milk: " + resourceMilk + "ml");
                                System.out.println("Coffee: " + resourceCoffee + "g");
                                System.out.println("Money: ₱" + resourceMoney + "0");
                                System.out.println("--------------------------------------------");
                            } else if (userMoney > espressoPrice) {
                                if (resourceMoney < userMoney - espressoPrice) {
                                    System.out.println("Sorry, unable to return a change. Coffee machine's current money is ₱" + resourceMoney + "0 only. Money refunded.");
                                } else {
                                    resourceWater -= 100;
                                    resourceCoffee -= 25;
                                    resourceMoney += espressoPrice;
                                    userChangeMoney = userMoney - espressoPrice;
                                    double roundedUserChangeMoney = Math.round(userChangeMoney * 100.0) / 100.0;
                                    System.out.println("=================RECEIPT====================");
                                    System.out.println("ESPRESSO           --               ₱" + espressoPrice + "0");
                                    System.out.println("PAYMENT            --               ₱" + roundedUserMoney);
                                    System.out.println("CHANGE DUE         --               ₱" + roundedUserChangeMoney);
                                    System.out.println("============================================");
                                    System.out.println("COFFEE MACHINE CURRENT RESOURCE VALUES");
                                    System.out.println("Water: " + resourceWater + "ml");
                                    System.out.println("Milk: " + resourceMilk + "ml");
                                    System.out.println("Coffee: " + resourceCoffee + "g");
                                    System.out.println("Money: ₱" + resourceMoney + "0");
                                    System.out.println("--------------------------------------------");
                                }
                            } else if (userMoney < 0) {
                                System.out.println("Oops! Coffee Machine is not accepting negative value. Transaction cannot be process.");
                            } else {
                                System.out.println("Sorry that's not enough money. Money refunded.");
                            }
                        } else {
                            System.out.println("Oops! Coffee Machine is not accepting string value. Transaction cannot be process.");
                            appScanner.nextLine();
                        }
                }
            // LATTE
            } else if (userInput.equals("latte")) {
                if (resourceWater < 100 && resourceCoffee < 25 && resourceMilk < 100) {
                    System.out.println("Sorry, unable to make latte. Coffee machine does not have enough ingredients.");
                    System.out.println("--------------------------------------------");
                    System.out.println("COFFEE MACHINE CURRENT RESOURCE VALUES");
                    System.out.println("Water: " + resourceWater + "ml");
                    System.out.println("Milk: " + resourceMilk + "ml");
                    System.out.println("Coffee: " + resourceCoffee + "g");
                    System.out.println("Money: ₱" + resourceMoney + "0");
                    System.out.println("--------------------------------------------");
                } else if (resourceWater < 100) {
                    System.out.println("Sorry, unable to make latte. Coffee machine does not have enough water.");
                    System.out.println("--------------------------------------------");
                    System.out.println("COFFEE MACHINE CURRENT RESOURCE VALUES");
                    System.out.println("Water: " + resourceWater + "ml");
                    System.out.println("Milk: " + resourceMilk + "ml");
                    System.out.println("Coffee: " + resourceCoffee + "g");
                    System.out.println("Money: ₱" + resourceMoney + "0");
                    System.out.println("--------------------------------------------");
                } else if (resourceCoffee < 25) {
                    System.out.println("Sorry, unable to make latte. Coffee machine does not have enough coffee.");
                    System.out.println("--------------------------------------------");
                    System.out.println("COFFEE MACHINE CURRENT RESOURCE VALUES");
                    System.out.println("Water: " + resourceWater + "ml");
                    System.out.println("Milk: " + resourceMilk + "ml");
                    System.out.println("Coffee: " + resourceCoffee + "g");
                    System.out.println("Money: ₱" + resourceMoney + "0");
                    System.out.println("--------------------------------------------");
                } else if (resourceMilk < 100) {
                    System.out.println("Sorry, unable to make latte. Coffee machine does not have enough milk.");
                    System.out.println("--------------------------------------------");
                    System.out.println("COFFEE MACHINE CURRENT RESOURCE VALUES");
                    System.out.println("Water: " + resourceWater + "ml");
                    System.out.println("Milk: " + resourceMilk + "ml");
                    System.out.println("Coffee: " + resourceCoffee + "g");
                    System.out.println("Money: ₱" + resourceMoney + "0");
                    System.out.println("--------------------------------------------");
                } else {
                    System.out.println("Please insert money:");
                    if (appScanner.hasNextDouble()) {
                        userMoney = appScanner.nextDouble();
                        double roundedUserMoney = Math.round(userMoney * 100.0) / 100.0;
                        appScanner.nextLine();
                        if (userMoney == lattePrice) {
                            resourceWater -= 100;
                            resourceCoffee -= 25;
                            resourceMilk -= 100;
                            resourceMoney += lattePrice;
                            System.out.println("=================RECEIPT====================");
                            System.out.println("LATTE           --               ₱" + lattePrice + "0");
                            System.out.println("PAYMENT            --               ₱" + userMoney + "0");
                            System.out.println("CHANGE DUE         --               ₱0.00" );
                            System.out.println("============================================");
                            System.out.println("COFFEE MACHINE CURRENT RESOURCE VALUES");
                            System.out.println("Water: " + resourceWater + "ml");
                            System.out.println("Milk: " + resourceMilk + "ml");
                            System.out.println("Coffee: " + resourceCoffee + "g");
                            System.out.println("Money: ₱" + resourceMoney + "0");
                            System.out.println("--------------------------------------------");
                        } else if (userMoney > lattePrice) {
                            if (resourceMoney < userMoney - lattePrice) {
                                System.out.println("Sorry, unable to return a change. Coffee machine's current money is ₱" + resourceMoney + "0 only. Money refunded.");
                            } else {
                                resourceWater -= 100;
                                resourceCoffee -= 25;
                                resourceMilk -= 100;
                                resourceMoney += lattePrice;
                                userChangeMoney = userMoney - lattePrice;
                                double roundedUserChangeMoney = Math.round(userChangeMoney * 100.0) / 100.0;
                                System.out.println("=================RECEIPT====================");
                                System.out.println("LATTE              --               ₱" + lattePrice + "0");
                                System.out.println("PAYMENT            --               ₱" + roundedUserMoney);
                                System.out.println("CHANGE DUE         --               ₱" + roundedUserChangeMoney);
                                System.out.println("============================================");
                                System.out.println("COFFEE MACHINE CURRENT RESOURCE VALUES");
                                System.out.println("Water: " + resourceWater + "ml");
                                System.out.println("Milk: " + resourceMilk + "ml");
                                System.out.println("Coffee: " + resourceCoffee + "g");
                                System.out.println("Money: ₱" + resourceMoney + "0");
                                System.out.println("--------------------------------------------");
                            }
                        } else if (userMoney < 0) {
                            System.out.println("Oops! Coffee Machine is not accepting negative value. Transaction cannot be process.");
                        } else {
                            System.out.println("Sorry that's not enough money. Money refunded.");
                        }
                    } else {
                        System.out.println("Oops! Coffee Machine is not accepting string value. Transaction cannot be process.");
                        appScanner.nextLine();
                    }
                }
            // CAPPUCCINO
            } else if (userInput.equals("cappuccino")) {
                if (resourceWater < 100 && resourceCoffee < 25 && resourceMilk < 50) {
                    System.out.println("Sorry, unable to make cappuccino. Coffee machine does not have enough ingredients.");
                    System.out.println("--------------------------------------------");
                    System.out.println("COFFEE MACHINE CURRENT RESOURCE VALUES");
                    System.out.println("Water: " + resourceWater + "ml");
                    System.out.println("Milk: " + resourceMilk + "ml");
                    System.out.println("Coffee: " + resourceCoffee + "g");
                    System.out.println("Money: ₱" + resourceMoney + "0");
                    System.out.println("--------------------------------------------");
                } else if (resourceWater < 100) {
                    System.out.println("Sorry, unable to make cappuccino. Coffee machine does not have enough water.");
                    System.out.println("--------------------------------------------");
                    System.out.println("COFFEE MACHINE CURRENT RESOURCE VALUES");
                    System.out.println("Water: " + resourceWater + "ml");
                    System.out.println("Milk: " + resourceMilk + "ml");
                    System.out.println("Coffee: " + resourceCoffee + "g");
                    System.out.println("Money: ₱" + resourceMoney + "0");
                    System.out.println("--------------------------------------------");
                } else if (resourceCoffee < 25) {
                    System.out.println("Sorry, unable to make cappuccino. Coffee machine does not have enough coffee.");
                    System.out.println("--------------------------------------------");
                    System.out.println("COFFEE MACHINE CURRENT RESOURCE VALUES");
                    System.out.println("Water: " + resourceWater + "ml");
                    System.out.println("Milk: " + resourceMilk + "ml");
                    System.out.println("Coffee: " + resourceCoffee + "g");
                    System.out.println("Money: ₱" + resourceMoney + "0");
                    System.out.println("--------------------------------------------");
                } else if (resourceMilk < 50) {
                    System.out.println("Sorry, unable to make cappuccino. Coffee machine does not have enough milk.");
                    System.out.println("--------------------------------------------");
                    System.out.println("COFFEE MACHINE CURRENT RESOURCE VALUES");
                    System.out.println("Water: " + resourceWater + "ml");
                    System.out.println("Milk: " + resourceMilk + "ml");
                    System.out.println("Coffee: " + resourceCoffee + "g");
                    System.out.println("Money: ₱" + resourceMoney + "0");
                    System.out.println("--------------------------------------------");
                } else {
                    System.out.println("Please insert money:");
                    if (appScanner.hasNextDouble()) {
                        userMoney = appScanner.nextDouble();
                        double roundedUserMoney = Math.round(userMoney * 100.0) / 100.0;
                        appScanner.nextLine();
                        if (userMoney == cappuccinoPrice) {
                            resourceWater -= 100;
                            resourceCoffee -= 25;
                            resourceMilk -= 50;
                            resourceMoney += cappuccinoPrice;
                            System.out.println("=================RECEIPT====================");
                            System.out.println("CAPPUCCINO         --               ₱" + cappuccinoPrice + "0");
                            System.out.println("PAYMENT            --               ₱" + userMoney + "0");
                            System.out.println("CHANGE DUE         --               ₱0.00" );
                            System.out.println("============================================");
                            System.out.println("COFFEE MACHINE CURRENT RESOURCE VALUES");
                            System.out.println("Water: " + resourceWater + "ml");
                            System.out.println("Milk: " + resourceMilk + "ml");
                            System.out.println("Coffee: " + resourceCoffee + "g");
                            System.out.println("Money: ₱" + resourceMoney + "0");
                            System.out.println("--------------------------------------------");
                        } else if (userMoney > cappuccinoPrice) {
                            if (resourceMoney < userMoney - cappuccinoPrice) {
                                System.out.println("Sorry, unable to return a change. Coffee machine's current money is ₱" + resourceMoney + "0 only. Money refunded.");
                            } else {
                                resourceWater -= 100;
                                resourceCoffee -= 25;
                                resourceMilk -= 50;
                                resourceMoney += cappuccinoPrice;
                                userChangeMoney = userMoney - cappuccinoPrice;
                                double roundedUserChangeMoney = Math.round(userChangeMoney * 100.0) / 100.0;
                                System.out.println("=================RECEIPT====================");
                                System.out.println("CAPPUCCINO         --               ₱" + cappuccinoPrice + "0");
                                System.out.println("PAYMENT            --               ₱" + roundedUserMoney);
                                System.out.println("CHANGE DUE         --               ₱" + roundedUserChangeMoney);
                                System.out.println("============================================");
                                System.out.println("COFFEE MACHINE CURRENT RESOURCE VALUES");
                                System.out.println("Water: " + resourceWater + "ml");
                                System.out.println("Milk: " + resourceMilk + "ml");
                                System.out.println("Coffee: " + resourceCoffee + "g");
                                System.out.println("Money: ₱" + resourceMoney + "0");
                                System.out.println("--------------------------------------------");
                            }
                        } else if (userMoney < 0) {
                            System.out.println("Oops! Coffee Machine is not accepting negative value. Transaction cannot be process.");
                        } else {
                            System.out.println("Sorry that's not enough money. Money refunded.");
                        }
                    } else {
                        System.out.println("Oops! Coffee Machine is not accepting string value. Transaction cannot be process.");
                        appScanner.nextLine();
                    }
                }
            // COFFEE MACHINE CURRENT RESOURCE VALUES
            } else if (userInput.equals("report")) {
                System.out.println("--------------------------------------------");
                System.out.println("COFFEE MACHINE CURRENT RESOURCE VALUES");
                System.out.println("Water: " + resourceWater + "ml");
                System.out.println("Milk: " + resourceMilk + "ml");
                System.out.println("Coffee: " + resourceCoffee + "g");
                System.out.println("Money: ₱" + resourceMoney + "0");
                System.out.println("--------------------------------------------");
            // TURN OFF THE COFFEE MACHINE
            } else if (userInput.equals("off")) {
                System.out.println("COFFEE MACHINE IS SHUTTING DOWN");
                break;
            }
        }
    }
}
