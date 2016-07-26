package edu.cmu.chimps.musictrackingservice;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;

/**
 * Created by fanglinchen on 3/9/16.
 */

public class TrackingService extends AccessibilityService {


    @Override
    public void onInterrupt() {
        // ignore
    }

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        Log.e("event", event.toString());
    }
}
