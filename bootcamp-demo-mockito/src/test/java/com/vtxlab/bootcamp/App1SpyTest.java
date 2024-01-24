package com.vtxlab.bootcamp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class App1SpyTest {

  @Spy
  private App2 app2; // During the UT, there is an objected created for app2

  @InjectMocks
  private App1 app1;

  @Test
  void testMultiply() {
    // If we just mock provider2(), provider() is still working normally (due to Spy)
    when(this.app2.provider2(8, 2)).thenReturn(105);
    int actual = this.app1.mulitply(8, 2);
    assertEquals(109, actual); // 8 / 2 + 105;
  }

}