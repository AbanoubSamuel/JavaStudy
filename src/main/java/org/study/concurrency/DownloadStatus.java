package org.study.concurrency;

public class DownloadStatus {
    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void increaseTotalBytes() {
        totalBytes++;
    }
}