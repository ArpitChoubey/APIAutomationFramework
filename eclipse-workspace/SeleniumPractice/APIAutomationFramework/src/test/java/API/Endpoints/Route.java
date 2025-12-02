package API.Endpoints;

/*
Swagger URI → https://petstore.swagger.io

Create user (Post)    : https://petstore.swagger.io/v2/user
Get user (Get)        : https://petstore.swagger.io/v2/user/{username}
Update user (Put)     : https://petstore.swagger.io/v2/user/{username}
Delete user (Delete)  : https://petstore.swagger.io/v2/user/{username}

Pet Module:
Add Pet (POST)        : https://petstore.swagger.io/v2/pet
Get Pet (GET)         : https://petstore.swagger.io/v2/pet/{petId}
Update Pet (PUT)      : https://petstore.swagger.io/v2/pet
Delete Pet (DELETE)   : https://petstore.swagger.io/v2/pet/{petId}

Store Module:
Place Order (POST)    : https://petstore.swagger.io/v2/store/order
Get Order (GET)       : https://petstore.swagger.io/v2/store/order/{orderId}
Delete Order (DELETE) : https://petstore.swagger.io/v2/store/order/{orderId}
Check Inventory (GET) : https://petstore.swagger.io/v2/store/inventory
*/

public class Route {
	
	public static String base_url = "https://petstore.swagger.io/v2";

    // User module
    public static String post_url   = base_url + "/user";
    public static String get_url    = base_url + "/user/{username}";
    public static String update_url = base_url + "/user/{username}";
    public static String delete_url = base_url + "/user/{username}";
   
 // ---------------- Pet Module ----------------
    public static String add_pet       = base_url + "/pet";
    public static String get_pet       = base_url + "/pet/{petId}";
    public static String update_pet    = base_url + "/pet";
    public static String delete_pet    = base_url + "/pet/{petId}";

    // ---------------- Store Module ----------------
    public static String place_order   = base_url + "/store/order";
    public static String get_order     = base_url + "/store/order/{orderId}";
    public static String delete_order  = base_url + "/store/order/{orderId}";
    public static String inventory     = base_url + "/store/inventory";
}
