package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    //00NM -< 01N
    @Test
    void should_go_to_0_1_N_when_execute_command_given_0_0_N_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "N");
        //when
        marsRover.executeCommon("M");
        //then
        assertEquals("0 1 N",marsRover.getStatus());

    }
    //00EM -< 01E
    @Test
    void should_go_to_0_1_N_when_execute_command_given_0_0_E_and_M() {
        //given
        MarsRover marsRover = new MarsRover(0,0, "E");
        //when
        marsRover.executeCommon("M");
        //then
        assertEquals("1 0 E",marsRover.getStatus());
    }
}
