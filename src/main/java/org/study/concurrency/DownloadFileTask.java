package org.study.concurrency;

public class DownloadFileTask implements Runnable {
    private final DownloadStatus status;

    public DownloadFileTask() {
        this.status = new DownloadStatus();
    }

    @Override
    public void run() {
        System.out.println("Downloading a file: " + Thread.currentThread()
                                                          .getName());
        for (int i = 1; i <= 10_0000; i++) {
            if (Thread.currentThread()
                      .isInterrupted()) {
                return;
            }
            status.increaseTotalBytes();
        }
        System.out.println("Thread completed: " + Thread.currentThread()
                                                        .getName());
    }

    public DownloadStatus getStatus() {
        return status;
    }
}