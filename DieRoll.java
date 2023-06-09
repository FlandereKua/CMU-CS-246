import java.util.*;
public class DieRoll {
    private int ndice;
    private int nsides;
    private int bonus;  // "//" private int bonus -> so delete "//";
    private static Random rnd;
    static{
	rnd=new Random();
    }
    
    /*public Die_Roll(int ndice,
	   int nsides,
	   int bonus)*/ 
    
    // code optimization
    public DieRoll(int ndice,int nsides,int bonus) 
    
    {
	this.ndice=ndice;
	this.nsides=nsides;
	this.bonus=bonus;
    }
    
    
    public RollResult makeRoll() {
	RollResult r=new RollResult(bonus);
	for(int i=0; i < ndice; i++) {
	    int roll=rnd.nextInt(nsides)+1;  // int roll = rndnextInt(nsides) + 1;  -> add "." to rndnextInt for correct code 
	    r.addResult(roll);
	}
	return r;
    }
    public String toString() {
	String ans = ndice + "d" + nsides;
	if(bonus > 0) {
	    ans = ans + "+" + bonus;
	}
	else if(bonus < 0) {
	    ans= ans + bonus;
	}
	return ans;
    }
};
