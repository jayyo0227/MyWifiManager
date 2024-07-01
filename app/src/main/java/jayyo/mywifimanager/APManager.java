package jayyo.mywifimanager;

import android.net.wifi.WifiManager;
import android.os.Build;
import android.util.Log;

import androidx.annotation.RequiresApi;

@RequiresApi(api = Build.VERSION_CODES.O)
public class APManager extends WifiManager.LocalOnlyHotspotCallback {
    private static final String TAG = "APManager";
    private static int hotspotConnections = 0;

    @Override
    public void onStarted(WifiManager.LocalOnlyHotspotReservation reservation) {
        hotspotConnections++;
        Log.i(TAG, String.valueOf(hotspotConnections));
        super.onStarted(reservation);
    }

    @Override
    public void onStopped() {
        hotspotConnections--;
        Log.i(TAG, String.valueOf(hotspotConnections));
        super.onStopped();
    }
}
