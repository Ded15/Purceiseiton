package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerAfishaTest {

    @Test

    public void addendum (){
        ManagerAfisha repo = new ManagerAfisha();
        repo.add("film1");
        repo.add("film2");
        repo.add("film3");
        repo.add("film4");
        repo.add("film5");


        String[] expected = {"film1","film2","film3","film4","film5"};
        String[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    public void outputOfTheLastMovie (){
        ManagerAfisha repo = new ManagerAfisha();
        repo.add("film1");
        repo.add("film2");
        repo.add("film3");
        repo.add("film4");
        repo.add("film5");


        String[] expected = {"film5","film4","film3","film2","film1"};
        String[] actual = repo.findLast();

        Assertions.assertArrayEquals(expected,actual);
    }
}
