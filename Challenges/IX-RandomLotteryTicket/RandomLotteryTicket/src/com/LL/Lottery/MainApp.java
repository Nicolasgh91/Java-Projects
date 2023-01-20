package com.LL.Lottery;


public class MainApp {
    public static void main(String[] args) {

        RandomLotteryTicket ticketOne = new RandomLotteryTicket(1,50,5);

        System.out.println(ticketOne.ticketNumbers());


    }
}
