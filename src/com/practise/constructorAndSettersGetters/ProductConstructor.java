package com.practise.constructorAndSettersGetters;


public class ProductConstructor {
	public int prod_id;
	public String mfg_date;
	public String exp_date;
	public String info;
	public int warrentry;
	boolean veg;

	public ProductConstructor(int prod_id, int warrentry) {
		this.prod_id = prod_id;
		this.warrentry = warrentry;
	}
	public ProductConstructor(boolean veg,String mfg_date,  String exp_date) {
		this.veg = veg;
		this.mfg_date = mfg_date;
		this.exp_date = exp_date;
		
	}
	
	public ProductConstructor(int prod_id, String manf_date, String exp_date, String info, int warrentry) {
		this.prod_id = prod_id;
		this.mfg_date = manf_date;
		this.exp_date = exp_date;
		this.info = info;
		this.warrentry = warrentry;
		
	}
	
	public static void main(String[] args) {
		ProductConstructor e1 = new ProductConstructor(312, "jan-2023", "aug-2030", "unAvailable", 2);
		ProductConstructor e2 = new ProductConstructor(768, "oct-2022", "feb-2025", "Loading...", 1);
		ProductConstructor e3 = new ProductConstructor(666, "aug-2060", "sept-2080", "please try later", 3);
		
		
		
		System.out.println(e1.prod_id);
		System.out.println(e1.mfg_date);
		System.out.println(e1.exp_date);
		System.out.println(e1.info);
		System.out.println(e1.warrentry);
		
		ProductConstructor e4 = new ProductConstructor(419, 1);
		System.out.println(e1.prod_id);
		System.out.println(e1.warrentry);
		
		ProductConstructor food = new ProductConstructor(true, "may-2023","24 months from mfg");
		System.out.println(food.veg);
		System.out.println(food.mfg_date);
		System.out.println(food.exp_date);
	}
}
		
