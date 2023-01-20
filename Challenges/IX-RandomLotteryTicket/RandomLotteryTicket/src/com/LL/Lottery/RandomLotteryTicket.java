package com.LL.Lottery;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomLotteryTicket {
    private Integer minNumber;
    private Integer maxNumber;
    private Integer amountNumbersPerTicket;
    List<Integer> listLotteryTickets;

    public RandomLotteryTicket(Integer minNumber, Integer maxNumber, Integer amountNumbersPerTicket){
        this.minNumber = minNumber;
        this.maxNumber = maxNumber;
        this.amountNumbersPerTicket = amountNumbersPerTicket;
        this.listLotteryTickets = new ArrayList<>();
    }

    public int getRandomNumber(){
        int randomNumber = (int)(Math.random()* this.maxNumber - this.minNumber + 1);
        return randomNumber;
    }

    public List<Integer> ticketNumbers(){

        for (int i = 0; i < amountNumbersPerTicket; i++){
            int num = getRandomNumber();
            while (listLotteryTickets.contains(num)){
                num = getRandomNumber();
            }
            listLotteryTickets.add(num);
            Collections.sort(listLotteryTickets);
        }

        return listLotteryTickets;
    }



}
