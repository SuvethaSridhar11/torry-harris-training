package com.torry;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class TicketApplication {
    public static void main(String[] args) {
        String date = null;
        int numOfPass = 0;
        int trainNo;
        Ticket ticket=null;
        Train train=null;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Train Number");
        trainNo = sc.nextInt();
        boolean found = false;
        do {
            if (trainNo > 1000 && trainNo <= 1006) {
                found=false;
                break;
            }
            else{
                System.out.println("Enter the valid train number.");
                trainNo = sc.nextInt();
                found=true;
                break;
            }
        }while (found==true);

        try {
            train = TrainDAO.findTrain(trainNo);
        } catch (SQLException e) {
            System.out.println("train not found");
        }

        System.out.println("Enter the Date of travel : ");
        while (true) {
            try {
                date = sc.next();
                Date date2 = new Date();
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                Date date1 = formatter.parse(date);

                if (date1.compareTo(date2) > 0) {
                    break;
                } else {
                    System.out.println("Please enter the day that is after today.");
                }

            } catch (Exception e) {
                System.out.println("Enter the valid date");
            }
        }
        System.out.println("Enter the no of Passengers");
        numOfPass = sc.nextInt();
        ticket=new Ticket(train, date);

        for (int i = 0; i < numOfPass; i++) {
            System.out.println("Enter the Name : ");
            String passName = sc.next();

            System.out.println("Enter Age : ");
            int passAge = sc.nextInt();

            System.out.println("Enter Gender(M/F)  : ");
            char passGen = sc.next().charAt(0);

            while (true) {
                if (Character.toString(passGen).equalsIgnoreCase("M") || Character.toString(passGen).equalsIgnoreCase("F")) {
                    ticket.addPassenger(passName, passAge, passGen);
                    break;
                } else {
                    System.out.println("Please enter 'M' or 'F' : ");
                    passGen = sc.nextLine().charAt(0);
                }

            }
        }
        ticket.writeTicket();
        System.out.println("Ticket Booked Successfully.");
        System.out.println("Total Ticket Price : " + ticket.totalTicketPrice());
    }
}
