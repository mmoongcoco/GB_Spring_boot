package com.example.ex00.dependency;

import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@Data - 생성자 주입 안하기 (생성자 안에 초기화 생성자가 있음)

@Getter
@ToString
//@Setter => 안만들어놓고 사용
//@NoArgsConstructor -기본생성자만 초기화
//@AllArgsConstructor -모든거

// @RequiredArgsConstructor : 원하는 필드를 골라서 초기화 할 수 있도록 함.
@RequiredArgsConstructor //final ,NonNull 이라고 붙어 있는 애들
public class Coding {
//    필드 주입 (단위 테스트에서는 필드 주입을 사용하자)
//    문제점
//    1. 굉장히 편하게 주입할 수 있으나 순환 참조시 오류가 발생하지 않기 때문에 stackOverFlow 발생
//    2 . final 을 붙일 수 없기 때문에 다른 곳에서 변형가능
//    => 해결 생성자 주입
//    @Autowired - 필드 주입
//    @NonNull
    private final Computer computer; //의존관계에 있어서만 final 사용

//    fianal 을 한건 초기화를 해주야한다

//    생성자 주입***
//    순환 참조시 컴파일러 인지 가능. 오류 발생
//    메모리에 할당된면서 초기값으로 주입되므로 fianal 키워드 사용 가능. 다른 곳에서 변형 불가능
//    의존성 주입이 되지 않으면 객체가 생성되지 않으므로 NPE 방어
//    생성자에 @Autowired 생략 가능

//    @Autowired
//    public Coding(Computer computer){
//        this.computer = computer;
//    }
}


/*
* final 은 안에 값이 있어야함.
* 값은 변하지 않는 값
* 상수 -> 상수
* 상수를 정해놓지 않으면 선언이 불가능하다
*
* */