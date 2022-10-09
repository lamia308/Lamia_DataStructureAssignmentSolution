package com.lamia.question1.main;

import java.io.IOException;
import java.util.Scanner;

import com.lamia.question1.service.Service;



public class Main {

	public static void main(String[] args) throws IOException{
		
		int noOfFloor;
		int[] floors;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the total number of floors in the building:");
		
		noOfFloor= sc.nextInt();
		floors= new int[noOfFloor];
		
		for (int i=0; i<noOfFloor; i++) {
			
			System.out.println("enter the floor size given on day:"+(i+1));
			floors[i]= sc.nextInt();
		}
		
		System.out.println();
		
		Service service = new Service();
		service.ConstructionTable(floors);

	}

}
