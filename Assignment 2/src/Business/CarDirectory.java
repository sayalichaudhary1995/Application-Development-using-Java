/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author sayu
 */
public class CarDirectory {
    private ArrayList<Car> carList;

    public CarDirectory() {
        this.carList=new ArrayList<Car>();   
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }
    

    public Car addCar(){
        Car car = new Car();
        carList.add(car);
        return car;
    }
    
    public void deleteCar(Car car){
    carList.remove(car);
            
    }
     public ArrayList<Car> brandCarList(String brand)
    {
        ArrayList<Car> list2= new ArrayList<Car>();
        for(Car car: this.getCarList())
        
         {
             if(car.getbrand().equalsIgnoreCase(brand))
             {
                 list2.add(car);
                 
             }
             
        }
        return list2;
    }
    public ArrayList<Car> cityCarlist(String city)
    {
        ArrayList<Car> list2= new ArrayList<Car>();
        for(Car car: this.getCarList())
        {
            if(car.getCity().equalsIgnoreCase(city) && car.getAvailablity().equalsIgnoreCase("Yes"))
            {
                list2.add(car);
            }
            
        }return list2;
    }
    
   
    public ArrayList<Car> manufactureYearCar(int manufactureYear ) 
    {
        ArrayList<Car> list2 = new ArrayList<Car>();
        for (Car car : this.getCarList())
        {
            if(car.getManufactureYear()==(manufactureYear))
            {
                list2.add(car);
            }
        }
        return list2;
    }
     public ArrayList<Car> modelNoList(String modelNo)
    {
        ArrayList<Car> list2 = new ArrayList<Car>();
        for (Car car : this.getCarList())
        {
            if(car.getmodelNo().equalsIgnoreCase(modelNo))
            {
                list2.add(car);
            }
        }
        return list2;
    }
    public ArrayList<Car> serialNoList(String serialNo)
    {
        ArrayList<Car> list2 = new ArrayList<Car>();
        for (Car car : this.getCarList())
        {
            if(car.getserialNo().equalsIgnoreCase(serialNo))
            {
                list2.add(car);
            }
        }
        return list2;
    }
    
    public ArrayList<Car> expiredCertificate(String maintenanceCertificate)
    {
        ArrayList<Car> list2 = new ArrayList<Car>();
        for (Car car : this.getCarList())
        {
            if(car.getmaintenanceCertificate().equalsIgnoreCase(maintenanceCertificate))
            {
                list2.add(car);
            }
        }
        return list2;
    }
    
    
    public ArrayList<Car> uberUsedCarList(String registeredwithUber)
    {
        ArrayList<Car> list2 = new ArrayList<Car>();
        for (Car car : this.getCarList())
        {
            if(car.getregisteredwithUber().equalsIgnoreCase(registeredwithUber))
            {
                list2.add(car);
            }
        }
        return list2;
    }
    
   
    public ArrayList<Car> minMaxseatsCount(int minSeat, int maxSeats)
    {
        ArrayList<Car> list2 = new ArrayList<Car>();
        for (Car car : this.getCarList())
        {
            if(car.getSeatCount() < maxSeats && car.getSeatCount() > minSeat && car.getAvailablity().equalsIgnoreCase("Yes"))
            {
                list2.add(car);
            }
        }
        return list2;
    }
    
    public ArrayList<Car> firstAvailable(String availablity)
    {
        ArrayList<Car> list2 = new ArrayList<Car>();
        for (Car car : this.getCarList())
        {
            if(car.getAvailablity().equalsIgnoreCase("Yes"))
            {
                list2.add(car);
                break;
            }
        }
        return list2;
    }
    
    public ArrayList<Car> allAvailable(String availablity)
    {
        ArrayList<Car> list2 = new ArrayList<Car>();
        for (Car car : this.getCarList())
        {
            if(car.getAvailablity().equalsIgnoreCase("Yes"))
            {
                list2.add(car);
            }
        }
        return list2;
    }
    
    public ArrayList<Car> unavailableCar(String availablity)
    {
        ArrayList<Car> list2 = new ArrayList<Car>();
        for (Car car : this.getCarList())
        {
            if(car.getAvailablity().equalsIgnoreCase("No"))
            {
                list2.add(car);
            }
        }
        return list2;
    }
    
}
