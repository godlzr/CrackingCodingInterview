package com.DataStructures.StacksQueuesTest;

import static org.junit.Assert.*;

import org.junit.Test;
import com.DataStructures.StacksQueues.HanoiTower;
public class HanoiTowerTest {

	@Test
	public void test() {
		HanoiTower hanoi = new HanoiTower(5);
		hanoi.printTowers();
		hanoi.HanoiApproach();
		System.out.println("Moving...");
		hanoi.printTowers();
		
	}

}
