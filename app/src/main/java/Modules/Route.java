package Modules;

import com.google.android.gms.maps.model.LatLng;

import java.util.List;

/**
 * Created by Jayesh on 03-06-2017.
 */
public class Route {
    public Distance distance;
    public Duration duration;
    public String endAddress;
    public LatLng endLocation;
    public String startAddress;
    public LatLng startLocation;
    public Bus bus;
    public BusDeparture busDeparture;
    public BusArrival busArrival;
    public ArrivalStop arrivalStop;
    public DepartureStop departureStop;
    public BusStops busStops;

    public List<LatLng> points;
}
