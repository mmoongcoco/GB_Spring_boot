package com.example.ex00.qualifier;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("outback")
@Getter
@ToString
@Primary
public class Outback implements Resturant{
    @Override
    public boolean useSaladBar() {
        return false;
    }

    private int stakePrice = Resturant.stakePrice+10000;

//    public int stakePrice() {
//        return stakePrice-10000;
//    }

}
