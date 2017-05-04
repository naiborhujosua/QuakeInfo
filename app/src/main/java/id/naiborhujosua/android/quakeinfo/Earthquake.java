package id.naiborhujosua.android.quakeinfo;


/**
 * Created by dell on 5/3/2017.
 */

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMillisceonds;
    private String mUrl;

    public Earthquake(double magnitude, String location, long timeInMillisceonds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMillisceonds = timeInMillisceonds;
        mUrl = url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMillisceonds() {
        return mTimeInMillisceonds;
    }

    public String getUrl() {
        return mUrl;
    }
}
