package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ToMilesAdapter toMilesAdapter =new ToMilesImplentation(new Havekilometer());
        System.out.println(toMilesAdapter.meter());
    }
}
