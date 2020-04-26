package com.claramaria.android.samples.musicmachine;

import android.util.Log;

public class DownloadThread extends Thread {
    private static final String TAG = DownloadThread.class.getSimpleName();

    @Override
    public void run() {
        for (String song : PlayList.songs) {
            downloadSong();
        }
    }

    private void downloadSong() {
        long endTime = System.currentTimeMillis() + 10 * 1000;
        while (System.currentTimeMillis() < endTime) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Log.d(TAG, "Song downloaded");
    }
}
