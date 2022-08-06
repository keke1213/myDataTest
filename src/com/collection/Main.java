package com.collection;

import java.lang.reflect.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
		String[] storageOnSql = {"Apple", "Meat", "Milk", "Cake", "Note", "Beer", "Phone", "TV"};
		int[] countOnSql = {90, 80, 70, 60, 50, 40, 30, 20};
		String[] saleOnSql = {"Apple", "Meat"};
		int[] numsOnSql = {50, 60};
        
		Map<String, Integer> storage = new HashMap<>();
		for (int i = 0; i < storageOnSql.length; i++) {
			storage.put(storageOnSql[i], countOnSql[i]);
		}
		Map<String, Integer> sale = new HashMap<>();
		for (int i = 0; i < saleOnSql.length; i++) {
			sale.put(saleOnSql[i], numsOnSql[i]);
		}
		Products p = new Products(storage, sale);

		String s = sc.nextLine().trim().replace("[", "").replace("]", "");
		String[] on = s.split(",");

		s = sc.nextLine().trim().replace("[", "").replace("]", "");
		String[] sell = s.split(",");

		System.out.println("Storage: " + p.readStorage() + "\nSale: " + p.readSale());
		
		for (int i = 0; i < on.length; i++) {
			String[] kv = on[i].split(":");
			String k = kv[0].trim();
			int v = Integer.parseInt(kv[1].trim());
			System.out.println("On sale: " + k + " : " + v + ", " + p.onSale(k, v));
		}
		
		for (int i = 0; i < sell.length; i++) {
			String[] kv = sell[i].split(":");
			String k = kv[0].trim();
			int v = Integer.parseInt(kv[1].trim());
			System.out.println("Sell out: " + k + " : " + p.sellOut(k, v));
		}
		
		System.out.println("Storage: " + p.readStorage() + "\nSale: " + p.readSale());
        sc.close();
		
	}
}