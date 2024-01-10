package com.mocadev.hellospring.controller;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HighLoadController {

	@GetMapping("/high-load-cpu")
	public int highLoadCpu() {
		int sum = 0;

		// 랜덤한 수를 뽑아서 더하는 연산
		for (int i = 0; i < 20_000_000; i++) {
			int randomInt = ThreadLocalRandom.current().nextInt();

			sum = sum + randomInt;
		}

		return sum;
	}

	@GetMapping("/high-load-memory")
	public int highLoadMemory() {
		ArrayList<Integer> memoryIntensiveList = new ArrayList<>();

		for (int i = 0; i < 500_000; i++) {
			// int를 추가하는 과정에서 새로운 Integer 래퍼 클래스 인스턴스 생성
			memoryIntensiveList.add(i);
		}

		return memoryIntensiveList.size();
	}
}
