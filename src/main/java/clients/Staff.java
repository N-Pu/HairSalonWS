package clients;

import webservice.service.Exception_Exception;
import webservice.service.Server;
import webservice.service.ServerService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Staff {

    public static final int port = 8080;
    public static final String url = "http://localhost:%d/HairSalonWS?wsdl";

    public static void main(String[] args) throws IOException, Exception_Exception {
        Server sr = new ServerService(new URL(String.format(url, port))).getServerPort();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean is_exit = false;

        while (!is_exit) {
            System.out.println("[Add new service] : 0\n" +
                    "[Delete service]  : 1 \n" +
                    "[Service List]    : 2 \n" +
                    "[Exit]            : 3 \n");

            int token = Integer.parseInt(br.readLine());
            switch (token) {
                case 0:
                    System.out.println("Enter the name of the service, time, price: ");
                    String[] dataInput = br.readLine().split(" ");
                    try {
                        String name = dataInput[0];
                        int time = Integer.parseInt(dataInput[1]);
                        int price = Integer.parseInt(dataInput[2]);
                        int id = sr.addNewService(name, time, price);
                        System.out.println("Service was successfully added! Here's id:  " + id);
                    } catch (Exception e) {
                        System.err.println("!!Wrong input!!");
                    }
                    continue;
                case 1:
                    System.out.println("Enter Service id: ");
                    String[] dataInput1 = br.readLine().split(" ");
                    try {
                        int idService = Integer.parseInt(dataInput1[0]);
                        sr.deleteService(idService);
                        System.out.println("[Service was successfully deleted]");

                    } catch (Exception e) {
                        System.err.println("Error while deleting service.");
                    }
                    continue;
                case 2:
                    String collection = sr.getServiceList();
                    System.out.println(collection);
                    continue;
                case 3:
                    is_exit = true;
                    break;
            }
        }
    }
}