package com.jollypet.exer;

import java.util.ArrayList;
import java.util.List;

public class ListCollection_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Bands> bandList = new ArrayList<Bands>();
		
		Bands band1 = new Bands();
		band1.setAddress("Seattle");
		band1.setName("Nirvana");
		band1.setMemberNumber(4);
		band1.setLabel("Geffen");
		
		
		Bands band2 = new Bands();
		band1.setAddress("Seoul");
		band1.setName("NoBrain");
		band1.setMemberNumber(3);
		band1.setLabel("Drug");
		
		Bands band3 = new Bands("PearlJam", 4,"Seattle","Sony");
		
		bandList.add(band1);
		bandList.add(band2);
		bandList.add(band3);
		
		bandList.get(2).setAddress("Jeju");

		System.out.println(bandList.get(2).getName());
		System.out.println(bandList.get(2).getAddress());
		System.out.println(bandList.get(0).getAddress());

	}

}
