package com.grmkris.lightninggridlotteryback.exception;

public class RoundRunningException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // TODO add class of already running round to this exception?
    public RoundRunningException(String errorMessage){
        super("round is running!");
    }
}