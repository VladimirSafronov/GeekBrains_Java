import java.util.*;

//class UndergroundSystem {
//    Map<Integer, ArrivalInfo> trips;
//    Map<String, double[]> totalInfo;
//
//    public UndergroundSystem() {
//        trips = new HashMap<>();
//        totalInfo = new HashMap<>();
//    }
//
//    public void checkIn(int id, String stationName, int t) {
//        trips.put(id, new ArrivalInfo(id, stationName, t));
//    }
//
//    public void checkOut(int id, String stationName, int t) {
//        ArrivalInfo arrival = trips.get(id);
//        String way = arrival.stationName + "->" + stationName;
//        int timeTrip = t - arrival.time;
//        double[] timeAndTrips = totalInfo.getOrDefault(way, new double[2]);
//        timeAndTrips[0] += timeTrip;
//        timeAndTrips[1]++;
//        totalInfo.put(way, timeAndTrips);
//    }
//
//    public double getAverageTime(String startStation, String endStation) {
//        String key = startStation + "->" + endStation;
//        double[] pair = totalInfo.get(key);
//        return pair[0] / pair[1];
//    }
//
//    class ArrivalInfo {
//        int id;
//        String stationName;
//        int time;
//
//        ArrivalInfo (int id, String stationName, int time) {
//            this.id = id;
//            this.stationName = stationName;
//            this.time = time;
//        }
//    }
//}



//public class UndergroundSystem {
//    Map<String, Map<String, List<Trip>>> stationsTrip = new HashMap<>();
//    Map<Integer, Trip> activeTrips = new HashMap<>();
//
//    public UndergroundSystem() {
//    }
//
//    public void checkIn(int id, String stationName, int t) {
//        Trip trip = new Trip(id, stationName, null, t, 0);
//        activeTrips.put(trip.customerId, trip);
//    }
//
//    public void checkOut(int id, String stationName, int t) {
//        stationsTrip.put(activeTrips.get(id).startStation, stationName,
//                new Trip(id, activeTrips.get(id).startStation, stationName, activeTrips.get(id).startTime, t));
//    }
//
//    public double getAverageTime(String startStation, String endStation) {
//        return 0;
//    }
//
//    class Trip {
////        int tripId;
//        int customerId;
//        String startStation;
//        String endStation;
//        int startTime;
//        int endTime;
//
//        Trip(int customerId, String startStation, String endStation, int startTime, int endTime) {
////            this.tripId = tripId;
//            this.customerId = customerId;
//            this.startStation = startStation;
//            this.endStation = endStation;
//            this.startTime = startTime;
//            this.endTime = endTime;
//        }
//    }
//}