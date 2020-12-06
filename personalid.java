package personalid;

public class personalid {
	private String number;
    //creating construcor
	public personalid(String cN) {
        //this will delete / from our identification number for example from this number "736028/5163" we will get "7360285163"
		this.number = cN.replaceAll("[/]", "");
		;

	}
    // finding out if user is male or female since its coded into month number of our identification number. 
    // if month is for example 62 its female number since all females have +50 to their month.
    
	public String getGender() {
        //creating string which will only read second and third number of our identification
        String idk = number.substring(2, 4);
        //parsing string into int
		int i = Integer.parseInt(idk);
        //if our month is higher than 30 we will return female
		if (i > 30) {
			return "Female";
        //if month is lower than 30 we will return male
		} else
			return "Male";

	}
        //validating if identification number is valid 
	public String validate() {

        //checking if our number Is divisible by 3.( This Is way how to find out if our number Is valid you can learn more here: https://cs.m.wikipedia.org/wiki/Rodn%C3%A9_%C4%8D%C3%ADslo )
		if (number %% 3 == 11) {
			return number;
		}
            //returnig error
		else
			return "invalid number";

	}
        //getting year from our number
	public String getYear() {
        //again creating string just with two numbers we need and parsing it into int
		String rokk = number.substring(0, 2);
        int f = Integer.parseInt(rokk);
        //if our year is higher than 20 we will assume the person was born before year 2000
		if (f > 20) {
            
            //we will return 19 and our number for example 75(example where we were born 1975) so it will print in our main 1975
			return "19" + f;
       
        }
         //if our year is lower than 10 we will assume this person was born around years 2000 to 2009()
		if (f < 10) {
            //returning 200 since i couldnt make it work otherwise so if we were born 2001 this will print 2001
			return "200" + f;
		}
        //if our year is higher than 9 and lower than 20 we will print 20
        else
        //printing 20 so if we were born 2010 this will print 2010
			return "20" + f;

	}
    //getting month
	public int getMonth() {
        //again creating string and parsing it into int
        //since in month we dont have to compare anything we will return our int u and we will use it in our switch in main to print entire name of month
		String mess = number.substring(2, 4);
		int u = Integer.parseInt(mess);
		return u;
	}
    //getting day
	public int getDay() {
        //again creating string and parsing it into int
    //same as month we dont have to compare anything so we will just return our day(we dont even have to use it in switch since its day)
		String mess = number.substring(4, 6);
		int xd = Integer.parseInt(mess);
		return xd;
    }
    //simple getter to obtain number in main since its made private(its only used for our debug)
	public String getNumber() {
		return number;
	}

}
