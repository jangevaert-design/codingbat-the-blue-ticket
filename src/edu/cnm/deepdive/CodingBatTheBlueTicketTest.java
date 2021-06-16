package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CodingBatTheBlueTicketTest {

  private static int[][] blueParams = {
      {9, 1, 0},
      {9, 2, 0},
      {6, 1, 4},
      {6, 1, 5},
      {10, 0, 0},
      {15, 0, 5},
      {5, 15, 5},
      {4, 11, 1},
      {13, 2, 3},
      {8, 4, 3},
      {8, 4, 2},
      {8, 4, 1}
  };

  private static int[] blueExpected = {10, 0, 10, 0, 10, 5, 10, 5, 5, 0, 10, 0};

  @Test
  void blueTicket() {
    for (int i = 0; i < blueExpected.length; i++) {
      int actual = CodingBatTheBlueTicket.blueTicket(blueParams[i][0], blueParams[i][1], blueParams[i][2]);
      Assertions.assertEquals(actual, blueExpected[i]);

    }
  }

}