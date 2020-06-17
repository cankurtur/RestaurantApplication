package restaurantapplication;

public class LoginProcess {
   
    
   Database db = new Database(); 
   
    public boolean loginProcess(String username, String password){
        
        if (username.equals(db.getUsername()) && password.equals(db.getPassword())){
            return true;
        }else{
            return false;
        }
        
}
    
  
   
   
   
   
   
   
   
}
