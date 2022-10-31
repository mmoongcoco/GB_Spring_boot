package com.example.ex00.qualifier;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("vips")
@Getter
@ToString

public class Vips implements Resturant{
    @Override
    public boolean useSaladBar() {
        return true;
    }

//    public int stakePrice(){
//        return stakePrice+15000;
//    }

    private int stakePrice = Resturant.stakePrice+15000;
}
