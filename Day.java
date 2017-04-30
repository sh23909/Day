
public class Day {
    private String [] days = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
    private int day;
    private boolean error=false;
   
    public Day() {
        day=0;
    }

    /**
     *
     * @param day
     */
    public Day(int day) {
    	int i= indexOfDay(day);
        if(i!=7){
        	this.day=i;
        }else{
        	error=true;
        }
        
    }
    /*
     * declare indexofDay
     * */
    private int indexOfDay(int day){
    	int i=0;
    	while(i<this.days.length){
    		if(this.days[i].equals(day)){
    			return i;
    		}
    		i++;
    	}
    	return i;
    }

    /**
     * To get the current day
     * @return returns current day
     */
    public String getDay(){
        return days[this.day];
    }

    public void setDay(int day){
     	int i= indexOfDay(day);
        if(i!=7){
        	this.day=i;
        }else{
        	error=true;
        }
        
    }
    /*
     * next day
     * */
    public String nextDay(){
        return days[(this.day+1)%7];
    }
    /*
     * previous day
     * */
    public String previousday(){
    	int i=(this.day==0)?(this.days.length-1):(this.day-1);
    	
    	return days[i];
    }
    /*calculate -10 day from today
     * 
     * */
    
    public String calculateDay(int daya){
    	int i;
    	if(daya>=0){
    		i=(this.day+1)%7;
    	}else{
    		i=(this.day==0)?(7-Math.abs(daya)%7):(this.day+(7-Math.abs(daya%7)));
    	}
    	return days[i];
    	}
    
    /*
     * tostring
     * */

    public String toString() {
        return "Current day is :" + days[this.day];
    }
}