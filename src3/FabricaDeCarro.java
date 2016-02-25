
public class FabricaDeCarro {
          
	private static FabricaDeCarro instance ;
          
 private FabricaDeCarro(){ 
 }

 public static synchronized FabricaDeCarro getInstance(){
	   if (instance == null)
		   instance = new FabricaDeCarro() ;
	   return instance;
 } 

}
