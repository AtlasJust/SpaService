public class SpaService {
    // instance variables for this class
    private String serviceDescription;
    private double price;

    //mutator and setter methods for this class
    public void setServiceDescription(String service){
        serviceDescription = service;
    }

    public void setPrice(double servicePrice)
    {
        price = servicePrice;
    }
    
    //accessor / getter methods for this class
    public String getServiceDescription()
    {
        return serviceDescription;
    }
    public double getPrice()
    {
        return price;
    }
    
}
