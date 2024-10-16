package org.study.ultimate.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private final Lock lock = new ReentrantLock();
    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void increaseTotalBytes() {
        lock.lock();
        totalBytes++;
        lock.unlock();
    }
}