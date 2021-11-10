package com.company;

public class ToMilesImplentation implements ToMilesAdapter {
    private kilometer kilometer;

    public ToMilesImplentation(kilometer kilometer) {
        this.kilometer = kilometer;
    }


    @Override
    public double meter() {
        return kilometer.meter()/1.609;
    }
}
