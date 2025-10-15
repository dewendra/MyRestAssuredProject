package com.hdor.user.address.endpoints;

public class UserAllAddressRoutes {
	
	public static String BASE_URL="https://apiv2.uat.hdor.com/registrations";
	
	//User Address module
	
	public static String SAVE_ADDRESS=BASE_URL+"/user/address/save";
	public static String UPDATE_ADDRESS=BASE_URL+"/user/address/save";
	public static String REMOVE_ADDRESS=BASE_URL+"/user/address/remove";
	public static String MARK_PRIMARY_ADDRESS=BASE_URL+"/user/address/mark/primary";
	public static String PRIMARY_ADDRESS=BASE_URL+"/user/address/primary?type=delivery";
	public static String ALL_DELIVERY_ADDRESS=BASE_URL+"/user/address/list";
	public static String ALL_BILLING_ADDRESS=BASE_URL+"/user/address/list";

}
