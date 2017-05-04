package id.naiborhujosua.android.quakeinfo;

import android.content.Context;
import android.content.AsyncTaskLoader;

import java.util.List;


/**
 * Created by dell on 5/3/2017.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {


    private  static final String LOG_TAG = EarthquakeLoader.class.getName();
    private String mUrl;

    public EarthquakeLoader(Context context,String url) {
        super(context);
        mUrl =url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        if (mUrl == null){
            return null;
        }

        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(mUrl);
        return earthquakes;
    }
}
