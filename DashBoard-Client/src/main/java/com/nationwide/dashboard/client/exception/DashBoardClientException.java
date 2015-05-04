package com.nationwide.dashboard.client.exception;

/**
 * Created by abdelm2 on 5/4/2015.
 */
public class DashBoardClientException extends Exception {
    public DashBoardClientException(String s) {
        super(s);
    }

    public DashBoardClientException(Exception e) {
        super(e);
    }
}
