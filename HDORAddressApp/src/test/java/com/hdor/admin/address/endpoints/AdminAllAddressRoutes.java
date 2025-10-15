package com.hdor.admin.address.endpoints;

public class AdminAllAddressRoutes {
	
	public static String BASE_URL="https://apiv2.uat.hdor.com/registrations";
	
	//Admin Address Module

	public static String ALL_DELIVERY_ADDRESS=BASE_URL+"/admin/user/address/list";
	public static String ALL_BILLING_ADDRESS=BASE_URL+"/admin/user/address/list";
	public static String PRIMARY_ADDRESS=BASE_URL+"/admin/user/address/primary";
	public static String MARK_PRIMARY_ADDRESS=BASE_URL+"/admin/user/address/mark/primary";
	public static String SAVE_ADDRESS=BASE_URL+"/admin/user/address/save";
	public static String UPDATE_ADDRESS=BASE_URL+"/admin/user/address/save";
	public static String REMOVE_ADDRESS=BASE_URL+"/admin/user/address/remove";
	
}
