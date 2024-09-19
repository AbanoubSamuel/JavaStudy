package org.study.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalBytes;
    private final Lock lock = new ReentrantLock();

    public int getTotalBytes() {
        return totalBytes;
    }

    public void increaseTotalBytes() {
        lock.lock();
        totalBytes++;
        lock.unlock();
    }
}