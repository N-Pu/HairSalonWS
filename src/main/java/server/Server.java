package server;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.Map;
import javax.xml.ws.Endpoint;
import java.util.HashMap;
import java.util.Vector;

@WebService
public class Server {
    private Map<Integer, String> serviseList = new HashMap<>();
    private Map<Integer, Integer> cutlist = new HashMap<>();
    private Vector<Integer> timeNotes = new Vector<Integer>();

    public static final int port = 8080;

    public static void main(String[] args) {
        Server server = new Server();
        String url = String.format("http://localhost:%d/HairSalonWS", port);
        Endpoint.publish(url, server);
    }

    @WebMethod
    public int AddNewService(String name, int time, int price) throws Exception {
        int id = IdMakerForStaff(time, price);
        serviseList.put(id, "<Service name> :" + name + "\n<Time> :" + time + "\n<Price> :" + price + "\n<id> :" + id + "\n");


        return id;
    }


    @WebMethod
    public void DeleteService(int id) throws Exception {
        if ((serviseList.get(id) == null))
            System.err.println("\n!!List is empty.Please add new service!!");
        else
            serviseList.remove(id);
    }

    //random hashcode command
    //yeah, it isn't that great
    //but still usable
    @WebMethod
    public int IdMakerForStaff(int time, int price) {
        int id = time * 453 + price * 1000 + 7;

        return id;
    }

    //another random hashcode command
    //yeah, I know
    @WebMethod
    public int IdMakerForClient(int day, int hour, int month) {
        int id = day * 10300 + month * 1000 + 700 - hour * 3;

        return id;
    }

    //method for both client and staff
    @WebMethod
    public String GetServiceList() throws Exception {
        String collection = "[Service list] : \n";
        for (String str : serviseList.values()) {
            collection += str + "\n";
        }
        return collection;
    }

    @WebMethod
    public String GetFreeTime(int day, int month, int year) throws Exception {
        String getTime = "";

        if (day > 31 || day < 1) {
            throw new Exception("!!Wrong day!!\n");
        }
        if (month < 1 || month > 12) {
            throw new Exception("!!Wrong month!!\n");
        }
        if (year < 2000 || year > 2022) {
            throw new Exception("!!Wrong year!!\n");
        } else {

            for (int i = 8; i < 20; i++) {
                getTime += "Time -> " + i + ":00\n";
            }

        }
        return getTime;
    }

    @WebMethod
    public String GetAHairCut(int day, int month, int year, int hour, int idService) throws Exception {
//        serviseList.values(id).to;
        if (TimeChecker(hour)) {

            int idNote = IdMakerForClient(day, hour, month);
            cutlist.put(idNote, idService);
            String getHair = "[Service id] :" + idService + " [Your personal id] :" + idNote;
            return getHair;
        } else
            throw new Exception("!!Time is already booked!!");

    }

    @WebMethod
    public boolean TimeChecker(int checkTime) throws Exception {
//        j = this.timer[i];
//        if (timer == j) ;
        for (int time = 0; time < timeNotes.size(); ++time) {
            if (time == checkTime) {
                throw new Exception("!!This time is already booked!!");
                // break;
            } else {
                timeNotes.add(checkTime);
            }
        }
        return true;
    }

    @WebMethod
    public void DeleteBooking(int bookingId) {
        cutlist.remove(bookingId);
        System.out.println("[You've canceled booking.]");

    }

}