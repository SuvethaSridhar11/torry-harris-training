package com.torry;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.TreeMap;

public class Ticket {
    private int count = 0;
    private String pnr;
    private  double totalPrice;
    private String travelDate;
    private Train train;
    private TreeMap<Passenger, Double> passengers = new TreeMap<>();
    private Connection connection;
    private ArrayList<Passenger> passengerArrayList = new ArrayList<>();

    public Ticket(Train train, String date) {
        passengerArrayList = new ArrayList<>();
        passengers = new TreeMap<>();
        this.train = train;
        this.travelDate = date;
    }

    public String generatePNR() {

        String counterFileName="count.txt";
        int count=99;
        File counterFile=new File(counterFileName);
        connection = DBConnection.getConnection();
        if(counterFile.isFile())
        {
            try (BufferedReader reader = new BufferedReader(new FileReader(counterFileName)))
            {
                count=Integer.parseInt(reader.readLine());
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
        try(FileWriter writer = new FileWriter(counterFileName))
        {
            writer.write(String.valueOf(++count));
        } catch(IOException e){
            e.printStackTrace();
        }

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("" +
                    "select *from trains where TRAIN_NO = " + train.getTrainNo());


            while (rs.next()) {

                String[] split = travelDate.split("/");

                pnr = String.valueOf(rs.getString(3).charAt(0)).toUpperCase() +
                        String.valueOf(rs.getString(4).charAt(0)).toUpperCase()
                        + "_" + split[2] + split[1] + split[0] +
                        "_" + count;

                //System.out.println(pnr);
                return pnr;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;

    }
    public void addPassenger(String name, int age, char gender) {
        Passenger pass1 = new Passenger(name, age, gender);
        passengerArrayList.add(pass1);
        Passenger pass2 = new Passenger(name, age, gender);
        double prize = calcPassengerFare(pass2);
        passengers.put(pass2,prize);
    }
    //Passenger p = new Passenger();
    private double calcPassengerFare(Passenger p) {


        if (p.getAge() <= 12) {
            return (train.getTicketPrice() * 0.5);
        }
        if (p.getAge() >= 60) {
            return (train.getTicketPrice() * 0.6);
        }
        if (p.getGender() == 'F' || p.getGender() == 'f') {
            return (train.getTicketPrice() * 0.75);
        } else {
            return train.getTicketPrice();
        }

    }



    private double calculateTotalTicketPrice() {
        double totalPrice = 0.0;
        for (double p : passengers.values()) {
            totalPrice += p;
        }
        return totalPrice;
    }

    public double totalTicketPrice()
    {
        double totalTicketPrice = 0.0;
        System.out.println(passengers);
        for(double p : passengers.values())
        {

            totalTicketPrice += p;
        }

        return totalTicketPrice;
    }
    private StringBuilder generateTicket() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(generatePNR() + ","
                + train.getTrainNo() + ","
                + train.getTrainName() + ","
                + train.getSource() + ","
                + train.getDestination() + ","
                + travelDate + ","
                + calculateTotalTicketPrice());

        return stringBuilder;
    }
    public void writeTicket() {

        File file = new File(generatePNR()+".txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter fileWriter = new FileWriter(file, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            StringBuilder stringBuilder = generateTicket();


            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.write("PNR: " + stringBuilder.toString().split(",")[0]);
            bufferedWriter.newLine();
            bufferedWriter.write("Train no: " + stringBuilder.toString().split(",")[1]);
            bufferedWriter.newLine();
            bufferedWriter.write("Train name: " + stringBuilder.toString().split(",")[2]);
            bufferedWriter.newLine();
            bufferedWriter.write("From: " + stringBuilder.toString().split(",")[3]);
            bufferedWriter.newLine();
            bufferedWriter.write("To: " + stringBuilder.toString().split(",")[4]);
            bufferedWriter.newLine();
            bufferedWriter.write("Travel Date: " + stringBuilder.toString().split(",")[5]);
            bufferedWriter.newLine();

            bufferedWriter.write("Passengers: ");
            bufferedWriter.newLine();

            bufferedWriter.write("Name          Age         Gender          Fare");
            bufferedWriter.newLine();

            for (Passenger passenger : passengers.keySet()) {

                bufferedWriter.write(passenger.getName() + "      ");
                bufferedWriter.write(String.valueOf(passenger.getAge()) + "       ");
                bufferedWriter.write(passenger.getGender() + "        ");
                bufferedWriter.write(String.valueOf(passengers.get(passenger)) + "        ");
                bufferedWriter.newLine();
            }

            bufferedWriter.write("Total Price:  " + calculateTotalTicketPrice());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
