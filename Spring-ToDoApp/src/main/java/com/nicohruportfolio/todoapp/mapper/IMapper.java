package com.nicohruportfolio.todoapp.mapper;

public interface IMapper <I,O> {
    // I Inicial Object
    // O Output Object

    // So the Inicial Object needs to be mapped/converted into the Output Object
    public O map (I in);
}
