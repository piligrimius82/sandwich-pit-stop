package com.teamdelta.sandwichpitstop.util;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import com.teamdelta.sandwichpitstop.dm.BreadEnum;
import com.teamdelta.sandwichpitstop.dm.CheeseEnum;
import com.teamdelta.sandwichpitstop.dm.DressingEnum;
import com.teamdelta.sandwichpitstop.dm.Sandwich;
import com.teamdelta.sandwichpitstop.dm.SandwichStatusEnum;
import com.teamdelta.sandwichpitstop.dm.SubstanceEnum;

public class DataUtil {

	private static Random random = new Random();
	
	public static Set<Sandwich> getRandomSandwiches() {
		Set<Sandwich> sandwiches = new HashSet<>();
		for(int i = 0; i < random.nextInt(3) + 2; i++) {
			sandwiches.add(getRandomSandwich());
		}
		return sandwiches;
	}
	
	public static Sandwich getRandomSandwich() {
		Sandwich sandwich = new Sandwich();
		sandwich.setBread(randomEnum(BreadEnum.class));
		sandwich.setCheese(randomEnum(CheeseEnum.class));
		sandwich.setDressing(randomEnum(DressingEnum.class));
		sandwich.setLettuce(Math.random() < .5);
		sandwich.setOnions(Math.random() < .5);
		sandwich.setStatus(randomEnum(SandwichStatusEnum.class));
		sandwich.setSubstance(randomEnum(SubstanceEnum.class));
		sandwich.setTomatos(Math.random() < .5);
		return sandwich;
	}
	
	public static <E> E randomEnum(Class<E> type) {
		E[] constants = type.getEnumConstants();
		return constants[random.nextInt(constants.length)];
	}
	
}
