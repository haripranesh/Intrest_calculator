package RDAccount;
import com.wipro.bank.acc.*;
public class RDAccount extends Account {
    
    public RDAccount(int tenure,float principal){
        this.tenure=tenure;
        this.principal=principal;
    
}
    
    public float calculateInterest()
    {
        float r=rateOfInterest/100;
	float n=4;
	float x=1+r/n;
	int rem=tenure*12;
	float sum=0;
	for(float i=rem;i>=0;i--)
        {
            float t=i/12;
            sum=(float)(sum+(principal*(Math.pow(x,n*t)-1)));
	}
        return sum;        
    }
    
    public float calculateAmountDeposited()
    {
        return (principal*tenure*12);
    }
    
    
    
}
