package clients;

import webservice.service.Exception_Exception;
import webservice.service.Server;
import webservice.service.ServerService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;

public class Client {

    public static final int port = 8080;
    public static final String url = "http://localhost:%d/HairSalonWS?wsdl";

    public static void main(String[] args) throws IOException, Exception_Exception {
        Server sr = new ServerService(new URL(String.format(url, port))).getServerPort();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean is_exit = false;

        while (!is_exit) {
            System.out.println("[Service List]            : 0\n" +
                    "[List of free time]       : 1 \n" +
                    "[Get Booked]              : 2 \n" +
                    "[Delete Booked time]      : 3 \n" +
                    "[Exit]                    : 4 \n");

            int token = Integer.parseInt(br.readLine());
            switch (token) {
                case 0:
                    String collection = sr.getServiceList();
                    System.out.println(collection);
                    continue;
                case 1:
                    System.out.println("Enter day month year: ");
                    String[] dataInput = br.readLine().split(" ");
                    int day = Integer.parseInt(dataInput[0]);
                    int month = Integer.parseInt(dataInput[1]);
                    int year = Integer.parseInt(dataInput[2]);
                    try {
                        System.out.println("[Here's when our staff is free] :\n");
                        String string = sr.getFreeTime(day, month, year);
                        System.out.println(string);
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    continue;
                case 2:
                    System.out.println("Enter day month year hour service_id: ");
                    String[] dataInput1 = br.readLine().split(" ");
                    int day1 = Integer.parseInt(dataInput1[0]);
                    int month1 = Integer.parseInt(dataInput1[1]);
                    int year1 = Integer.parseInt(dataInput1[2]);
                    int hour = Integer.parseInt(dataInput1[3]);
                    int id = Integer.parseInt(dataInput1[4]);
                    try {
//                        System.out.println("[Here's when our staff is free] :\n");
                        String gh = sr.getAHairCut(day1, month1, year1, hour, id);
                        System.out.println("You're successfully booked at " + day1 + "." + month1 + "." + year1 + " at " + hour + ":00" + ".\n"
                                + gh + "\n");
                    } catch (Exception e) {
                        System.err.println(e.getMessage());
                    }
                    continue;
                case 3:
                    System.out.println("Enter booking_id: ");
                    String[] dataInput2 = br.readLine().split(" ");
//                    int service_id = Integer.parseInt(dataInput2[0]);
                    int booking_id = Integer.parseInt(dataInput2[0]);
                    try {
                        sr.deleteBooking(booking_id);
                        System.out.println("Your id was deleted successfully.\n");
                    } catch (UnsupportedOperationException unsupportedOperationException) {
                        System.err.println("!!Wrong booking!!");
                    }
                    continue;

                case 4:
                    is_exit = true;
                    break;
            }
        }
    }
}
