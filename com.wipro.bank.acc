package com.wipro.bank.acc;
public abstract class Account {
    
    public int tenure;
    public float principal;
    public float rateOfInterest;
    
    public void setInterest(int age, String gender)
    {
        if(gender.equals("male"))
        {
            if(age<60)
            {
               rateOfInterest=9.8f; 
            }
            else if(age>=60)
            {
               rateOfInterest=10.5f;  
            }
        }
        else if(gender.equals("female"))
        {
            if(age<58)
            {
               rateOfInterest=10.2f; 
            }
            else if(age>=58)
            {
               rateOfInterest=10.8f;  
            }
        }
    }
    
   public float calculateMaturityAmount(float totalPrincipleDeposited,float maturityInterest)
	{
            return totalPrincipleDeposited+maturityInterest;
        }
   
    public abstract float calculateInterest();
    public abstract float calculateAmountDeposited();
}


