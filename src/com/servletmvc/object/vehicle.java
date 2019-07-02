package com.servletmvc.object;

public class vehicle {

	private String vehicle_id;
	private String vehicle_no;
	private String vehicle_make;
	private String vehicle_model;
	private String vehicle_year;
	private String vehicle_owner;
	
	
	public vehicle() {
		super();
	}
	public vehicle(String vehicle_id, String vehicle_no, String vehicle_make, String vehicle_model,
			String vehicle_year,String vehicle_owner) {
		super();
		this.vehicle_id = vehicle_id;
		this.vehicle_no = vehicle_no;
		this.vehicle_make = vehicle_make;
		this.vehicle_model = vehicle_model;
		this.vehicle_year = vehicle_year;
		this.vehicle_owner = vehicle_owner;
	}
	public String getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(String vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getVehicle_no() {
		return vehicle_no;
	}
	public void setVehicle_no(String vehicle_no) {
		this.vehicle_no = vehicle_no;
	}
	public String getVehicle_make() {
		return vehicle_make;
	}
	public void setVehicle_make(String vehicle_make) {
		this.vehicle_make = vehicle_make;
	}
	public String getVehicle_model() {
		return vehicle_model;
	}
	public void setVehicle_model(String vehicle_model) {
		this.vehicle_model = vehicle_model;
	}
	public String getVehicle_year() {
		return vehicle_year;
	}
	public void setVehicle_year(String vehicle_year) {
		this.vehicle_year = vehicle_year;
	}
	public String getVehicle_owner() {
		return vehicle_owner;
	}
	public void setVehicle_owner(String vehicle_owner) {
		this.vehicle_owner = vehicle_owner;
	}
	
	
}
